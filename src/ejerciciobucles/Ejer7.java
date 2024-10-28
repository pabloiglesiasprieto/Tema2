package ejerciciobucles;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que lea un número n e imprima una pirámide de números con
		 * n filas:
		 */
		Scanner scanner = new Scanner(System.in);
		// Leer el número de filas
		System.out.print("Introduce el número de filas (n): ");
		int n = scanner.nextInt();

		// Generar la pirámide
		for (int i = 1; i <= n; i++) {

			// Imprimir la parte izquierda de la pirámide
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			// Imprimir la parte derecha de la pirámide
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}
			// Nueva línea después de cada fila
			System.out.println();
		}

		scanner.close();
	}

}
