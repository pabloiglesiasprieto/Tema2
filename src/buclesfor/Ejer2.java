package buclesfor;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número
		 * que introducimos por teclado.
		 */
		// Declaramos la variable que almacenará el número dado por el usuario.
		int numero;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario que introduzca el número
		System.out.println("Cuantos multiplos de 3 quieres imprimir");

		// Leemos entrada de teclado.
		numero = sc.nextInt();

		// Creamos un bucle.
		// Declaramos la variable i a 1, el bucle se iterará hasta que alcance al número
		// que ha dado el usuario, se incrementará en 1 i por cada iteración.
		for (int i = 1; i <= numero; i++) {
			// Imprimimos el resultado.
			System.out.println(3 + "x" + i + "=" + 3 * i);
		}

		// Cerramos el Scanner.
		sc.close();
	}
}
