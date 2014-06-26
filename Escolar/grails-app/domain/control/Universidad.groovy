package control

class Universidad {
	
	String nombre
	
	static hasMany = [facultades:Facultad]
	
    static constraints = {
		nombre()
		facultades()
    }
	
	String toString(){
		nombre
	}
}
