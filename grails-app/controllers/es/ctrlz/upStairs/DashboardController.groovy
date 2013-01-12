package es.ctrlz.upStairs
import grails.plugins.springsecurity.Secured

class DashboardController {

	@Secured(['ROLE_USER'])
    def index() {
		render 'Dashboard Controller'
	}
}
