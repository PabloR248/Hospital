
public class Paciente extends Persona{

	//Estado
		private String nss;
		private String telefono;
		private String dolencia;
		
		//Comportamiento
		//Constructor
		public Paciente( String nombre,  String apellido,String dni, String nss,String telefono, String dolencia ) {
			super(dni,nombre,apellido);
			
			this.nss=nss;
			this.telefono=telefono;
			this.dolencia=dolencia;
			
		}
		
		public Paciente() {
			super();
			this.nss="";
			this.telefono="";
			this.dolencia="";
		}

		public String getNss() {
			return nss;
		}

		public void setNss(String nss) {
			this.nss = nss;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public String getDolencia() {
			return dolencia;
		}

		public void setDolencia(String dolencia) {
			this.dolencia = dolencia;
		}
		
		public String toString() {
			return super.toString()+" Número seguridad social: "+nss+" Teléfono: "+telefono+ " Dolencia: "+dolencia;
		}
		
}
