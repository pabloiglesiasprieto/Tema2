package bucles;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		/*
		 * Implementar una aplicación para calcular datos estadísticos de las edades de
		 * los alumnos de un centro educativo. Se introducirán datos hasta que uno de
		 * ellos sea negativo, y se mostrará: la suma de todas las edades introducidas,
		 * la media, el número de alumnos y cuántos son mayores de edad.
		 */
		// Declaramos e inicializamos la variable que almacenará la edad.
		int edad = 0;

		// Declaramos e inicializamos la variable suma.
		int suma = 0;

		// Declaramos e inicializamos la variable que servirá como contador.
		int contador = 0;

		// Declaramos e inicializamos la variable de los mayores de edad.
		int contadorMayor = 0;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos bucle.
		while (edad >= 0) {
			// Preguntamos la primera edad.
			System.out.println("Cual es la primera edad.");

			// Leemos entrada de teclado
			edad = sc.nextInt();

			// Si la edad es superior a 0, se suman las edades y se aumenta el contador
			// (sirve para la media).
			if (edad > 0) {
				suma += edad;
				contador++;

				// Si la edad es superior a 18, se incrementa el contador de mayores de edad.
				if (edad >= 18) {
					++contadorMayor;
				}
			}
		}
		// Imprimimos la suma de todas las edades.
		System.out.println("La suma de todas las edades es de " + suma);

		// Imprimimos el total de alumnos.
		System.out.println("Hay un total de " + contador + " alumnos");

		// Imprimimos la media aritmética.
		System.out.println("La media aritmética de los alumnos es de " + suma / contador);

		// Imprimimos el número de mayores de edad.
		System.out.println("Hay un total de " + contadorMayor + " alumnos mayores de edad");

		// Cerramos el Scanner.
		sc.close();
	}
}
