package control

class Periodo {
	String nombre
	
	static hasMany = [cursos:Curso]

    static constraints = {
		nombre()
		cursos()
    }
	
	String toString(){
		nombre
	}
}
