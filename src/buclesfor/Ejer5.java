package buclesfor;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		/*
		 * Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se
		 * denota 5! y es igual a 5x4x3x2x1 = 120.
		 */
		// Declaramos la variable que almacenará el número dado por el usuario.
		int numero;

		// Declaramos la variable que almacenará el resultado.
		int multiplicacion = 1;

		// Creamos Scanner.
		Scanner sc = new Scanner(System.in);

		// Preguntamos el número
		System.out.println("Introduce el número");

		// Leemos entrada de teclado.
		numero = sc.nextInt();

		// Creamos bucle for.
		for (int i = numero; i > 1; i--) {
			// Multiplicamos el valor inicial 1 al número (1*5=5) para que en su proxima
			// iteracion sea 5x4 y así sucesivamente.
			multiplicacion *= i;
		}

		// Imprimimos el resultado
		System.out.println("El factorial de " + numero + " es " + multiplicacion);

		// Cerramos Scanner.
		sc.close();
	}
}
