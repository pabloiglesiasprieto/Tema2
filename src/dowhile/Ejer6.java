package dowhile;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		/*
		 * Repetir el juego de PIEDRA - PAPEL - TIJERA pero con las siguientes
		 * consideraciones: Al jugador 1 se le pedirá que introduzca una opción válida:
		 * PIEDRA, PAPEL o TIJERA. Mientras no introduzca un valor válido se le seguirá
		 * preguntando. Al jugador 2 se le pedirá que introduzca una opción válida:
		 * PIEDRA, PAPEL o TIJERA. Mientras no introduzca un valor válido se le seguirá
		 * preguntando. Al terminar una partida se preguntará si se quiere seguir
		 * jugando. Mientras se pulse “S” se volverá a iniciar la partida.
		 */
		// Declaramos la variable que almacenará el valor dado por el jugador1.
		String jugador1;

		// Declaramos la variable que almacenará el valor dado por el jugador2.
		String jugador2;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Leemos entrada de teclado
		do {
			// Pedimos la elección del Jugador 1
			System.out.println("Que elige el Jugador 1");

			// Leemos la elección y la convertimos a mayúsculas
			jugador1 = sc.nextLine().toUpperCase();

			// Verificamos si la elección es válida
			if (jugador1.equals("TIJERA") || (jugador1.equals("PAPEL")) || jugador1.equals("PIEDRA")) {
				// Si es válida, salimos del bucle
				break;
			} else {
				// Si no es válida, pedimos un valor válido
				System.out.println("Pon un valor válido");
			}
		} while ((jugador1 != "PIEDRA") && (jugador1 != "PAPEL") && (jugador1 != "TIJERA"));

		do {
			// Pedimos la elección del Jugador 2
			System.out.println("Que elige el Jugador 2");

			// Leemos la elección y la convertimos a mayúsculas
			jugador2 = sc.nextLine().toUpperCase();

			// Verificamos si la elección es válida
			if (jugador2.equals("TIJERA") || (jugador2.equals("PAPEL")) || jugador2.equals("PIEDRA")) {
				// Si es válida, salimos del bucle
				break;
			} else {
				// Si no es válida, pedimos un valor válido
				System.out.println("Pon un valor válido");
			}
		} while (jugador2 != "PIEDRA" && jugador2 != "PAPEL" && jugador2 != "TIJERA");

		if ((jugador1.equals("PAPEL")) && (jugador2.equals("PIEDRA"))
				|| ((jugador1.equals("TIJERA")) && (jugador2.equals("PAPEL")))
				|| ((jugador1.equals("PIEDRA") && jugador2.equals("TIJERA")))) {
			// Imprimimos que el Jugador 1 gana
			System.out.println("JUGADOR 1 GANA");
		} else {
			// Imprimimos que el Jugador 2 gana
			System.out.println("JUGADOR 2 GANA");
		}

		// Cerramos el Scanner.
		sc.close();

	}
}
