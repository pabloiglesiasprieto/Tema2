package buclesfor;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida dos números enteros A y B. Luego visualiza los
		 * números que hay entre A y B. Si A es menor que B, entonces debe mostrar los
		 * números desde A hasta B. Si B es menor que A, entonces debe mostrar los
		 * números desde B hasta A.
		 */
		// Declaramos las variables que almacenará los números A y B.
		int a, b;

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);

		// Preguntamos el primer número
		System.out.println("Introduce el primer número");

		// Leemos entrada de teclado
		a = sc.nextInt();

		// Preguntamos el segundo número
		System.out.println("Introduce el segundo número");

		// Leemos entrada de teclado
		b = sc.nextInt();

		// Creamos bucle
		if (a < b) {
			System.out.println("Numeros de " + a + " a " + b);
			for (; a <= b; a++)
				System.out.println(a);
		} else if (a > b) {
			System.out.println("Numeros de " + b + " a " + a);
			for (; b <= a; b++)
				System.out.println(b);
		}
		// Cerramos el Scanner
		sc.close();
	}
}
