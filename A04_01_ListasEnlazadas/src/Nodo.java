
public class Nodo {

	private double dato;
	private Nodo enlace;
	
	public Nodo() {

	}
	
	public Nodo(double dato) {
		this.dato = dato;
	}
	
	public double getDato() {
		return dato;
	}
	public void setDato(double dato) {
		this.dato = dato;
	}
	public Nodo getEnlace() {
		return enlace;
	}
	public void setEnlace(Nodo enlace) {
		this.enlace = enlace;
	}
	
}
