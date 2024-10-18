package dowhile;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que muestre la tabla de multiplicar de un número
		 * introducido por teclado. Por ejemplo, si se introduce el número 3 se debe
		 * imprimir lo siguiente:
		 */
		// Creamos una variable que será la que almacenará el valor dado por el usuario.
		int numero;

		// Creamos un contador que almacenará el número iteraciones.
		int contador = 1;

		// Creamos una variable que almacenará el número del resultado.
		int resultado;

		// Creamos un scanner.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el número
		System.out.println("Escribe el número");

		// Leemos entrada de teclado.
		numero = sc.nextInt();

		// Creamos un do-while
		do {

			// Almacenamos en una variable que el valor de la operación
			resultado = contador * numero;

			// Imprimimos la operacion.
			System.out.println(numero + "x" + contador + "" + "=" + resultado);

			// Aumentamos en 1 el contador
			++contador;

			// Hasta que contador alcance el valor de 10.
		} while (contador <= 10);

		// Salimos del bucle
		System.out.println("Bucle finalizado");

		// Cerramos el Scanner.
		sc.close();
	}
}
