package switchcase;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		/*
		 * Idear un programa que solicite al usuario un número comprendido entre 1 y 7,
		 * correspondiente a un día de la semana. Se debe mostrar el nombre del día de
		 * la semana al que corresponde. Por ejemplo, el número 1 corresponde a “Lunes”
		 * y el 6 a “Sábado”.
		 */
		// Declaramos las variable que almacenará el número dado por el usuario.
		int numero;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		// Preguntamos al usuario el número
		System.out.println("Introduce un número");
		// Leemos el número que introduce el usuario
		numero = sc.nextInt();
		// Creamos un Switch
		switch (numero) {
		// Si el número del usuario es 1, es Lunes
		case 1:
			// Imprimimos Lunes
			System.out.println("Lunes");
			break;
		// Si el número del usuario es 2, es martes
		case 2:
			// Imprimimos Martes
			System.out.println("Martes");
			break;
		// Si el número del usuario es 3, es Miércoles.
		case 3:
			// Imprimimos Miércoles
			System.out.println("Miércoles");
			break;
		// Si el número del usuario es 4, es Jueves
		case 4:
			// Imprimimos Jueves
			System.out.println("Jueves");
			break;
		// Si el número del usuario es 5, Viernes
		case 5:
			// Imprimimos Viernes
			System.out.println("Viernes");
			// Rompemos en caso de que se cumpla la condición.
			break;
		// Si el número del usuario es 6, imprimimos Sábado
		case 6:
			// Imprimimos Sábado
			System.out.println("Sábado");
			// Rompemos en caso de que se cumpla la condición.
			break;
		// Si el número del usuario es 7, es Domingo
		case 7:
			// Imprimimos Domingo
			System.out.println("Domingo");
			// Rompemos en caso de que se cumpla la condición.
			break;
		// En caso de que no se cumpla ninguna de las condiciones anteriores, se
		// ejecutará el bloque default
		default:
			// Imprimimos que introduzca un valor entre 0 y 7
			System.out.println("Introduce un valor entre 0 y 7");
			// Rompemos en caso de que se cumpla la condición.
			break;
		}
		// Cerramos el Scanner
		sc.close();
	}
}
