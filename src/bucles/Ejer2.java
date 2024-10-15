package bucles;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que vaya pidiendo al usuario números enteros positivos
		 * que debe ir contando. Cuando el usuario no quiera insertar más números,
		 * introducirá un número negativo y el algoritmo, antes de acabar, mostrará la
		 * cantidad de números positivos introducidos por el usuario.
		 */
		// Declaramos e inicializamos la variable que almacenará el valor dado por el
		// usuario.
		int numero = 0;

		// Declaramos e inicializamos la variable que almacenará las iteraciones.
		int iteraciones = 0;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle
		while (numero >= 0) {
			// Preguntamos al usuario que introduzca un número
			System.out.println("Introduce el número");

			// Leemos entrada de teclado
			numero = sc.nextInt();

			// Incrementamos en 1 el contador de bucles.
			iteraciones++;
		}
		// Mensaje que indica la salida del bucle
		System.out.println("Introduciste un número negativo");

		// Imprimimos el total de iteraciones quitándole 1 unidad (El número negativo
		// que introducimos).
		System.out.println("Introduciste un total de " + --iteraciones + " numeros positivos");

		// Cerramos el Scanner.
		sc.close();
	}
}
