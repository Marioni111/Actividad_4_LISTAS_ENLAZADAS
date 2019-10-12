import java.util.Random;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random rnd = new Random();
		
		
		ListaEnlazada lista = new ListaEnlazada();
		lista.agregarElementoAlInicio((rnd.nextDouble()*50)+1);
		lista.agregarElementoAlInicio((rnd.nextDouble()*50)+1);
		lista.agregarElementoAlInicio((rnd.nextDouble()*50)+1);
		lista.agregarElementoAlInicio((rnd.nextDouble()*50)+1);

		int op = 0;
		int cont = 0;
		double elemento = 0;
		
		do{
			System.out.println("1)Mostrar lista \n2)Agregar elemento al inicio \n3)Agregar elemento al final \n4)Eliminar elemento al inicio \n5)Eliminar elemento al final \n6)Mostrar total de elementos \n7)Eliminar elemento especifico \n8)Mostrar promedio de elementos \n9)Salir\n-----------------------------");
			op = entrada.nextInt();
			switch(op) {
				case 1 :
					lista.mostrarElementos();
					break;
				case 2 :
					elemento = (rnd.nextDouble()*50)+1;
					lista.agregarElementoAlInicio(elemento);
					break;
				case 3 :
					elemento = (rnd.nextDouble()*50)+1;
					lista.agregarElementoAlFinal(elemento);
					break;
				case 4 :
					lista.eliminarElementoAlInicio();
					break;
				case 5 :
					lista.eliminarElementoAlFinal();
					break;
				case 6 :
					System.out.println("El total de elementos en la lista es de: " + lista.mostrarCantidadElementos());
					break;
				case 7 :
					System.out.println("Ingresa un numero a eliminar:");
					elemento = entrada.nextDouble();
					lista.eliminarElementoEspecifico(elemento);
					System.out.println();
					break;
				case 8 :
					lista.mostrarPromedioElementos();
					break;
				case 9 :
					cont ++;
					break;
			}
		}while(cont<1);
		System.out.println("Nos vemos");
	}
}
