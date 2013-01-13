package es.ctrlz.upStairs

class PurposeController {

	def springSecurityService
	def purposeService

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
			} catch (Exception e) {
				tx.setRollbackOnly()
				flash.message = message code: 'purpose.message.error'
				flash.type = 'error'
			}
		}

		if (flash.type == 'error') {
			render view: 'index'
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
