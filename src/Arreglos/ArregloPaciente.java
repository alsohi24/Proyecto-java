package Arreglos;
import clases.Paciente;

import java.util.ArrayList;
public class ArregloPaciente {
	private ArrayList <Paciente> pac;
	public ArregloPaciente() {
    	pac = new ArrayList <Paciente> ();
		adicionar(new Paciente(1001,"Luna Pizarro","Jose Carlos","956589569","78569856"));
		adicionar(new Paciente(1002,"Romero Soto","Ana Maria","933569856","22402101"));
		adicionar(new Paciente(1003,"Pinto Garza","Rosa Lucia","956589874","73172101"));
    }
	

	public int tamaño() {
		return pac.size();
	}
	public Paciente obtener(int pos) {
		return pac.get(pos);
	}
	public void adicionar(Paciente p) {
		pac.add(p);
	}
	public void eliminar(Paciente x) {
		pac.remove(x);
	}
	
	public Paciente buscar(int codigo) {
		Paciente x;
		for (int i=0; i<tamaño(); i++) {
			x = obtener(i);
			if (x.getcodigoPaciente()==codigo)
				return x;
		}
		return null;
	}
	
	public int codigoCorrelativo() {
		if (tamaño() == 0)
			return 1001;
		else {
			int ultimoCodigo = obtener(tamaño()-1).getcodigoPaciente();
			return (ultimoCodigo) + 1;
		}
	}
}
