package dowhile; // Define el paquete dowhile

import java.util.Scanner; // Importa la clase Scanner para la entrada de datos

public class Ejer8 { // Declara la clase Ejer8
	public static void main(String[] args) { // Método principal
		/*
		 * Repetir el ejercicio de los dados del boletín de SWITCH. Mientras en la
		 * primera tirada no se introduzca un valor válido se le seguirá preguntando. Lo
		 * mismo con la segunda tirada.
		 */
		// Declaramos variables para las tiradas
		int tirada1, tirada2;

		// Creamos un Scanner para leer la entrada
		Scanner sc = new Scanner(System.in);

		// Mensaje para la primera tirada
		System.out.println("Primera tirada");

		// Inicio del bucle para la primera tirada
		do {

			// Leemos el valor de la primera tirada
			tirada1 = sc.nextInt();

			// Verificamos si el valor es válido
			if (tirada1 >= 1 && tirada1 <= 6) {

				// Mensaje de confirmación
				System.out.println("Valor correcto");

			} else {
				// Mensaje de error
				System.out.println("Introduce un valor correcto");
			}
			// Repite hasta que el valor sea válido
		} while (!(tirada1 >= 1 && tirada1 <= 6));

		// Salida del resultado
		System.out.println("El valor de la primera tirada es de " + tirada1);

		// Mensaje para la segunda tirada
		System.out.println("Segunda tirada");
		// Inicio del bucle para la segunda tirada
		do {

			// Leemos el valor de la segunda tirada
			tirada2 = sc.nextInt();

			// Verificamos si el valor es válido
			if (tirada2 >= 1 && tirada2 <= 6) {

				// Mensaje de confirmación
				System.out.println("Valor correcto");
			} else {
				// Mensaje de error
				System.out.println("Introduce un valor correcto");
			}
			// Repite hasta que el valor sea válido
		} while (!(tirada2 >= 1 && tirada2 <= 6));

		// Salida del resultado
		System.out.println("El valor de la segunda tirada es de " + tirada2);

		// Imprime la suma
		System.out.println("La suma de los dados es de " + (tirada1 + tirada2));

		// Cerramos el Scanner.
		sc.close();
	}
}
