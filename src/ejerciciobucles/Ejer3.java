package ejerciciobucles;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		/*
		 * Para dos números dados, a y b, es posible calcular el máximo común divisor
		 * (el número más grande que divide a ambos) mediante un algoritmo ineficiente
		 * pero sencillo: desde el menor de a y b, ir buscando, de forma decreciente
		 * (-1), el primer número que divide a ambos simultáneamente. Teniendo en cuenta
		 * lo que se acaba de explicar, realiza un programa que calcule el máximo común
		 * divisor de dos números.
		 */
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		int menor;
		int mcd;
		// Solicitar los dos números al usuario
		System.out.print("Ingrese el primer número (a): ");
		a = scanner.nextInt();
		System.out.print("Ingrese el segundo número (b): ");
		b = scanner.nextInt();

		// Determinar el menor de los dos números
		menor = Math.min(a, b);
		mcd = 1; // Inicializamos el MCD en 1

		// Buscar el MCD de forma decreciente
		for (int i = menor; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				mcd = i; // Encontramos el MCD
				break; // Salimos del bucle
			}
		}

		// Mostrar el resultado
		System.out.println("El máximo común divisor de " + a + " y " + b + " es: " + mcd);
		// Cerramos el Scanner.
		scanner.close();
	}
}
