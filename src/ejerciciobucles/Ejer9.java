package ejerciciobucles;

import java.util.Scanner;

public class Ejer9 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
		 * por teclado. El número introducido debe ser mayor que 0.
		 */
		// Creamos una variable que almacenará el número dado por el usuario
		int numero;

		// Declaramos e inicializamos la variable contador en 0
		int contador = 0;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos un do-while
		do {
			// Le preguntamos al usuario el número
			System.out.println("Introduce el número");

			// Leemos entrada de teclado
			numero = sc.nextInt();

			// El bucle se repetirá hasta que el número sea mayor que 0
		} while (numero <= 0);

		// Si numero es distinto de 0, se seguirá iterando el bucle, para cada iteración
		// se irá dividiendo numero entre 10 hasta que el resultado de 0
		for (; numero != 0; numero /= 10) {

			// Se incrementa el contador por cada iteración
			contador++;
		}
		// Imprimo el numero de digitos.
		System.out.println("Tiene " + contador + " digitos");

		// Cerramos el Scanner.
		sc.close();
	}
}
