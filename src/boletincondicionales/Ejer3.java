package boletincondicionales;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		/*
		 * Diseña una aplicación en la que, dado un número de DNI, calcule la letra que
		 * le corresponde. Observa que un número de 8 dígitos está dentro del rango del
		 * tipo int.
		 */
		// Declaramos la variable que almacenará el DNI.
		int DNI;

		// Declaramos la variable para la operación.
		int operacion;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Preguntamos el DNI.
		System.out.println("Introduce el DNI.");

		// Leemos entrada de teclado.
		DNI = sc.nextInt();

		// Calculamos cual es el valor de la letra.
		operacion = DNI % 23;

		// Creamos SWITCH
		switch (operacion) {
		// Caso 0
		case 0:
			System.out.println("La letra del DNI es 'T'");
			break;

		// Caso 1
		case 1:
			System.out.println("La letra del DNI es 'R'");
			break;

		// Caso 2
		case 2:
			System.out.println("La letra del DNI es 'W'");
			break;

		// Caso 3
		case 3:
			System.out.println("La letra del DNI es 'A'");
			break;

		// Caso 4
		case 4:
			System.out.println("La letra del DNI es 'G'");
			break;

		// Caso 5
		case 5:
			System.out.println("La letra del DNI es 'M'");
			break;

		// Caso 6
		case 6:
			System.out.println("La letra del DNI es 'Y'");
			break;

		// Caso 7
		case 7:
			System.out.println("La letra del DNI es 'F'");
			break;

		// Caso 8
		case 8:
			System.out.println("La letra del DNI es 'P'");
			break;

		// Caso 9
		case 9:
			System.out.println("La letra del DNI es 'D'");
			break;

		// Caso 10
		case 10:
			System.out.println("La letra del DNI es 'X'");
			break;

		// Caso 11
		case 11:
			System.out.println("La letra del DNI es 'B'");
			break;

		// Caso 12
		case 12:
			System.out.println("La letra del DNI es 'N'");
			break;

		// Caso 13
		case 13:
			System.out.println("La letra del DNI es 'J'");
			break;

		// Caso 14
		case 14:
			System.out.println("La letra del DNI es 'Z'");
			break;

		// Caso 15
		case 15:
			System.out.println("La letra del DNI es 'S'");
			break;

		// Caso 16
		case 16:
			System.out.println("La letra del DNI es 'Q'");
			break;

		// Caso 17
		case 17:
			System.out.println("La letra del DNI es 'V'");
			break;

		// Caso 18
		case 18:
			System.out.println("La letra del DNI es 'H'");
			break;

		// Caso 19
		case 19:
			System.out.println("La letra del DNI es 'L'");
			break;

		// Caso 20
		case 20:
			System.out.println("La letra del DNI es 'C'");
			break;

		// Caso 21
		case 21:
			System.out.println("La letra del DNI es 'K'");
			break;

		// Caso 22
		case 22:
			System.out.println("La letra del DNI es 'E'");
			break;
		}
		// Cerramos el Scanner.
		sc.close();
	}
}