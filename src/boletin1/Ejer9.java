package boletin1;

import java.util.Scanner;

public class Ejer9 {
	public static void main(String[] args) {
		/*
		 * Escribir un programa que simule el juego de PIEDRA, PAPEL, TIJERA, pidiendo a
		 * cada jugador que escriba PIEDRA, PAPEL o TIJERA. El juego debe mostrar por
		 * pantalla quién ha ganado el juego tras jugar una partida. Hay que contemplar
		 * el caso de que empaten.
		 */
		// Declaramos las variables correspondientes a los jugadores.
		String jugador1;
		String jugador2;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		// Preguntamos que elegirá el primer jugador
		System.out.println("Que elegirá el primer jugador");
		jugador1 = sc.next().toUpperCase();
		// Preguntamos que elegirá el segundo jugador
		System.out.println("Que elegirá el segundo jugador");
		jugador2 = sc.next().toUpperCase();
		// Creamos condicional
		// Si ambos usuarios sacan la misma herramienta, es un empate.
		if (jugador1.equals(jugador2)) {
			// Imprimimos que es un empate.
			System.out.println("Es un empate");
			// En caso de que no se cumpla la condición, se ejecutará el bloque 'else'
		} else {
			/*
			 * Creamos un condicional que indicará si el jugador 1 saca papel y el jugador 2
			 * saca piedra o si el jugador 1 saca tijera y el jugador 2 saca papel, el
			 * jugador 1 ganará.
			 */
			if ((jugador1.equals("PAPEL")) && (jugador2.equals("PIEDRA")) || ((jugador1.equals("TIJERA")) && (jugador2.equals("PAPEL"))) || ((jugador1.equals("PIEDRA") && jugador2.equals("TIJERA")))) {
				// Imprimimos que el jugador 1 ganará
				System.out.println("JUGADOR 1 GANA");
				// En caso de que no se cumpla la condición anterior, se ejecutará está instrucción
			} else {
				// Imprimimos que el jugador 2 ganará
				System.out.println("JUGADOR 2 GANA");
			}
		}
		// Cerramos el Scanner.
		sc.close();
	}

}
