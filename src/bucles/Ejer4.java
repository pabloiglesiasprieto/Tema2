package bucles;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		/*
		 * Escribe un algoritmo que pida al usuario 10 números enteros (pueden ser
		 * positivos, negativos o cero). Cuando acabe de insertar los números, el
		 * algoritmo debe mostrar la suma de los números positivos, la media de los
		 * números negativos y el número de ceros que ha introducido el usuario.
		 */
		// Declaramos la varible que almacenará los números
		int numero;

		// Declaramos la variable que almacenará los números positivos.
		int sumaPositivos = 0;

		// Declaramos la variable que almacenará los números negativos
		int sumaNegativos = 0;

		// Declaramos la variable que almacenará el número de ceros.
		int ceros = 0;

		// Creamos un contador.
		int contador = 0;

		// Creamos un contador para los números negativos.
		int contadorNegativo = 0;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Preguntamos el número.
		System.out.println("Introduce el número");

		// Creamos un bucle que indica el número
		while (contador < 10) {

			// Leemos entrada de teclado
			numero = sc.nextInt();

			// Si el número es mayor que 0, añadimos el valor de numero a sumaPositivos.
			if (numero > 0) {
				sumaPositivos += numero;
				// Imprimimos que el usuario repita otro número.
				System.out.println("Introduce otro número");

				// Si el número es inferior a 0, añadimos el valor de número a sumaNegativos.
			} else if (numero < 0) {
				sumaNegativos += numero;

				// Incrementamos el contador de números negativos.
				++contadorNegativo;
				// Imprimimos que el usuario introduzca otro número
				System.out.println("Introduce otro número");

				// Si no se cumple la condición, se incrementará la variable ceros.
			} else {
				++ceros;
				System.out.println("Introduce otro número");
			}
			// Incrementamos el contador que indicará el número de iteraciones.
			contador++;
		}
		// Fin del bucle.
		// Imprimimos el resultado de la suma de positivos.
		System.out.println("La suma de los números positivos es de " + sumaPositivos);

		// Imprimimos la media de los números negativos.
		System.out.println("La media de los números negativos es de " + sumaNegativos / contadorNegativo);

		// Imprimimos el contador de ceros.
		System.out.println("El número de ceros es de " + ceros);

		// Cerramos el Scanner.
		sc.close();
	}
}
