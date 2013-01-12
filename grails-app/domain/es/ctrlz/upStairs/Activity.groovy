package es.ctrlz.upStairs

class Activity {

	Date dateCreated
	Purpose purpose
	Effort effort
	Comment comment
	ActivityType type

	static belongsTo = [user: User]

    static constraints = {
		type nullable: false, validator: { type, purpose ->
			// En función del tipo, unos campos tendrán valor y otros no
			if (type == ActivityType.CREATE_PURPOSE || type == ActivityType.COMPLETE_PURPOSE) {
				purpose != null && (effort == null && comment == null)
			} else if (type == ActivityType.REGISTER_EFFORT) {
				effort != null && (purpose == null && comment == null)
			} else {
				comment != null && (purpose == null && effort == null)
			}
		}
    }
}

enum ActivityType {
	CREATE_PURPOSE,
	COMPLETE_PURPOSE,
	REGISTER_EFFORT,
	COMMENT_EFFORT
}
