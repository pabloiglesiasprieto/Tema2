package boletincondicionales;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		// Dada una hora por teclado, (horas, minutos y segundos) realiza un algoritmo
		// que muestre la hora después de incrementar un segundo.
		// Declaramos las variables que almacenaran las horas, minutos y segundos.
		int horas, minutos, segundos;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		// Lee pedimos al usuario que introduzca las horas.
		System.out.println("Introduce las horas");
		// Leemos entrada de teclado.
		horas = sc.nextInt();
		// Lee pedimos al usuario que introduzca los minutos.
		System.out.println("Introduce los minutos");
		// Leemos entrada de teclado.
		minutos = sc.nextInt();
		// Lee pedimos al usuario que introduzca los segundos.
		System.out.println("Introduce los segundos");
		// Leemos entrada de teclado.
		segundos = sc.nextInt();
		// Incrementamos en 1 los segundos.
		++segundos;
		if (segundos == 60) {
			minutos += 1;
			segundos = 0;
			System.out.println(
					"La hora es de: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
		}
		if (minutos == 60) {
			horas += 1;
			minutos = 0;
			System.out.println(
					"La hora es de: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
		} else {
			System.out.println(
					"La hora es de: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
		}
		// Cerramos el Scanner.
		sc.close();
	}
}
