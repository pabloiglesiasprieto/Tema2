package ejerciciobucles;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre
		 * por pantalla los números desde 1 hasta N, uno en cada línea, repitiendo cada
		 * número tantas veces como su valor. Ejemplo:
		 */
		// Declaramos la variable que almacenará el número dado por el usuario.
		int numero;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Le preguntamos al usuario el número.
		System.out.println("Introduce el número");
		numero = sc.nextInt();
		while (numero < 0 || numero > 20) {
			System.out.println("Introduce un número correcto");
			numero = sc.nextInt();
		}

		// Creamos un bucle
		for (int i = 1; i <= numero; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println(); // Nueva línea después de imprimir cada número
		}
		// Cerramos el Scanner
		sc.close();

	}

}
