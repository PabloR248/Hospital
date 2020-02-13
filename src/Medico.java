import java.util.ArrayList;

public class Medico extends Persona{
	//Estado
	private String especialidad;
	private ArrayList<Paciente> listaPacientes;
	
	//Comportamiento
	//Constructor
	public Medico(String nombre,  String apellido, String dni, String especialidad) {
		super(dni,nombre,apellido);
		
		this.especialidad=especialidad;
		this.listaPacientes=new ArrayList<Paciente>();
		
	}
	public Medico() {
		super();
		this.especialidad="";
	}
	
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public ArrayList<Paciente> getListaPacientes() {
		return listaPacientes;
	}
	public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
		this.listaPacientes = listaPacientes;
	}
	
	public String toString() {
		return super.toString()+" Especialidad: "+especialidad;
	}
	
}
