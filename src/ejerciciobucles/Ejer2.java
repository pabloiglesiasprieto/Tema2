package ejerciciobucles;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		int contador = 0; // Contador de números primos
		boolean esPrimo = true;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número n: ");
		int n = scanner.nextInt();

		// Iterar desde 1 hasta n
		for (int i = 1; i <= n; i++) {
			esPrimo = true; // Asumimos que el número es primo

			if (i < 2) {
				esPrimo = false; // Números menores que 2 no son primos
			} else {
				// Verificar si i es primo
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						esPrimo = false; // i no es primo
						break; // Salir del bucle si encontramos un divisor
					}
				}
			}

			// Si es primo, incrementar el contador
			if (esPrimo) {
				contador++;
			}
		}

		System.out.println("Hay " + contador + " números primos entre 1 y " + n + ".");
		scanner.close();
	}
}
