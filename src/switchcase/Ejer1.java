package switchcase;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		/*
		 * Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma:
		 * insuficiente (de 0 a 4), suficiente (5), bien (6), notable (7 y 8) y
		 * sobresaliente (9 y 10).
		 */
		// Declaramos las variables.
		int numero;
		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);
		// Preguntamos al usuario que número va a introducir
		System.out.println("Introduce una nota");
		// Leemos el valor que introduce el usuario
		numero = sc.nextInt();
		// Creamos un Switch
		switch (numero) {
		// En caso de que el usuario introduzca un valor entre [0,4] imprimirá que está
		// insuficiente
		case 1, 2, 3, 4:
			// Imprimimos insuficiente.
			System.out.println("Insuficiente");
			// En caso de que el usuario saque un 5, imprimiremos suficiente
		case 5:
			// Imprimimos suficiente
			System.out.println("Suficiente");
			// En caso de que saque 6, imprimiremos bien.
		case 6:
			// Imprimimos bien
			System.out.println("Bien");
			// En caso de que saque [7,8], es un notable
		case 7, 8:
			// Imprimimos Notable
			System.out.println("Notable");
			// En caso de que saque [9,10], imprimimos Sobresaliente
		case 9, 10:
			// Imprimimos Sabresaliente
			System.out.println("Sobresaliente");
		}
		// Cerramos el Scanner
		sc.close();
	}
}
