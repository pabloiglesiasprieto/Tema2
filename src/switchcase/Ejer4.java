package switchcase;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		/*
		 * Escribe un algoritmo para sumar dos tiradas de un dado de seis caras que
		 * haría el usuario. El algoritmo pregunta al usuario cuánto ha sacado en la
		 * primera tirada y el usuario le dará esa información pero en formato cadena
		 * (“UNO”, “DOS” … “SEIS”). Después el algoritmo volverá a preguntar al usuario
		 * cuánto ha sacado en la segunda tirada y el usuario también dará esa
		 * información en formato cadena. Por último, el algoritmo mostrará por pantalla
		 * la suma de las dos tiradas en formato numérico.
		 */
		// Declaramos las variables que almacenarán los resultados de la tirada.
		String primeraTirada;
		String segundaTirada;
		// Declaramos las variables que almacenarán el resultado el valor númerico.
		int numeroPrimera;
		int numeroSegunda;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		// Preguntamos al usuario el resultado de la primera tirada.
		System.out.println("Cual es el resultado de la primera tirada.");
		// Leemos entrada de teclado
		primeraTirada = sc.next();
		// Preguntamos al usuario el resultado de la segunda tirada.
		System.out.println("Cual es el resultado de la segunda tirada.");
		// Leemos entrada de teclado
		segundaTirada = sc.next();
		// El valor de la variable será el resultado del switch
		numeroPrimera = switch (primeraTirada.toUpperCase()) {
		// Si el usuario ha introducido uno, el valor será 1
		case "UNO" -> {
			// Damos el valor 1 al caso
			yield 1;
		}
		// Si el usuario ha introducido dos, el valor será 2.
		case "DOS" -> {
			// Damos el valor 2.
			yield 2;
		}
		// Si el usuario ha introducido, el valor será de 3
		case "TRES" -> {
			// Damos el valor de 3.
			yield 3;
		}
		// Si el usuario ha introducido el valor cuatro, será de 4
		case "CUATRO" -> {
			// Damos el valor 4
			yield 4;
		}
		// Si el usuario ha introducido el valor cinco, será de 5
		case "CINCO" -> {
			// Damos el valor de 5
			yield 5;
		}
		// Si el usuario ha introducido el valor seis, será de 6
		case "SEIS" -> {
			// Damos el valor de 6
			yield 6;
		}
		// En caso de que no se cumpla ningun caso, pedirá al usuario que de un valor
		default -> {
			// Imprimimos el error
			System.out.println("Introduce un valor entre 1 y 6");
			yield -1;
		}
		};
		numeroSegunda = switch (segundaTirada.toUpperCase()) {
		// Si el usuario ha introducido uno, el valor será 1
		case "UNO" -> {
			// Damos el valor 1.
			yield 1;
		}
		// Si el usuario a introducido dos, el valor será 2.
		case "DOS" -> {
			// Damos el valor 2.
			yield 2;
		}
		// Si el usuario ha introducido tres, el valor será de 3
		case "TRES" -> {
			// Damos el valor de 3.
			yield 3;
		}
		// Si el usuario ha introducido el valor cuatro, será de 4
		case "CUATRO" -> {
			// Damos el valor de 4
			yield 4;
		}
		// Si el usuario ha introducido el valor cinco, será de 5
		case "CINCO" -> {
			// Damos el valor de 5.
			yield 5;
		}
		// Si el usuario ha introducido el valor 6, será de seis
		case "SEIS" -> {
			// Damos el valor 6
			yield 6;
		}
		default -> {
			System.out.println("Introduce un valor entre 1 y 6");
			yield -1;
		}
		};
		System.out.println("El resultado de la suma de los dados es de: " + (numeroPrimera + numeroSegunda));
		// Cerramos el Scanner.
		sc.close();
	}
}
