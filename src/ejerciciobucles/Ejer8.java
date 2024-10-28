package ejerciciobucles;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que lea y acepte únicamente aquellos que sean mayores que
		 * el último dado. La introducción de números finaliza con la introducción de un
		 * 0. Al final se mostrará: El total de números introducidos, excluido el 0. El
		 * total de números fallados.
		 */
		// Declaramos la variable que almacenará el número dado por el usuario.
		int numero;
		int minimo = 0;
		int error = 0;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Le preguntamos al usuario el número
		System.out.println("Introduce el número");
		// Leemos entrada de teclado
		numero = sc.nextInt();

		// Creamos un bucle.
		// Si númeor es distinto de 0, se iterará
		for (; numero != 0;) {
			// Si mínimo es cero
			if (minimo == 0) {
				// Asignamos el valor de minimo a numero.
				minimo = numero;

				// Si no se cumple la condición
			} else {

				// Si numero es mayor al numero minimo
				if (numero > minimo) {
					// Asignamos al numero minimo a numero.
					minimo = numero;

					// Si no se cumple la condición se ejecutara este bucle
				} else {
					// Imprimimos que hay 1 error.
					System.out.println("1 error");
					// Incrementamos en 1 el error.
					error++;
				}
			}
			// Introducimos el valor mínimo
			System.out.println("Introduce un número " + "el actual es " + minimo);
			// Leemos entrada de teclado
			numero = sc.nextInt();
		}
		// Imprimimos salida del bucle
		System.out.println("Salida del bucle");
		// Imprimimos el número de errores.
		System.out.println("Hay un total de " + error + " errores");
	}

}
