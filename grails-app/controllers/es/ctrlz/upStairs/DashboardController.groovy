package es.ctrlz.upStairs
import grails.plugins.springsecurity.Secured

@Secured(['ROLE_USER'])
class DashboardController {

    def index() { }
}
