package buclesfor;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa en java que pida un número entero positivo y nos diga si
		 * es primo o no.
		 */
		// Declaramos la variable que almacenará el número dado por el usuario.
		int numero;
		Boolean primo = true;
		int resultado = 1;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el número
		System.out.println("Introduce el número");

		// Leemos entrada de teclado
		numero = sc.nextInt();

		// Creamos un bucle.
		/*
		 * Inicializamos el valor de i a numero - 1, ya que empezaré dividiendo desde el
		 * // número anterior, el bucle parará hasta que i llegue a 1 y por cada bucle
		 * se // quitará 1 a i
		 */
		for (int i = numero - 1; i > 1; i--) {

			// Almacenamos el resto de numero entre i en resultado
			resultado = numero % i;

			// Si el resultado es 0 
			if (resultado == 0 ) {

				// Asignamos el valor false al booleano
				primo = false;

				// Rompemos el bucle.
				break;
			}
		}
		// Si primo es false, el número no es primo, si es true, es primo
		System.out.println(primo ? "El número es primo" : "El número no es primo");

		// Cerramos el Scanner
		sc.close();
	}
}
