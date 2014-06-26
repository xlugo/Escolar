package control

class Facultad {
	
	String nombre
	
	static belongsTo = [universidad:Universidad]	
	static hasMany = [carreras:Carrera]

    static constraints = {
		universidad()
		nombre()
		carreras()
		
    }
	
	String toString(){
		nombre
	}
}
