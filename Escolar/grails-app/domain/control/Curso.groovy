package control

class Curso {
	
	String nombre
	
   //static belogsTo = [carrera_:Carrera, profesor:Profesor]
	static belongsTo = [carrera:Carrera, profesor:Profesor, periodo:Periodo]
	//*static hasMany = [profesores:Profesor]
	static hasMany = [alumnos:Alumno]

    static constraints = {
		periodo()    
		carrera()
        nombre()
		//*profesores()
		profesor()
		alumnos()
		
    }

    String toString(){
        nombre
    }
}
