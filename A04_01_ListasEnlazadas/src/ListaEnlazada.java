import java.text.DecimalFormat;

public class ListaEnlazada {

	Nodo nodoInicio;
	Nodo nodoFin;
	
	public ListaEnlazada() {
		nodoInicio = nodoFin = null;
	}
	
	public void agregarElementoAlInicio(double dato) {
		Nodo nodoNuevo = new Nodo(dato);
		
		if(verificarListaVacia()) {
			nodoInicio = nodoFin = nodoNuevo;
		}else {
			nodoNuevo.setEnlace(nodoInicio);
			nodoInicio = nodoNuevo;
		}
		System.out.println("Se agrego el elemento al inicio");
	}
	
	public void agregarElementoAlFinal(double dato) {
		Nodo nodoNuevo = new Nodo(dato);
		
		if(verificarListaVacia()) {
			nodoInicio = nodoFin = nodoNuevo;
		}else {
			nodoFin.setEnlace(nodoNuevo);
			nodoFin = nodoNuevo;
		}
		System.out.println("Se agrego el elemento al final");
	}
	
	public void eliminarElementoAlInicio() {
		
		if(verificarListaVacia()) {
			System.out.println("No hay elementos para eliminar");
		}else if(nodoInicio == nodoFin) {
			nodoInicio = nodoFin = null;
			System.out.println("Se elimino el elemento");
		}else{
			nodoInicio = nodoInicio.getEnlace();
			System.out.println("Se elimino el elemento al inicio");
		}
	}
	
	public void eliminarElementoAlFinal() {
		
		Nodo nodoActual = nodoInicio;
		
		int cont = 0;
		
		if(verificarListaVacia()) {
			System.out.println("No hay elementos para eliminar");
		}else if(nodoInicio == nodoFin) {
			nodoInicio = nodoFin = null;
			System.out.println("Se elimino el elemento");
		}else{
			while(cont < mostrarCantidadElementos()-2) {
				nodoActual = nodoActual.getEnlace();
				cont++;
			}
			nodoActual.setEnlace(null);
			nodoFin = nodoActual;
			System.out.println("Se elimino el elemento al final");
		}
	}
	
	public void mostrarElementos() {
		
		DecimalFormat df = new DecimalFormat("##.##");
		
		Nodo nodoActual = nodoInicio;
		
		while(nodoActual!=null) {
			
			System.out.print("["+df.format(nodoActual.getDato())+"]"+"-->");
			
			nodoActual = nodoActual.getEnlace();
		}
		System.out.println();
		System.out.println("---------------");
	}
	
	public void mostrarPromedioElementos() {
		
		Nodo nodoActual = nodoInicio;
		double sum = 0;
		int cont = 0;
		
		DecimalFormat df = new DecimalFormat("##.##");
		
		while(nodoActual!=null) {
			
			sum = sum + nodoActual.getDato();
			
			nodoActual = nodoActual.getEnlace();
			cont ++;
		}
		sum = sum/cont;
		if(sum > 0 && sum <= 10) {
			System.out.println("El promedio es de: " + df.format(sum) + " Esta -Congelado-");
		}else if(sum >= 11 && sum <= 20) {
			System.out.println("El promedio es de: " + df.format(sum) + " Esta -Frio-");
		}
		else if(sum >= 21 && sum <= 30) {
			System.out.println("El promedio es de: " + df.format(sum) + " Esta -Normar-");
		}else if(sum >= 31) {
			System.out.println("El promedio es de: " + df.format(sum) + " Esta -A alta temperatura-");
		}
		System.out.println();
		System.out.println("---------------");
	}
	
	public double eliminarElementoEspecifico(double dato) {
		
		DecimalFormat df = new DecimalFormat("##.##");
		
		if(verificarListaVacia()) {
			System.out.println("No hay elementos para eliminar");
			return -1;
		}else if(nodoInicio.getDato() == dato) {
			System.out.println("Encontrado y eliminado en primer nodo");
			double d = nodoInicio.getDato();
			nodoInicio = nodoInicio.getEnlace();
			return d;
		}else if(nodoInicio == nodoFin){
			System.out.println("No se encontro el elemento");
			return -1;
		}else{
			
			Nodo nodoAnterior = nodoInicio;
			Nodo nodoSigiente = nodoInicio.getEnlace();
			
			while(nodoSigiente.getDato()!=dato && nodoSigiente.getEnlace() != null) {
				
				nodoAnterior = nodoAnterior.getEnlace();
				nodoSigiente = nodoSigiente.getEnlace();
			}
			if(nodoSigiente.getDato() == dato) {
				nodoAnterior.setEnlace(nodoSigiente.getEnlace());
				System.out.println("Se elimino el elemento");
				return nodoSigiente.getDato();
			}else {
				System.out.println("No encontrado el elemento");
				return -1;
			}
		}
		
	}
	
	public int mostrarCantidadElementos() {
		Nodo nodoActual = nodoInicio;
		int cont = 0;
		while(nodoActual!=null) {
			
			cont++;
			
			nodoActual = nodoActual.getEnlace();
		}
		return cont;
	}
	
	public boolean verificarListaVacia() {

		return (nodoInicio == null) ? true : false;
	}
}
