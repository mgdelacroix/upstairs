package es.ctrlz.upStairs

class Comment {

    String body
		Date dateCreated

    static belongsTo = [user: User, effort: Effort]

    static constraints = {
    }
}
