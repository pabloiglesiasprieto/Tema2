package ejerciciobucles;

import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que nos diga si un número introducido por teclado es
		 * capicúa o no. El número debe ser mayor o igual que 0.
		 */
		// Declaramos una variable entera para almacenar el número ingresado por el
		// usuario.
		int numero;

		// Declaramos e inicializamos una variable entera para almacenar el número
		// invertido.
		int inverso = 0;

		// Declaramos una variable entera para almacenar el último dígito del número.
		int ultimoDigito;

		// Declaramos una variable entera para trabajar con una copia del número
		// original.
		int numerov2;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Le preguntamos al usuario el número.
		System.out.println("Introduce el número");

		// Leemos la entrada de teclado y almacenamos el valor en la variable 'numero'.
		numero = sc.nextInt();

		// Asignamos el valor de 'numero' a 'numerov2' para trabajar con una copia.
		numerov2 = numero;

		// Iniciamos un bucle 'while' que se ejecuta mientras 'numerov2' sea mayor que
		// 0.
		while (numerov2 > 0) {

			// Obtenemos el último dígito de 'numerov2' usando el operador módulo.
			ultimoDigito = numerov2 % 10;

			// Construimos el número invertido multiplicando 'inverso' por 10 y sumando
			// 'ultimoDigito'.
			inverso = (inverso * 10) + ultimoDigito;

			// Eliminamos el último dígito de 'numerov2' dividiéndolo entre 10.
			numerov2 /= 10;
		}

		// Comprobamos si el número original es igual al número invertido.
		if (numero == inverso)
			// Si son iguales, imprimimos que el número es capicúa.
			System.out.println("Es capicua");
		else
			// Si no son iguales, imprimimos que el número no es capicúa.
			System.out.println("No es capicua");

		// Cerramos el Scanner.
		sc.close();
	}
}