package boletin1;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		// Pedir dos números enteros y decir si son iguales o no
		// Declaramos las variables.
		int primerNumero;
		int segundoNumero;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		// Preguntamos por el primer número.
		System.out.println("¿Cuál es el primer número?");
		// Leemos entrada de teclado.
		primerNumero = sc.nextInt();
		// Preguntamos por el segundo número
		System.out.println("¿Cuál es el segundo número?");
		// Leemos entrada de teclado.
		segundoNumero = sc.nextInt();
		// Creamos condicional
		if (primerNumero == segundoNumero) {
			// Imprimimos resultado si la condición se cumple.
			System.out.println(primerNumero + " es igual a " + segundoNumero);
			// Creamos else
		} else {
			// Imprimimos si la condición no se cumple
			System.out.println("Los números no son iguales.");
		}
		// Cerramos el scanner.
		sc.close();
	}
}
