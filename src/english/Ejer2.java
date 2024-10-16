package english;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa en el cual el usuario introduce un valor y tenemos que
		 * hacer su tabla de multiplicación
		 */
		// We create a variable that storages the number added by the user
		int number;

		// Create a counter that storages the loops.
		int counter = 1;

		// Create a variable the storages the result of the multiplication.
		int result;

		// Create a Scanner.
		Scanner sc = new Scanner(System.in);

		// We ask the user the number
		System.out.println("Write the number");
		number = sc.nextInt();

		// Create a loop
		while (counter <= 10) {
			result = counter * number;
			System.out.println(result);
			++counter;
		}
		// Leave the loop
		System.out.println("Loop finished");

		// Close of Scanner.
		sc.close();
	}
}
