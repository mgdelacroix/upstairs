import es.ctrlz.upStairs.*

class BootStrap {

    def createUsers() {
        def roleUser = new Role(
                authority: "ROLE_USER"
        ).save(failOnError: true)

        def user = new User(
                username: "test",
                password: "test",
                enabled: true
        ).save(failOnError: true)

        UserRole.create(user, roleUser, true)
    }

    def init = { servletContext ->
        createUsers()
    }
    def destroy = {
    }
}
