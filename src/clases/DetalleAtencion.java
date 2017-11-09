package clases;

public class DetalleAtencion {
private int codigoAtencion,codigoMedicina,cantidad;
private double precioUnitario;
public DetalleAtencion(int codigoAtencion,int codigoMedicina,
		int cantidad,double precioUnitario) {
	this.codigoAtencion=codigoAtencion;
	this.codigoMedicina=codigoMedicina;
	this.cantidad=cantidad;
	this.precioUnitario=precioUnitario;
}
//metodos set/get
public void setcodigoAtencion(int codigoAtencion) {
	this.codigoAtencion=codigoAtencion;
}
public void setcodigoMedicina(int codigoMedicina) {
	this.codigoMedicina=codigoMedicina;
}
public void setCantidad(int cantidad) {
	this.cantidad=cantidad;
}
public void setprecioUnitario(double precioUnitario) {
	this.precioUnitario=precioUnitario;
}

public int getcodigoAtencion() {
	return codigoAtencion;
}
public int getcodigoMedicina() {
	return codigoMedicina;
}
public int getCantidad() {
	return cantidad;
}
public double getprecioUnitario() {
	return precioUnitario;
}
}
