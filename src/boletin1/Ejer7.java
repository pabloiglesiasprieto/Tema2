package boletin1;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		/*
		 * Escribir una aplicación que indique cuántas cifras tiene un número
		 * introducido por teclado, que está comprendido entre 0 y 99999.
		 */
		// Declaramos la variable que almacenará el número dado por el usuario.
		int numero;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		// Preguntamos el número.
		System.out.println("¿Cuál es el número?");
		numero = sc.nextInt();
		if (numero >= 0 && numero == 9) {
			System.out.println("El número tiene 1 cifra");
		} else if (numero >= 10 && numero == 99) {
			System.out.println("El número tiene 2 cifras");

		} else if (numero >= 100 && numero <= 999) {
			System.out.println("El número tiene 3 cifras");

		} else if (numero >= 1000 && numero <= 9999) {
			System.out.println("El número tiene 4 cifras");

		} else if (numero >= 10000 && numero <= 99999) {
			System.out.println("El número tiene 5 cifras");
		}
		// Cerramos el Scanner
		sc.close();
	}
}
