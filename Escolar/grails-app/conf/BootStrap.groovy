import grails.util.Environment

class BootStrap {

    def init = { servletContext ->

        //Se verifica que sea el entorno de desarrollo
       if (Environment.getCurrent().name == "development") {
		   
		   //Se crea la universidad
		   def uni = new control.Universidad(nombre:"UPAEPi").save()

            //Se crean las facultades
            def facultadIngenierias = new control.Facultad(nombre:"Ingenierias", universidad: uni).save()
			
            def facultadMedicina    = new control.Facultad(nombre:"Ciencias de la salud", universidad: uni).save()

            //Se crean las carreras
            def ingSistemas = new control.Carrera(nombre:"Ingenieria en Sistemas", facultad: facultadIngenierias).save()
            def ingIndustrial = new control.Carrera(nombre:"Ingenieria Industrial", facultad: facultadIngenierias).save()
			def medicina = new control.Carrera(nombre:"Medicina", facultad: facultadMedicina).save()
			
			

            def pfernandez = new control.Profesor(nombre:"Pedro", apellidoPaterno: "Fernandez", apellidoMaterno: "Torres", email: "pfernandezl@upaep.mx", direccion:"calle 12 norte 13, Alto, Puebla, Pue, México").save()
			def mhernandez = new control.Profesor(nombre:"Micaela", apellidoPaterno: "Hernandez", apellidoMaterno: "Tepa", email: "mhernandeztl@upaep.mx", direccion:"calle 2 norte 12, Libertad, Puebla, Pue, México").save()
			
			def prim = new control.Periodo(nombre:"Primavera").save()
			def vera = new control.Periodo(nombre:"Verano").save()
			
			
			
			
			
			//Se crean los profesor
			//*def jPerez = new control.Profesor(nombre:"Juan", apellidoPaterno: "Perez", apellidoMaterno: "Lopez", email: "jperez@upaep.mx", direccion:"calle 21 sur 1523, santiago, Puebla, Pue, México", curso : windows8 ).save()

			//Se crean los cursos
			def windows8 = new control.Curso(nombre:"Windows 8", carrera : ingSistemas, profesor : pfernandez, periodo : prim).save()
			def visualStudio = new control.Curso(nombre:"Visual Studio 2012", carrera : ingSistemas, profesor: pfernandez, periodo : prim).save()
			def biologia = new control.Curso(nombre : "Biologia", carrera : medicina, profesor : mhernandez, periodo : prim ).save()
			
			//alumnos
			def amendez = new control.Alumno(nombre : "Alicia", apellidoPaterno: "Mendez", apellidoMaterno: "Camin", email: "amendezc@upaep.mx", direccion:"calle 122 norte 1562, Zapata, Puebla, Pue, México", curso : windows8).save()
			def pfernadez = new control.Alumno(nombre : "Pedro", apellidoPaterno: "Fernandez", apellidoMaterno: "Lupo", email: "pfernendezl@upaep.mx", direccion:"calle 8 sur 13, V Carranza, Puebla, Pue, México", curso : windows8).save()
			def clopezs = new control.Alumno(nombre : "Claudia", apellidoPaterno: "Lopez", apellidoMaterno: "serrano", email: "clopezs@upaep.mx", direccion:"calle 88 poniente 1673, Torres, Puebla, Pue, México", curso : windows8).save()
			def amendez2 = new control.Alumno(nombre : "Alicia", apellidoPaterno: "Mendez", apellidoMaterno: "Camin", email: "amendezc@upaep.mx", direccion:"calle 122 norte 1562, Zapata, Puebla, Pue, México", curso : visualStudio).save()
			
			//Semestres
			def sem1 = new control.Semestre(nombre:"Primer Semestre", alumno:amendez).save()
			def sem2 = new control.Semestre(nombre:"Segundo Semestre", alumno:amendez).save()
			
        }
    }

    def destroy = {
    }
}