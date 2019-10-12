import java.util.Random;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random rnd = new Random();
		
		ListaEnlazada lista = new ListaEnlazada();

		lista.agregarElementoAlInicio(new Temperatura(rnd.nextDouble()*50+1, 20191010));
		lista.agregarElementoAlInicio(new Temperatura(rnd.nextDouble()*50+1, 20191011));
		lista.agregarElementoAlInicio(new Temperatura(rnd.nextDouble()*50+1, 20191012));
		lista.agregarElementoAlInicio(new Temperatura(rnd.nextDouble()*50+1, 20191013));

		int op = 0;
		int cont = 0;
		double elemento = 0;
		int fecha = 0;
		int fecha2 = 0;
		
		do{
			System.out.println("1)Mostrar lista \n2)Agregar elemento al inicio \n3)Agregar elemento al final \n4)Eliminar elemento al inicio \n5)Eliminar elemento al final \n6)Mostrar total de elementos \n7)Eliminar elemento especifico \n8)Mostrar promedio de elementos \n9)Salir\n-----------------------------");
			op = entrada.nextInt();
			switch(op) {
				case 1 :
					lista.mostrarElementos();
					break;
				case 2 :
					System.out.println("Ingresa la fecha con el formato AAAA/MM/DD (Sin diagonales)");
					fecha = entrada.nextInt();
					lista.agregarElementoAlInicio(new Temperatura(rnd.nextDouble()*50+1, fecha));
					break;
				case 3 :
					System.out.println("Ingresa la fecha con el formato AAAA/MM/DD (Sin diagonales)");
					fecha = entrada.nextInt();
					lista.agregarElementoAlFinal(new Temperatura(rnd.nextDouble()*50+1, fecha));
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
					System.out.println("Ingresa la fecha con el formato AAAA/MM/DD (Sin diagonales)");
					System.out.println("Las fechas en las que quieres que comienze a hacerce el promedio");
					System.out.println("Fecha de inicio");
					fecha = entrada.nextInt();
					System.out.println("Fecha final");
					fecha2 = entrada.nextInt();
					lista.mostrarPromedioElementos(fecha, fecha2);
					break;
				case 9 :
					cont ++;
					break;
			}
		}while(cont<1);
		System.out.println("Nos vemos");
	}
}