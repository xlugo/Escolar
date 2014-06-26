package control

class Profesor {
	 String nombre
    String apellidoPaterno
    String apellidoMaterno
    String email
    String direccion //se puede transformar en un objeto Dirección que contenga calle, colonia, ciudad, pais. 

    //*static belongsTo = [curso:Curso] 
	static hasMany = [cursos:Curso]

    static constraints = {
        //*curso()
        nombre()
        apellidoPaterno()
        apellidoMaterno()
        email()
        direccion()
		cursos()
    }

    String toString(){
        nombre + " " + apellidoPaterno + " " + apellidoMaterno
    }

}
