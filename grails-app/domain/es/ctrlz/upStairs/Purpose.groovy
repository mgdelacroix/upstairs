package es.ctrlz.upStairs

class Purpose {

    String name
    String description
    // String periodicity  // Cómo representamos daily, weekly, monthly?
    boolean closed = false
	Date dateCreated

    static belongsTo = [user: User]
	static hasMany = [efforts: Effort]

    static constraints = {
		name blank: false
		closed nullable: false
    }
}
