
public class Nodo {

	private Temperatura dato;
	private Nodo enlace;
	
	public Nodo() {

	}

	public Nodo(Temperatura dato) {
		this.dato = dato;
	}

	public Temperatura getDato() {
		return dato;
	}

	public void setDato(Temperatura dato) {
		this.dato = dato;
	}

	public Nodo getEnlace() {
		return enlace;
	}

	public void setEnlace(Nodo enlace) {
		this.enlace = enlace;
	}
}
