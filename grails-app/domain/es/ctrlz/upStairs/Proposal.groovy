package es.ctrlz.upStairs

class Proposal {

    String name
    String description
    // String periodicity  // Cómo representamos daily, weekly, monthly?
    boolean closed = false

    static belongsTo = [user: User]

    static constraints = {
    }
}
