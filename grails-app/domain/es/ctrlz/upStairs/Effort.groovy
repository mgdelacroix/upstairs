package es.ctrlz.upStairs

class Effort {

	Date dateCreated
	String description
    static belongsTo = [purpose: Purpose]
    static hasMany = [comments: Comment]
    //Measure (si podemos medir en alguna unidad el esfuerzo)

    static constraints = {
		dateCreated nullable: false
		description nullable: false
    }
}
