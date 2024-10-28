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
		minimo = 0;
		// Creamos un bucle
		for (; numero != 0;) {
			if (minimo == 0) {
				minimo = numero;
			} else {
				if (numero > minimo) {
					minimo = numero;
				} else {
					System.out.println("1 error");
					error++;
				}
			}
		}
		System.out.println("Salida del bucle");
	}

}
