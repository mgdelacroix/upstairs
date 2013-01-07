package es.ctrlz.upStairs

class Comment {

    String body

    static belongsTo = [user: User, effort: Effort]

    static constraints = {
    }
}
