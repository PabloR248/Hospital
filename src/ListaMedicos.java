 
import java.util.ArrayList;
import java.util.Iterator;
 

 

public class ListaMedicos {

	
	private ArrayList<Medico> medicos;
    
    /**
     * Constructor for objects of class Gerent
     */
    public ListaMedicos()
    {
    	medicos = new ArrayList<Medico>();
        
    }
    public void addMedico(Medico medico)
    {
    	medicos.add(medico);
    }
    
    public void print()
    {
    	Iterator<Medico> it=medicos.iterator();
    	while(it.hasNext()) {
    		System.out.println(it.next().toString());
    	}	
    }
    
	public void borrarPorDNI(String DNI) {
		for (int i = 0; i < medicos.size(); i++) {
			Medico c = medicos.get(i);
			String DNIc = c.getDni();
			if (DNIc.equals(DNI)) {
				medicos.remove(i);
			}
		}

	}
	
	public boolean existeMedico(String DNI) {
		boolean b=false;
		for (int i = 0; i < medicos.size(); i++) {
			Medico c = medicos.get(i);
			String DNIc = c.getDni();
			if (DNIc.equals(DNI)) {
				b=true;
				break;
			}
		}
		return b;

	}
    
    public String atenderPaciente(Paciente p) {
    	
    	for (int i = 0; i < medicos.size(); i++) {
			Medico m = medicos.get(i);
			String especialidad = m.getEspecialidad();
			if (especialidad.equals(p.getDolencia())) {
				
				ArrayList<Paciente> ap=m.getListaPacientes(); //Obtengo la lista de pacientes de ese médico
				ap.add(p); //Añado al final el paciente nuevo
				m.setListaPacientes(ap); //Añado la lista al médico
				
				borrarPorDNI(m.getDni());
				addMedico(m);
				return m.toString();
				
			}
					
			
		}
    		return "false";
    } 
    //5.1.
    public void listarPacientesPorDNIMedico(String DNI) {
		for (int i = 0; i < medicos.size(); i++) {
			Medico m = medicos.get(i);
			String DNIc = m.getDni();
			if (DNIc.equals(DNI)) {
				ArrayList<Paciente> pm=m.getListaPacientes();
				Iterator<Paciente> itp=pm.iterator();
		    	while(itp.hasNext()) {
		    		System.out.println(itp.next().toString());
		    	}	
			}
		}

	}
    //5.2
    public void listarTodosLosPacientes() {
		for (int i = 0; i < medicos.size(); i++) {
			Medico m = medicos.get(i);
			ArrayList<Paciente> pm=m.getListaPacientes();
			Iterator<Paciente> itp=pm.iterator();
		    while(itp.hasNext()) {
		    	System.out.println(itp.next().toString());
		    }	
			
		}

	}
    //9
	public void pintarMedicoPorEspecialidad(String especialidad) {
		System.out.println(especialidad+": ");
		for (int i = 0; i < medicos.size(); i++) {
			Medico c = medicos.get(i);
			String esp = c.getEspecialidad();
			if (especialidad.equals(esp)) {
				System.out.println(c.toString());
			}
		}

	}
	//9
	public void pintarEspecialidadesHospital() {
		for (int i = 0; i < Menu.especialidad.size(); i++) {			
			pintarMedicoPorEspecialidad(Menu.especialidad.get(i));
		}		
	}
	
	//Intro
	
	public int numeroMedicos() {
		return medicos.size();
	}
	
	 public int numeroPacientes() {
		 int suma=0;
			for (int i = 0; i < medicos.size(); i++) {
				Medico m = medicos.get(i);
				ArrayList<Paciente> pm=m.getListaPacientes();
				suma=suma+pm.size();
				
			}
			return suma;

		}
}
