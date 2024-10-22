package buclesfor;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		/*
		 * Escribir una aplicación para aprender a contar, que pedirá un número n y
		 * mostrará todos los números del 1 al n.
		 */
		// Declaramos la variable que almacenará el número dado por el usuario.
		int numero;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Preguntamos el número
		System.out.println("Cual es el número");

		// Leemos entrada de teclado
		numero = sc.nextInt();

		// Creamos bucle

		// Inicializamos la variable i a 1, hasta que i iguale a número, el bucle
		// seguirá, por cada iteración se incrementará i.
		for (int i = 1; i <= numero; i++) {
			// Imprimimos el resultado
			System.out.println(i);
		}
		// Cerramos el Scanner.
		sc.close();
	}
}
