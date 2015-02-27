package org.ifcasl.destress

class Exercise {
	String name
	String description
	static belongsTo = Lesson
	static hasMany = [lessons:Lesson]//, widgets:MyWidget]
	
	Word word 
	
    static constraints = {
		name (blank: false)
		//description (blank: false)
    }
	
	String toString(){
		return name
	}
}
