package dowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el
		 * ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo números
		 * una y otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador si
		 * es mayor, menor o igual al número que ha pensado).
		 */
		// Declaramos la variable que almacenará el número dado por el usuario.
		int numero;

		// Declaramos la variable que almacenará el número generado por la máquina
		int maquina;

		// Declaramos la variable que almacenará la elección de usuario.
		String eleccion;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Importamos la clase Random
		Random random = new Random();

		// Le preguntamos al usuario el número pensado.
		System.out.println("Introduce un número entre [1,100]");
		do {
			// Leemos entrada de teclado
			numero = sc.nextInt();
			if (numero >= 1 && numero <= 100) {
			} else {
				System.out.println("Pon un valor correcto");
			}
		} while (!(numero >= 1 && numero <= 100));

		// Imprimimos que el juego empieza.
		System.out.println("El juego va a empezar.");

		// Inicializamos los límites del rango de búsqueda
		int min = 1;
		int max = 100;

		do {
			// La máquina genera un número aleatorio dentro del rango
			maquina = random.nextInt(max - min + 1) + min;

			// Imprimimos el número dado por la máquina.
			System.out.println("La máquina ha introducido el número " + maquina);

			// Le preguntamos al usuario que introduzca si es mayor o menor
			System.out.println("El número es mayor, menor o igual?");

			eleccion = sc.next().toUpperCase();

			if (eleccion.equals("MAYOR")) {
				min = maquina + 1;
			} else if (eleccion.equals("MENOR")) {
				max = maquina - 1;
			} else if (eleccion.equals("IGUAL")) {
				System.out.println("¡La máquina ha adivinado el número!");
			} else {
				System.out.println("Introduce un valor válido");
			}
		} while (!eleccion.equals("IGUAL"));

		System.out.println("Terminó la partida");
		sc.close();
	}
}