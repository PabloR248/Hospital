/**
 * @author DAM109
 *@version 0.1
 */
public class Persona {
	//Estado
	private String dni, nombre, apellido;
	
	
	//Comportamiento
	//Constructor
	public Persona(String dni, String nombre,  String apellido) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellido=apellido;
	}
	
	public Persona() {
		this.dni="";
		this.nombre="";
		this.apellido="";
	}

	//Getters and Setters
	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//toString
	public String toString() {
		return "Nombre: "+nombre+" Apellido: "+apellido+" DNI: "+dni;
	}
	
	

}
