package control

class Carrera {

    String nombre

    static belongsTo = [facultad:Facultad] 
	static hasMany = [cursos:Curso]

    static constraints = {
        facultad()
        nombre()
		cursos()
    }

    String toString(){
        nombre
    }
}
