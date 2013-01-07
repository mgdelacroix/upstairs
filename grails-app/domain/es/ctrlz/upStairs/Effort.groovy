package es.ctrlz.upStairs

class Effort {

    /*

    Date
    Description
    Measure (si podemos medir en alguna unidad el esfuerzo)

    */

    static belongsTo = [proposal: Proposal]
    static hasMany = [comments: Comment]

    static constraints = {
    }
}
