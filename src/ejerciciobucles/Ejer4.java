package ejerciciobucles;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		/*
		 * De forma similar a la actividad 4, realiza un programa que calcule el mínimo
		 * común múltiplo de dos números dados. En este caso, habrá que partir del
		 * máximo de los dos e ir incrementando hasta encontrar el primer número que sea
		 * múltiplo de los dos números.
		 */

		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		int maximo;
		int mcm;

		// Solicitar los dos números al usuario
		System.out.print("Ingrese el primer número (a): ");
		a = scanner.nextInt();
		System.out.print("Ingrese el segundo número (b): ");
		b = scanner.nextInt();

		// Determinar el máximo de los dos números
		maximo = Math.max(a, b);
		mcm = maximo; // Inicializamos el MCM con el máximo

		// Buscar el MCM
		while (true) {
			// Verificamos si el MCM actual es múltiplo de ambos números
			if (mcm % a == 0 && mcm % b == 0) {
				break; // Si es múltiplo de ambos, salimos del bucle
			}
			mcm++; // Incrementamos el MCM
		}

		// Mostrar el resultado
		System.out.println("El mínimo común múltiplo de " + a + " y " + b + " es: " + mcm);
	}
}
