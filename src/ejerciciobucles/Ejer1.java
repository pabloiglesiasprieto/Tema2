package ejerciciobucles;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que incremente la hora de un reloj. Se pedirán por
		 * teclado: Hora Minutos Segundos Cantidad de segundos a incrementar La
		 * aplicación debe mostrar la nueva hora. Por ejemplo, si el usuario introduce
		 * hora=13, minutos=59 y segundos=51, y se desea incrementar en 10 segundos, el
		 * resultado a mostrar es 14:00:01.
		 */
		// Declaramos las variables que almacenarán las horas, minutos y segundos.
		int horas, minutos, segundos;

		// Declaramos las variables que almacenará los segundos a incrementar.
		int incremento;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		do {
			// Le pedimos al usuario que introduzca las horas.
			System.out.println("Introduce las horas");

			// Leemos entrada de teclado
			horas = sc.nextInt();
		} while (!(horas > -1));
		do {
			// Le pedimos al usuario que introduzca los minutos.
			System.out.println("Introduce los minutos");

			// Leemos entrada de teclado
			minutos = sc.nextInt();
		} while ((minutos <= -1) || (minutos >= 60));

		do {

			// Le pedimos al usuario que introduzca los segundos.
			System.out.println("Introduce los segundos");

			// Leemos entrada de teclado
			segundos = sc.nextInt();
		} while ((segundos <= -1) || (segundos >= 60));

		// Le pedimos la usuario la cantidad de segundos que quiere incrementar.
		System.out.println("Introduce los segundos a incrementar.");

		// Leemos entrada de teclado
		incremento = sc.nextInt();
		for (int i = 1; i <= incremento; i++) {
			segundos += i;
			if (segundos >= 60) {
				minutos += 1;
				segundos = 0;
			}
			if (minutos == 60) {
				horas += 1;
				minutos = 0;
			}
		}
		System.out.println("El tiempo es de " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
	}

}
