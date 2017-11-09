package clases;

public class Internamiento {
private int codigoInternamiento,codigoPaciente,numeroCama,estado;
private String fechaIngreso,horaIngreso,fechaSalida,horaSalida;
public Internamiento(int codigoInternamiento,int codigoPaciente,int numeroCama,int estado,
		String fechaIngreso,String horaIngreso,String fechaSalida,String horaSalida) {
	this.codigoInternamiento=codigoInternamiento;
	this.codigoPaciente=codigoPaciente;
	this.numeroCama=numeroCama; 
	this.estado=estado;
	this.fechaIngreso=fechaIngreso; 
	this.horaIngreso=horaIngreso;
	this.fechaSalida=fechaSalida;
	this.horaSalida=horaSalida;
}
// metodos set/get
public void setcodigoInternamiento(int codigoInternamiento) {
	this.codigoInternamiento=codigoInternamiento;
}
public void setcodigoPaciente (int codigoPaciente) {
	this.codigoPaciente=codigoPaciente;
}
public void setnumeroCama(int numeroCama) {
	this.numeroCama=numeroCama;
}
public void setEstado(int estado) {
	this.estado=estado;
}
public void setfechaIngreso(String fechaIngreso) {
	this.fechaIngreso=fechaIngreso;
}
public void sethoraIngreso(String horaIngreso) {
	this.horaIngreso=horaIngreso;
}
public void setfechaSalida(String fechaSalida) {
	this.fechaSalida=fechaSalida;
}
public void sethoraSalida(String horaSalida) {
	this.horaSalida=horaSalida;
}

public int getcodigoInternamiento() {
	return codigoInternamiento;
}
public int getcodigoPaciente () {
	return codigoPaciente;
}
public int getnumeroCama() {
	return numeroCama;
}
public int getEstado() {
	return estado;
}
public String getfechaIngreso() {
	return fechaIngreso;
}
public String gethoraIngreso() {
	return horaIngreso;
}
public String getfechaSalida() {
	return fechaSalida;
}
public String gethoraSalida() {
	return horaSalida;
}
}
