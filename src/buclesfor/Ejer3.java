package buclesfor;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		// Pedir diez números por teclado y mostrar la media.
		// Declaramos la variable que almacenará los números introducidos por teclado.
		int numero;
		int suma = 0;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle
		for (int i = 1; i <= 10; i++) {
			// Preguntamos el número
			System.out.println("Introduce el número");
			// Leemos entrada de teclado.
			numero = sc.nextInt();
			// Añadimos el valor de numero a suma
			suma += numero;
		}
		// Imprimimos el resultado.
		System.out.println("La media de los 10 números es de " + (double) suma / 10);

		// Cerramos el Scanner.
		sc.close();
	}
}
