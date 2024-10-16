package bucles;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que vaya pidiendo al usuario números enteros positivos
		 * que debe ir sumando. Cuando el usuario no quiera insertar más números,
		 * introducirá un número negativo y el algoritmo, antes de acabar, mostrará la
		 * suma de los números positivos introducidos por el usuario.
		 */
		// Declaramos e inicializamos la variable que almacenará el número dado por el
		// usuario.
		int numero;

		// Declaramos e inicializable la variable que almacenará el valor que se añadirá
		// a número
		int suma = 0;

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);

		// Le preguntamos que quiere sumar.
		System.out.println("Cual es el número");

		// Leemos entrada de teclado.
		numero = sc.nextInt();

		// Mientras que el número no sea negativo, el bucle se ejecutará hasta que el
		// usuario introduzca un número negativo
		while (suma >= 0) {

			// Añadimos el valor de suma a número.
			numero += suma;

			// Preguntamos que quiere sumar
			System.out.println("Que quieres sumar");

			// Leemos entrada de teclado.
			suma = sc.nextInt();

		}
		// Imprimimos el resultado
		System.out.println("El resultado es de :" + numero);
		// Imprimimos final de bucle.
		System.out.println("Fin");

		// Cerramos el Scanner.
		sc.close();
	}
}
