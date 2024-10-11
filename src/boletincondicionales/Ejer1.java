package boletincondicionales;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		/*
		 * Escribe una aplicación que solicite al usuario un número comprendido entre 0
		 * y 9999. La aplicación tendrá que indicar si el número introducido es capicúa.
		 * Un número es capicúa si se lee igual de izquierda a derecha que de derecha a
		 * izquierda.
		 */
		// Declaramos la variable que almacenará el número que introducirá el usuario.
		int numero;
		String numeroletras;
		int longitud;
		int primeracifra;
		int ultimacifra;
		Boolean Capicua;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		// Preguntamos el número
		System.out.println("Introduce el número");
		// Leemos entrada de teclado.
		numero = sc.nextInt();
		numeroletras = Integer.toString(numero);
		longitud = numeroletras.length();
		if (longitud == 1) {
			System.out.println("Es capicua");
		} else if (longitud == 2) {
			primeracifra = numero / 10;
			ultimacifra = numero % 10;
			Capicua = primeracifra == ultimacifra;
			System.out.println((Capicua) ? "Es capicua" : "No es capicua");
		} else if (longitud == 3) {
			primeracifra = numero / 100;
			ultimacifra = numero % 10;
			Capicua = primeracifra == ultimacifra;
			System.out.println((Capicua) ? "Es capicua" : "No es capicua");
		} else if (longitud == 4) {
			primeracifra = numero / 1000;
			ultimacifra = numero % 10;
			Capicua = primeracifra == ultimacifra;
			System.out.println((Capicua) ? "Es capicua" : "No es capicua");
 		} else {
 			System.out.println("Pon un número entre 0 y 9999");
 		}
		sc.close();
	}
}
