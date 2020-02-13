import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	public static final ArrayList<String> especialidad = new ArrayList<String>() {{
	    add("dermatología");
	    add("cardiología");
	    add("neumología");
	    add("pediatría");
	    add("traumatología");
	}};
	
	public static void main(String[] args) {
		ListaMedicos medicos=new ListaMedicos();
		 
		ListaPacientes pacientes=new ListaPacientes();
		
		ListaPacientes pacientesNoAtendidos=new ListaPacientes();
		
		 Scanner teclado=new Scanner(System.in);

	       int op1=0;
	        int op2=0;
	        double precio=0;

	        
	        
	      
		
		do {
			System.out.println("BIENVENIDO A \"NOMBRE HOSPITAL\" ACTUALMENTE TENEMOS "+ medicos.numeroMedicos()+" DOCTORES Y "+medicos.numeroPacientes()  +" PACIENTES SATISFECHOS PARA MÁS INFORMACIÓN UTILICE LAS SIGUIENTES OPCIONES:");
	        
	        System.out.println("1 - Dar de alta un paciente");
	        System.out.println("2 - Dar de alta un medico");
	        System.out.println("3 - Modificar un paciente");
	        System.out.println("4 - Modificar un medico");
	        System.out.println("5 - Listar pacientes");
	        System.out.println("6 - Listar médicos");
	        System.out.println("7 - Dar de baja un médico");
	        System.out.println("8 - Atender paciente");
	        System.out.println("9 - Especialidades de nuestro hospital [Info]");
	        System.out.println("10-Nueva especialidad");
	        
	        
	         
	        op1=Integer.parseInt(teclado.nextLine());


	        switch (op1){
	            case 1:
	            	 System.out.println("Inserta el nombre");
	                    String nombreP= teclado.nextLine();
	                    System.out.println("Inserta el apellido");
	                    String apellidoP= teclado.nextLine();
	                    System.out.println("Inserta el dni");
	                    String dniP= teclado.nextLine();
	                    System.out.println("Inserta el nss");
	                    String nssP= teclado.nextLine();
	                    System.out.println("Inserta el teléfono");
	                    String telefonoP= teclado.nextLine();
	                    System.out.println("Inserta la dolencia");
	                    String dolenciaP= teclado.nextLine();
	                    Paciente p=new Paciente(nombreP,apellidoP, dniP, nssP, telefonoP, dolenciaP);
	                    pacientes.addPaciente(p);
	            	break;
	            case 2:

	              
	                    System.out.println("Inserta el nombre");
	                    String nombre= teclado.nextLine();
	                    System.out.println("Inserta el apellido");
	                    String apellido= teclado.nextLine();
	                    System.out.println("Inserta el dni");
	                    String dni= teclado.nextLine();
	                    System.out.println("Inserta la especialidad");
	                    String especialidad= teclado.nextLine();
	                    if(Menu.especialidad.contains(especialidad)) {
	                    	Medico m=new Medico(nombre, apellido,dni, especialidad);
		                    medicos.addMedico(m);
	                    	
	            		}else {
	            			System.out.println("No tenemos licencia para la especialidad "+especialidad+" en nuestro hospital");
	            		}
	                    break;
	                    
	            case 3:    
	            	 System.out.println("Inserta el dni del paciente a modificar");
	            	 String dniPM= teclado.nextLine();
                   if(pacientes.existePaciente(dniPM)){
                	   pacientes.borrarPorDNI(dniPM);
                	   System.out.println("Inserta el nombre");
	                    String nombrePM= teclado.nextLine();
	                    System.out.println("Inserta el apellido");
	                    String apellidoPM= teclado.nextLine();	                     
	                    System.out.println("Inserta el nss");
	                    String nssPM= teclado.nextLine();
	                    System.out.println("Inserta el teléfono");
	                    String telefonoPM= teclado.nextLine();
	                    System.out.println("Inserta la dolencia");
	                    String dolenciaPM= teclado.nextLine();
	                    Paciente p2=new Paciente(nombrePM,apellidoPM, dniPM, nssPM, telefonoPM, dolenciaPM);
	                    pacientes.addPaciente(p2);
                   	
                   }else {
                   	 System.out.println("El paciente no pertenece a nuestro hospital");
                   }
                   break;
                   
	            case 4:    
	            	 System.out.println("Inserta el dni del médico a modificar");
	            	 String dniM= teclado.nextLine();
                    if(medicos.existeMedico(dniM)){
                    	medicos.borrarPorDNI(dniM);
                    	 System.out.println("Inserta el nombre");
 	                    nombre= teclado.nextLine();
 	                    System.out.println("Inserta el apellido");
 	                    apellido= teclado.nextLine();
 	                    //Ya no le vuelvo a pedir el DNI
 	                    System.out.println("Inserta la especialidad");
 	                    especialidad= teclado.nextLine();
 	                    if(Menu.especialidad.contains(especialidad)) {
 	                    	Medico m=new Medico(nombre, apellido,dniM, especialidad);
 		                    medicos.addMedico(m);
 	                    	
 	            		}else {
 	            			System.out.println("No tenemos licencia para la especialidad "+especialidad+" en nuestro hospital");
 	            		}
                    	
                    }else {
                    	 System.out.println("El médico no pertenece a nuestro hospital");
                    }
                    break;
                    
	            case 5:    
	            	System.out.println("5.1 -Listar todos los pacientes atendidos");
	    	        System.out.println("5.2 -Listar pacientes atendidos por un médico");
	    	        System.out.println("5.3 -Listar pacientes en espera");
	    	        System.out.println("5.4.-Listar pacientes que no han podido ser atendidos");

	    	        
	    	        
	    	        op2=Integer.parseInt(teclado.nextLine());


	    	        switch (op2){
	    	        case 1:    
                        
	    	        	medicos.listarTodosLosPacientes();
		            	break;
		            	
	    	        case 2:    
	    	        	System.out.println("Inserta el dni del médico");
		            	String dniM2= teclado.nextLine();
		            	 
		            	medicos.listarPacientesPorDNIMedico(dniM2);
		            	 
		            	break;
		            	
	    	        case 3:    
    
	    	        	pacientes.print();
	    	        	break;
	
	    	        case 4:    
	    	        	pacientesNoAtendidos.print();
	    	        	break;
	    	        }
	            
	            	break;
	            	
	            case 6:    
	                                        
	            	medicos.print();
	            	break;
	            	
	            case 7:    
                    
	            	 System.out.println("Inserta el dni del médico a eliminar");
	            	 String dniB= teclado.nextLine();
	            	 medicos.borrarPorDNI(dniB);

	                   break;    
	                   
	                   
	            case 8:    
	            	if(pacientes.hayPacientes()) {
                    Paciente pAAtender=pacientes.obtenerPrimerPaciente();
                    System.out.println("Paciente que voy a atender"+pAAtender.toString());
                    pacientes.borrarPrimerPaciente();
                    String pa=medicos.atenderPaciente(pAAtender);
                    if(pa.equals("false")) {
                    	pacientesNoAtendidos.addPaciente(pAAtender);
                    	System.out.println("No se puede atender al paciente");
                    	
                    }else {
                    	System.out.println("El paciente ha sido atendido por: "+pa);
                    }}else {
                    	System.out.println("No hay pacientes en espera");
                    }
	            	
	            	break;
	            	
	            case 9:    
	            	medicos.pintarEspecialidadesHospital();   
	            	
	            	pacientesNoAtendidos.pintarEspecialidadesPorAtender();
    	        	break;
    	        	
	            case 10:
	            	System.out.println("Inserta la nueva especialidad");
	            	String especia= teclado.nextLine();
	            	aniadirEspecialidad(especia);
	            	break;
    	        }
            
	        
            	 

	            /*default:
	                System.out.println("total: "+precio);*/

	        


	        } while (op1!=7);               


	}
	public static void aniadirEspecialidad(String nuevaEspecialidad) {
		if(!especialidad.contains(nuevaEspecialidad)) {
		especialidad.add(nuevaEspecialidad);
		}
	}
	
		
		
	
	
}
