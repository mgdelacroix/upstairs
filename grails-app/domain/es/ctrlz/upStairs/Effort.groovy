package es.ctrlz.upStairs

class Effort {

	Date date
	String description
    static belongsTo = [purpose: Purpose]
    static hasMany = [comments: Comment]
    //Measure (si podemos medir en alguna unidad el esfuerzo)

    static constraints = {
		date nullable: false
		description blank: false
    }
}
