package boletin1;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		/*
		 * Diseñar una aplicación que solicite al usuario un número e indique si es par
		 * o impar.
		 */
		// Declaramos las variables.
		int numero;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		// Preguntamos por el número.
		System.out.println("¿Cuál es el número?");
		// Leemos entrada de teclado.
		numero = sc.nextInt();
		// Creamos condicional
		if (numero % 2 == 0) {
			// Imprimimos que el número es par.
			System.out.println("El número es par");
			// Creamos un else.
		} else {
			// Imprimimos que el número es impar.
			System.out.println("El número es impar.");
		}
		sc.close();
	}
}
