package es.ctrlz.upStairs
import grails.plugins.springsecurity.Secured

@Secured(['ROLE_USER'])
class CommentController {

    def springSecurityService

    def save() {
	def comment = new Comment()
	Comment.withTransaction{ tx ->
	    try {
		params.comment.user = springSecurityService.currentUser
		params.comment.effort = Effort.get(params.effortId)
		comment.properties = params.comment
		comment.save(failOnError: true)
		flash.message = message code: 'comment.message.success'
	    } catch (Exception e) {
		log.error e
		tx.setRollbackOnly()
		flash.message = message code: 'comment.message.error'
		flash.type = 'error'
	    }
	}

	redirect controller: 'effort', action: 'show', id: params.effortId
    }
}
