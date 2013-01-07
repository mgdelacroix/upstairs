import es.ctrlz.upStairs.*

class BootStrap {

    def createUsers() {
        def userRole = new Role(
                authority: "USER_ROLE"
        ).save(failOnError: true)

        def user = new User(
                username: "test",
                password: "test",
                enabled: true
        ).save(failOnError: true)

        UserRole.create user, userRole, true
    }

    def init = { servletContext ->
        createUsers()
    }
    def destroy = {
    }
}
