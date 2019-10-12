
public class Temperatura {

	private double temperatura;
	private int fecha;
	
	public Temperatura() {
	}
	
	public Temperatura(double temperatura, int fecha) {
		this.temperatura = temperatura;
		this.fecha = fecha;
	}
	
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
}
