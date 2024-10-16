package english;

import java.util.Random;
import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		/*
		 * Un juego en el cual tenemos que generar un número entre 1-100 y si el número
		 * dado por el usuario es inferior, tenemos que decirle que el número mayor,
		 * etc... Gana si acierta. Si se rinde, pondrá -1.
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

		// Creamos bucle
		while (numeroUsuario != numeroAleatorio && numeroUsuario != -1) {
			if (numeroUsuario > numeroAleatorio) {
				System.out.println("Introduce un número menor");
			} else if (numeroUsuario < numeroAleatorio) {
				System.out.println("Introduce un número mayor");
			}
			System.out.println("Vuelve a introducir un número");
			numeroUsuario = sc.nextInt();
		}
		// Imprimimos salida de bucle
		System.out.println(numeroUsuario == numeroAleatorio ? "Ganaste" : "Perdiste");
		
		// Cerramos Scanner
		sc.close();
	}
}
