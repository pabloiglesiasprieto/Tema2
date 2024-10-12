package boletincondicionales;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		/*
		 * Pedir al usuario el número de un mes y el año (comprobando si es o no
		 * bisiesto). Debe imprimir por pantalla el número de días que tiene el mes.
		 */
		// Declaramos las variables que almacenarán el año y el mes.
		String mes;
		int año;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		// Preguntamos al usuario cual es el año.
		System.out.println("Introduce el año");
		// Leemos entrada de teclado.
		año = sc.nextInt();
		// Limpiamos buffer de entrada.
		sc.nextLine();
		// Preguntamos al usuario que introduzca el mes.
		System.out.println("Introduce el mes");
		// Leemos entrada de teclado.
		mes = sc.nextLine();
		// Si el año es divisible entre 4, es bisiesto.
		if (año % 4 == 0) {
			// Creamos un switch
			switch (mes.toUpperCase()) {
			// Si el usuario ha escrito alguno de los siguientes meses, se imprimirá que
			// tiene 31 días.
			case "ENERO", "MARZO", "MAYO", "JULIO", "AGOSTO", "OCTUBRE", "DICIEMBRE" ->
				System.out.println("Tiene 31 días");
			// Si el usuario ha escrito alguno de los siguientes meses, se imprimirá que
			// tiene 30 días.
			case "ABRIL", "JUNIO", "SEPTIEMBRE", "NOVIEMBRE" -> System.out.println("Tiene 30 días");
			// Si el usuario ha escrito 'Febrero', se imprimirá que tiene 29 días.
			case "FEBRERO" -> System.out.println("Tiene 29 días");
			// Si el usuario ha escrito un mes erroneo, se imprimirá el error.
			default -> System.err.println("Introduce un mes válido.");
			}
			// Si no se cumple la condición, se ejecutará el bloque else.
		} else {
			switch (mes.toUpperCase()) {
			// Si el usuario ha escrito alguno de los siguientes meses, se imprimirá que
			// tiene 31 días.
			case "ENERO", "MARZO", "MAYO", "JULIO", "AGOSTO", "OCTUBRE", "DICIEMBRE" ->
				System.out.println("Tiene 31 días");
			// Si el usuario ha escrito alguno de los siguientes meses, se imprimirá que
			// tiene 30 días.
			case "ABRIL", "JUNIO", "SEPTIEMBRE", "NOVIEMBRE" -> System.out.println("Tiene 30 días");
			// Si el usuario ha escrito 'Febrero', se imprimirá que tiene 29 días.
			case "FEBRERO" -> System.out.println("Tiene 28 días");
			// Si el usuario ha escrito un mes erroneo, se imprimirá el error.
			default -> System.err.println("Introduce un mes válido.");
			}
		}
		// Cerramos el Scanner.
		sc.close();
	}
}
