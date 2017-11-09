package clases;

public class Paciente {
	private int codigoPaciente;
	private String apellidos,nombres,telefono,dni;
	public Paciente(int codigoPaciente,String apellidos,
			String nombres,String telefono,String dni) {
		this.codigoPaciente=codigoPaciente;
		this.apellidos=apellidos;
		this.nombres=nombres;
		this.telefono=telefono; 
		this.dni=dni;
	}
// metodos set/get
	public void setcodigoPaciente(int codigoPaciente) {
		this.codigoPaciente=codigoPaciente;
	}
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos; 
	}
	public void setNombre(String nombres) {
		this.nombres=nombres;
	}
	public void setTelefono(String telefono) {
		this.telefono=telefono;
	}
	public void setDni(String dni) {
		this.dni=dni;
	}
	
	public int getcodigoPaciente() {
		return codigoPaciente;
	}
	public String getApellidos() {
		return apellidos; 
	}
	public String getNombre() {
		return nombres;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getDni() {
		return dni;
	}
}
