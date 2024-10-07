package boletin1;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		/*
		 * Escribir una aplicación que pida al usuario un número real y muestre por
		 * pantalla la nota del alumno, teniendo en cuenta: [0-5) es INSUFICIENTE (0
		 * inclusive) [5-6) es SUFICIENTE (5 inclusive) [6-7) es BIEN (6 inclusive)
		 * [7-9) es NOTABLE (7 inclusive) [9-10] es SOBRESALIENTE (9 y 10 inclusives)
		 */
		// Declaramos la variable que almacenará el número dado por el usuario.
		int numero;
		// Creamos un Scanner para leer el teclado.
		Scanner sc = new Scanner(System.in);
		// Preguntamos por el número que introducirá.
		System.out.println("Introduce un número");
		// Leemos el número que introduce el usuario.
		numero = sc.nextInt();
		// Creamos condicional
		// En este condicional indicamos que si el número entra dentro del intervalo
		// [0,5), la nota será de INSUFICIENTE.
		if (numero == 0 && numero < 5) {
			// Imprimimos que la nota es de insuficiente.
			System.out.println("INSUFICIENTE");
			// Colocaremos un else if para indicar los siguientes resultados.
			// Si la nota está en un intervalo de [5,6), la nota será de SUFICIENTE.
		} else if (numero >= 5 && numero < 6) {
			System.out.println("SUFICIENTE");
			// Si la nota está en un intervalo de [6,7), la nota será de SUFICIENTE.
		} else if (numero >= 6 && numero < 7) {
			System.out.println("BIEN");
			// Si la nota está en un intervalo de [7,9), la nota será de SUFICIENTE.
		} else if (numero >= 7 && numero < 9) {
			System.out.println("NOTABLE");
			// Si la nota está en un intervalo de [9,10], la nota será de SUFICIENTE.
		} else if (numero >= 9 && numero <= 10) {
			System.out.println("SOBRESALIENTE");
		}
		// Cerramos el Scanner.
		sc.close();
	}
}
