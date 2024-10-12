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
			case 1 -> System.out.print("uno");
			case 2 -> System.out.print("dos");
			case 3 -> System.out.print("tres");
			case 4 -> System.out.print("cuatro");
			case 5 -> System.out.print("cinco");
			case 6 -> System.out.print("seis");
			case 7 -> System.out.print("siete");
			case 8 -> System.out.print("ocho");
			case 9 -> System.out.print("nueve");
			}
		} else {
			primerNumero = numero / 10;
			segundoNumero = numero % 10;
			switch (primerNumero) {
			case 1 -> System.out.print("Diez y ");
			case 2 -> System.out.print("Veinte y ");
			case 3 -> System.out.print("Treinta y ");
			case 4 -> System.out.print("Cuarenta y ");
			case 5 -> System.out.print("Cincuenta y ");
			case 6 -> System.out.print("Sesenta y ");
			case 7 -> System.out.print("Setenta y ");
			case 8 -> System.out.print("Ochenta y ");
			case 9 -> System.out.print("Noventa y ");
			}
			switch (segundoNumero) {
			case 1 -> System.out.print("uno");
			case 2 -> System.out.print("dos");
			case 3 -> System.out.print("tres");
			case 4 -> System.out.print("cuatro");
			case 5 -> System.out.print("cinco");
			case 6 -> System.out.print("seis");
			case 7 -> System.out.print("siete");
			case 8 -> System.out.print("ocho");
			case 9 -> System.out.print("nueve");
			}
			// Cerramos el Scanner.
			sc.close();
		}
	}

}
