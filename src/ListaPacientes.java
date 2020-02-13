import java.util.ArrayList;
import java.util.Iterator;

public class ListaPacientes {

private ArrayList<Paciente> pacientes;
    
    /**
     * Constructor for objects of class Gerent
     */
    public ListaPacientes()
    {
    	pacientes = new ArrayList<Paciente>();
        
    }
    public void addPaciente(Paciente paciente)
    {
    	pacientes.add(paciente);
    }
    
    public void print()
    {
    	Iterator<Paciente> it=pacientes.iterator();
    	while(it.hasNext()) {
    		System.out.println(it.next().toString());
    	}	
    }
	public void borrarPorDNI(String DNI) {
		for (int i = 0; i < pacientes.size(); i++) {
			Paciente c = pacientes.get(i);
			String DNIc = c.getDni();
			if (DNIc.equals(DNI)) {
				pacientes.remove(i);
			}
		}

	}
	public void borrarPrimerPaciente() {
		if(pacientes.size()>0) {
		pacientes.remove(0);
		}
	}
	public Paciente obtenerPrimerPaciente() {
		return pacientes.get(0);
		
	}
	
	public boolean hayPacientes() {
		return pacientes.size()>0;
		
	}
	
	public boolean existePaciente(String DNI) {
		boolean b=false;
		for (int i = 0; i < pacientes.size(); i++) {
			Paciente c = pacientes.get(i);
			String DNIc = c.getDni();
			if (DNIc.equals(DNI)) {
				b=true;
				break;
			}
		}
		return b;

	}
	
	//9
	public void pintarEspecialidadesPorAtender() {
		ArrayList<String> dolenciasSinAtender = new ArrayList<String>();
		for (int i = 0; i < pacientes.size(); i++) {			
			Paciente c = pacientes.get(i);
			if(!dolenciasSinAtender.contains(c.getDolencia())) {
				System.out.println(c.getDolencia());
				dolenciasSinAtender.add(c.getDolencia());
			}
		}
	}
    
	
}
