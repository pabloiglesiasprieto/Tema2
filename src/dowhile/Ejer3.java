package dowhile;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que sume los números desde el 1 hasta un número N que se
		 * introducirá por teclado. Si el usuario introduce un 5, el programa debe
		 * devolver la suma de 1+2+3+4+5.
		 */
		// Creamos la variable que almacenará el número dado por el usuario.
		int suma;
		// Creamos la variable que almacenará el valor inicial.
		int numInicial = 0;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		// Preguntamos el número de veces que quiere sumar.
		System.out.println("Introduce el número de veces que quieres sumar.");
		// Cuantos números quieres sumar.
		suma = sc.nextInt();
		// Creamos un do-while
		do {
			// Vamos aumentando el valor de forma inversa(NUM 4 = 4+3+2+1)
			numInicial += suma;
			// Quitamos 1 al valor de la suma
			suma--;
			// Hasta que suma sea 0
		} while (suma > 0);
		// Imprimimos el resultado
		System.out.println(numInicial);
		// Indicamos salida del bucle
		System.out.println("Salida del bucle");
		// Cerramos el Scanner.
		sc.close();
	}
}
