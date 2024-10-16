package english;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		/*
		 * El usuario tiene que introducir números, si el número es par, sumamos par, si
		 * es impar, sumamos impar, si no quiere introducir más datos, tiene que
		 * introducir un valor negativo.
		 */
		// Create a variable that storages the number added by the user.
		int number = 0;

		// Create a Scanner.
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario el número
		System.out.println("Add a number");

		// Read the keyboard.
		number = sc.nextInt();

		// Create a loop.

		while (number >= 0) {
			if (number % 2 == 0) {
				System.out.println("Is even");
			} else {
				System.out.println("Is odd");
			}
			// Preguntamos al usuario el número
			System.out.println("Add a number");

			// Read the keyboard.
			number = sc.nextInt();
		}
		// Leave of loop.
		System.out.println("Salida del bucle");
		// Close the Scanner.
		sc.close();
	}
}
