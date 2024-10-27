package ejerciciobucles;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		/*
		 * Solicita al usuario un número n y dibuja un triángulo de base y altura n. Por
		 * ejemplo para n=4 debe dibujar lo siguiente:
		 */
		// Declaramos la variable que almacenará la base y la altura del triangulo.
		int batura;

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);

		// Le preguntamos al usuario la base.
		System.out.println("Introduce la base.");
		// Leemos entrada de teclado
		batura = sc.nextInt();

		// Creamos un bucle
		for (int i = 1; i <= batura; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// Cerramos el Scanner
		sc.close();

	}
}
