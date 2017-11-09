package clases;

public class Atencion {
private int codigoAtencion,codigoPaciente,fechaAtencion,estado;
private double totalPagar;
public Atencion(int codigoAtencion,int codigoPaciente,int fechaAtencion,int estado,double totalPagar) {
	this.codigoAtencion=codigoAtencion; 
	this.codigoPaciente=codigoPaciente; 
	this.fechaAtencion=fechaAtencion; 
	this.estado=estado;  
	this.totalPagar=totalPagar;  
}
//metodos set/get
public void setcodigoAtencion (int codigoAtencion) {
	this.codigoAtencion=codigoAtencion;
}
public void setcodigoPaciente (int codigoPaciente) {
	this.codigoPaciente=codigoPaciente; 
}
public void setfechaAtencion (int fechaAtencion) {
	this.fechaAtencion=fechaAtencion; 
}
public void setEstado (int estado) {
	this.estado=estado; 
}
public void settotalPagar (double totalPagar) {
	this.totalPagar=totalPagar; 
}

public int getcodigoAtencion () {
	return codigoAtencion;
}
public int getcodigoPaciente () {
	return codigoPaciente; 
}
public int getfechaAtencion () {
	return fechaAtencion; 
}
public int getEstado () {
	return estado; 
}
public double gettotalPagar () {
	return totalPagar; 
}

}
