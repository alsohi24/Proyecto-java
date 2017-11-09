package clases;

public class Cama {
private int numeroCama,categoria,estado;
public Cama(int numeroCama,int categoria,int estado) {
	this.numeroCama=numeroCama;
	this.categoria=categoria;
	this.estado=estado; 
}
//metodos set/get
public void setnumeroCama (int numeroCama) {
	this.numeroCama=numeroCama;
}
public void setCategoria (int categoria) {
	this.categoria=categoria;
}
public void setEstado (int estado) {
	this.estado=estado;
}

public int getnumeroCama () {
	return numeroCama;
}
public int getCategoria () {
	return categoria;
}
public int getEstado () {
	return estado;
}
}
