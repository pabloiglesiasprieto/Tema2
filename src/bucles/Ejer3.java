package bucles;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que vaya pidiendo al usuario números enteros positivos
		 * que debe ir sumando. Cuando el usuario no quiera insertar más números,
		 * introducirá un número negativo y el algoritmo, antes de acabar, mostrará la
		 * media de los números positivos introducidos por el usuario.
		 */
		// Declaramos la variable que almacenará el número dado por el usuario.
		int numero = 0;

		// Declaramos la variable que almacenará el valor que se añadirá a número
		int suma = 0;

		// Declaramos e inicializamos la variable que almacenará el contador
		int contador = 0;

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);

		// Preguntamos el número
		System.out.println("Cual es el número");
		// Leemos entrada de teclado.
		numero = sc.nextInt();

		// Mientras que el número no sea negativa, el bucle se ejecutará hasta que el
		// usuario introduzca un número negativo
		while (suma >= 0) {

			// Le preguntamos que quiere sumar.
			System.out.println("Que quieres sumar");
			
			// Añadimos el valor de suma a número.
			numero += suma;
			
			// Leemos entrada de teclado.
			suma = sc.nextInt();
			
			// Incrementamos el contador
			contador++;
		}
		// Imprimimos el resultado.
		System.out.println("El resultado es de :" + numero);
		// Imprimimos final de bucle.
		System.out.println("El promedio es de " + numero / contador);

		// Cerramos el Scanner.
		sc.close();
	}
}
