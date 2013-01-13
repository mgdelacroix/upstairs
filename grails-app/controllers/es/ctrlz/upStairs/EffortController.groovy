package es.ctrlz.upStairs
import grails.plugins.springsecurity.Secured

@Secured(['ROLE_USER'])
class EffortController {

	def save() {
		def effort = new Effort()
		Effort.withTransaction { tx ->
			try {
				params.effort.purpose = Purpose.get(params.purposeId)
				effort.properties = params.effort
				effort.save(failOnError: true)
				flash.message = message code: 'effort.message.success'
				log.info "Effort registered by ${effort.purpose.user.username} in ${effort.purpose.name}"
			} catch (Exception e) {
				log.error e
				tx.setRollbackOnly()
				flash.message = message code: 'effort.message.error'
				flash.type = 'error'
			}
		}

		if (flash.type == 'error') {
			redirect controller: 'purpose', action: 'show', id: params.purposeId
		} else {
			redirect action: 'show', id: effort.id
		}

	}

	def show() {
		def effort = Effort.get(params.id)
		if (effort) {
			[effort: effort]
		} else {
			flash.message = message code: 'effort.message.notFound'
		}
	}
}
