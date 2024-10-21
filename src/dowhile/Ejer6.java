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

		// Declaramos la variable que almacenará la elección
		String eleccion;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Leemos entrada de teclado
		do {
			do {

				// Pedimos la elección del Jugador 1
				System.out.println("Que elige el Jugador 1");

				// Leemos la elección y la convertimos a mayúsculas
				jugador1 = sc.nextLine().toUpperCase();

			} while ((!jugador1.equals("PIEDRA")) && (!jugador1.equals("PAPEL")) && (!jugador1.equals("TIJERA")));

			do {

				// Pedimos la elección del Jugador 1
				System.out.println("Que elige el Jugador 2");

				// Leemos la elección y la convertimos a mayúsculas
				jugador2 = sc.nextLine().toUpperCase();

			} while ((!jugador2.equals("PIEDRA")) && (!jugador2.equals("PAPEL")) && (!jugador2.equals("TIJERA")));

			if ((jugador1.equals("PAPEL")) && (jugador2.equals("PIEDRA"))
					|| ((jugador1.equals("TIJERA")) && (jugador2.equals("PAPEL")))
					|| ((jugador1.equals("PIEDRA") && jugador2.equals("TIJERA")))) {
				// Imprimimos que el Jugador 1 gana
				System.out.println("JUGADOR 1 GANA");
			} else {
				// Imprimimos que el Jugador 2 gana
				System.out.println("JUGADOR 2 GANA");
			}
			// Le preguntamos al usuario si quiere seguir jugando
			System.out.println("Quieres seguir jugando");

			// Leemos entrada de teclado
			// DUDA CON RESPECTO SC.NEXT Y SC.NEXTLINE
			eleccion = sc.nextLine().toUpperCase();

			// Si el usuario ha introducido la letra "S", se repite el juego
		} while (eleccion.equals("S"));
		// Imprimimos que terminó la partida
		System.out.println("Terminaste la partida.");
		// Cerramos el Scanner.
		sc.close();
	}
}
