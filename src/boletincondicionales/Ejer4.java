package boletincondicionales;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que solicite al usuario un número entero entre 1 y 99. El
		 * programa debe mostrarlo con letras, por ejemplo, para 56 se verá: “cincuenta
		 * y seis”.
		 */
		// Creamos la variable que almacenará el número entero.
		int numero;
		int longitud;
		String numeroString;
		int primerNumero;
		int segundoNumero;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		// Preguntamos al usuario el número
		System.out.println("Introduce el número");
		// Leemos entrada de teclado
		numero = sc.nextInt();
		numeroString = Integer.toString(numero);
		longitud = numeroString.length();
		if (longitud == 1) {
			switch (numero) {
			case 1 -> System.out.println("Uno");
			case 2 -> System.out.println("Dos");
			case 3 -> System.out.println("Tres");
			case 4 -> System.out.println("Cuatro");
			case 5 -> System.out.println("Cinco");
			case 6 -> System.out.println("Seis");
			case 7 -> System.out.println("Siete");
			case 8 -> System.out.println("Ocho");
			case 9 -> System.out.println("Nueve");
			}
		} else {
			primerNumero = numero / 10;
			segundoNumero = numero % 10;
			switch (primerNumero) {
			case 1 -> System.out.println("Diez");
			case 2 -> System.out.println("Veinte");
			case 3 -> System.out.println("Treinta");
			case 4 -> System.out.println("Cuarenta");
			case 5 -> System.out.println("Cincuenta");
			case 6 -> System.out.println("Sesenta");
			case 7 -> System.out.println("Setenta");
			case 8 -> System.out.println("Ochenta");
			case 9 -> System.out.println("Noventa");
			}
			switch (segundoNumero) {
			case 1 -> System.out.println("Uno");
			case 2 -> System.out.println("Dos");
			case 3 -> System.out.println("Tres");
			case 4 -> System.out.println("Cuatro");
			case 5 -> System.out.println("Cinco");
			case 6 -> System.out.println("Seis");
			case 7 -> System.out.println("Siete");
			case 8 -> System.out.println("Ocho");
			case 9 -> System.out.println("Nueve");
			}
		}
	}

}
