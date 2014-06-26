package control

class Alumno {
	
	String nombre
    String apellidoPaterno
    String apellidoMaterno
    String email
    String direccion //se puede transformar en un objeto Dirección que contenga calle, colonia, ciudad, pais. 

    static belongsTo = [curso:Curso] 
	static hasMany = [semestres : Semestre]
	
    static constraints = {
        curso()
        nombre()
        apellidoPaterno()
        apellidoMaterno()
        email()
        direccion()
		semestres()
    }

    String toString(){
        nombre + " " + apellidoPaterno + " " + apellidoMaterno
    }
}
