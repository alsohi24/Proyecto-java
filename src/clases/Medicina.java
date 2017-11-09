package clases;

public class Medicina {
private int codigoMedicina,stock;
private double precio;
private String nombre,laboratorio;
public Medicina(int codigoMedicina,int stock,double precio,
		String nombre,String laboratorio) {
	this.codigoMedicina=codigoMedicina;
	this.stock=stock;
	this.precio=precio;
	this.nombre=nombre; 
	this.laboratorio=laboratorio;
}
// metodos set/get
public void setcodigoMedicina(int codigoMedicina) {
	this.codigoMedicina=codigoMedicina;
}
public void setStock(int stock) {
	this.stock=stock;
}
public void setPrecio(double precio) {
	this.precio=precio;
}
public void setNombre(String nombre) {
	this.nombre=nombre;
}
public void setLaboratorio(String laboratorio) {
	this.laboratorio=laboratorio;
}

public int getcodigoMedicina() {
	return codigoMedicina;
}
public int getStock() {
	return stock;
}
public double getPrecio() {
	return precio;
}
public String getNombre() {
	return nombre;
}
public String getLaboratorio() {
	return laboratorio;
}
}
