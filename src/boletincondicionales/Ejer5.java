package boletincondicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejer5 {
	/*
	 * Realiza el “juego de la suma”, que consiste en que aparezcan dos números
	 * aleatorios (comprendidos entre 1 y 99) y el usuario tiene que sumarlos. La
	 * aplicación le pedirá al usuario que introduzca el resultado de la suma. La
	 * aplicación le indicará si el resultado es correcto o no.
	 */
	public static void main(String[] args) {
		// Declaramos las variables que almacenarán los números aleatorios y la suma de
		// ambos.
		int numero1;
		int numero2;
		int sumaAmbos;
		int eleccionUsuario;
		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);
		// Importamos clase Random
		Random rnd = new Random();
		// Asignamos el número aleatorio a la variable numero1.
		numero1 = rnd.nextInt(99) + 1;
		// Asignamos el número aleatorio a la variable numero2.
		numero2 = rnd.nextInt(99) + 1;
		// Calculamos el resultado de la suma
		sumaAmbos = numero1 + numero2;
		// Indicamos al usuario que debe hacer.
		System.out.println("Realiza una suma con los siguientes números: \n" + numero1 + " y " + numero2);
		// Leemos la entrada del usuario.
		eleccionUsuario = sc.nextInt();
		// Creamos un condicional.
		if (eleccionUsuario == sumaAmbos) {
			// Si el resultado de los números es igual, imprimimos correcto.
			System.out.println("¡CORRECTO!");
		} else {
			// si el resultado no es, imprimimos incorrecto
			System.err.println("Incorrecto.");
		}
		// Cerramos el Scanner.
		sc.close();
	}
}
