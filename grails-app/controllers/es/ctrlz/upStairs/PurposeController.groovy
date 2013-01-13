package es.ctrlz.upStairs
import grails.plugins.springsecurity.Secured

@Secured(['ROLE_USER'])
class PurposeController {

	def springSecurityService

    def index() {
		[purposeList: springSecurityService.currentUser.purposes]
	}

	def create() { }

	def save() {
		def purpose = new Purpose()
		Purpose.withTransaction { tx ->
			try {
				purpose.properties = params.purpose
				purpose.user = springSecurityService.currentUser
				purpose.save(failOnError: true)
				flash.message = message code: 'purpose.message.success'
				log.info "Purpose ${purpose.name} created by ${purpose.user.username}"
			} catch (Exception e) {
				log.error e
				tx.setRollbackOnly()
				flash.message = message code: 'purpose.message.error'
				flash.type = 'error'
			}
		}

		if (flash.type == 'error') {
			redirect action: 'index'
		} else {
			redirect action: 'show', id: purpose.id
		}
	}

	def show() {
		// No contempla owners
		def purpose = Purpose.get(params.id)
		if (purpose) {
			[purpose: purpose]
		} else {
			flash.message = message code: 'purpose.message.notFound'
			flash.type = 'error'
			render view: 'index'
		}
	}
}
