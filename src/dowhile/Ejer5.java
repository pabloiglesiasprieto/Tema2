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
		// Creamos una variable que almacenará el número dado por el usuario
		int numeroUsuario;

		// Creamos una varibale que almacenará el número generado por la máquina
		int numeroAleatorio;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos Random
		Random random = new Random();

		// Asignamos el valor del random
		numeroAleatorio = random.nextInt(100) + 1;

		// Le pedimos al usuario que introduzca un número
		System.out.println("Introduce un número");

		// Leemos entradad de teclado
		numeroUsuario = sc.nextInt();

		// Creamos un do-while
		do {
			// Si el número del usuario es mayor que el número aleatorio, se ejecutará el
			// bloque.
			if (numeroUsuario > numeroAleatorio) {
				// Imprimimos que el número es menor.
				System.out.println("Introduce un número menor");

				// Si el número del usuario es menor que el número aleatorio, se ejecutará el
				// bloque.
			} else if (numeroUsuario < numeroAleatorio) {

				// Imprimimos que el número es mayor.
				System.out.println("Introduce un número mayor");
			}
			// Imprimimos que vuelve a introducir el número
			System.out.println("Vuelve a introducir un número");

			// Leemos entrada de teclado
			numeroUsuario = sc.nextInt();

			// Hasta que número del usuario coincida con el número.
		} while (numeroUsuario != numeroAleatorio);

		// Imprimimos salida de bucle
		System.out.println("Ganaste");

		// Cerramos Scanner
		sc.close();
	}
}
