package bucles;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		/*
		 * Un centro de investigación de la flora urbana necesita una aplicación que
		 * muestre cuál es el árbol más alto. Para ello se introducirá por teclado la
		 * altura (en centímetros) de cada árbol (terminando la introducción de datos
		 * cuando se utilice -1 como altura). La aplicación debe devolver la altura del
		 * árbol más alto.
		 */
		// Declaramos la variable que almacenará el valor dado por el usuario.
		int altura = 0;

		// Declaramos la variable que almacenará el valor de la altura máxima
		int alturaMaxima = 0;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario el número
		System.out.println("Introduce el número");

		// Creamos un bucle
		while (altura > -1) {

			// Leemos entrada de teclado
			altura = sc.nextInt();

			// Si la altura es superior a la máxima, se sobreescribe el valor de
			// alturaMaxima.
			if (altura > alturaMaxima) {
				alturaMaxima = altura;
			}
		}
		// Fin del bucle
		System.out.println("Fin del bucle");

		// Imprimimos el resultado
		System.out.println("La altura máxima es de " + alturaMaxima);

		// Cerramos el Scanner
		sc.close();
	}
}
