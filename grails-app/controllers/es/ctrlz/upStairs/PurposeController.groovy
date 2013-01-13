package es.ctrlz.upStairs
import grails.plugins.springsecurity.Secured

@Secured(['ROLE_USER'])
class PurposeController {

	def springSecurityService

    def index() {
		def purposeList = Purpose.withCriteria {
			eq("user", springSecurityService.currentUser)
			order("dateCreated", "asc")
		}
		[purposeList: purposeList]
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
		def purpose = Purpose.get(params.id)
		if (purpose) {
			def currentUser = springSecurityService.currentUser
			def effortList = Effort.withCriteria {
				eq("purpose", purpose)
				order("date", "asc")
			}
			[purpose: purpose, effortList: effortList, currentUser: currentUser]
		} else {
			flash.message = message code: 'purpose.message.notFound'
			flash.type = 'error'
			render view: 'index'
		}
	}
}
