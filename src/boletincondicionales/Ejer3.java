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
		case 0:
			System.out.println("La letra del DNI es 'T'");
			break;
		case 1:
			System.out.println("La letra del DNI es 'R'");
			break;
		case 2:
			System.out.println("La letra del DNI es 'W'");
			break;
		case 3:
			System.out.println("La letra del DNI es 'A'");
			break;
		case 4:
			System.out.println("La letra del DNI es 'G'");
			break;
		case 5:
			System.out.println("La letra del DNI es 'M'");
			break;
		case 6:
			System.out.println("La letra del DNI es 'Y'");
			break;
		case 7:
			System.out.println("La letra del DNI es 'F'");
			break;
		case 8:
			System.out.println("La letra del DNI es 'P'");
			break;
		case 9:
			System.out.println("La letra del DNI es 'D'");
			break;
		case 10:
			System.out.println("La letra del DNI es 'X'");
			break;
		case 11:
			System.out.println("La letra del DNI es 'B'");
			break;
		case 12:
			System.out.println("La letra del DNI es 'N'");
			break;
		case 13:
			System.out.println("La letra del DNI es 'J'");
			break;
		case 14:
			System.out.println("La letra del DNI es 'Z'");
			break;
		case 15:
			System.out.println("La letra del DNI es 'S'");
			break;
		case 16:
			System.out.println("La letra del DNI es 'Q'");
			break;
		case 17:
			System.out.println("La letra del DNI es 'V'");
			break;
		case 18:
			System.out.println("La letra del DNI es 'H'");
			break;
		case 19:
			System.out.println("La letra del DNI es 'L'");
			break;
		case 20:
			System.out.println("La letra del DNI es 'C'");
			break;
		case 21:
			System.out.println("La letra del DNI es 'K'");
			break;
		case 22:
			System.out.println("La letra del DNI es 'E'");
			break;
		}
		// Cerramos el Scanner.
		sc.close();
	}
}
