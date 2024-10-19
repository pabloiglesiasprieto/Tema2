package dowhile;

import java.util.Scanner;

public class Ejer7 { // Definición de la clase pública Ejer7.
	public static void main(String[] args) { // Método principal que se ejecuta al iniciar el programa.
		/*
		 * Repetir el ejercicio de la calculadora del boletín de SWITCH de forma que se
		 * añada una opción más al menú, quedando el menú así: A. SUMAR LOS NÚMEROS | B.
		 * RESTAR LOS NÚMEROS | C. MULTIPLICAR LOS NÚMEROS | D. DIVIDIR LOS NÚMEROS E.
		 * SALIR
		 */

		// Declaramos la variable que almacenará el primer número dado por el usuario.
		int numero1, numero2;
		// Declaramos la variable que almacenará la elección del usuario.
		String eleccion;

		// Creamos un objeto Scanner para leer la entrada del usuario.
		Scanner sc = new Scanner(System.in);

		// Iniciamos un bucle que se repetirá mientras se cumpla la condición.
		do {
			// Mostramos al usuario las acciones disponibles.
			System.out.println("Que acción quieres realizar");
			System.out.println("A. SUMAR LOS NÚMEROS");
			System.out.println("B. RESTAR LOS NÚMEROS");
			System.out.println("C. MULTIPLICAR LOS NÚMEROS");
			System.out.println("D. DIVIDIR LOS NÚMEROS");
			System.out.println("E. Salir");

			// Leemos la elección del usuario y la convertimos a mayúsculas.
			eleccion = sc.next().toUpperCase();

			// Si el usuario no ha elegido salir.
			if (!eleccion.equals("E")) {
				// Pedimos el primer número.
				System.out.println("Cual es el primer número");
				numero1 = sc.nextInt(); // Leemos el primer número.

				// Pedimos el segundo número.
				System.out.println("Cual es el segundo número");
				numero2 = sc.nextInt(); // Leemos el segundo número.

				// Usamos un switch para ejecutar la acción según la elección del usuario.
				switch (eleccion) {
				// Si elige A, mostramos la suma de los números.
				case "A" -> System.out.println("La suma de los números es de " + (numero1 + numero2));
				// Si elige B, mostramos la resta de los números.
				case "B" -> System.out.println("La resta de los números es de " + (numero1 - numero2));
				// Si elige C, mostramos la multiplicación de los números.
				case "C" -> System.out.println("La multiplicación de los números es de " + (numero1 * numero2));
				// Si elige D, mostramos la división de los números.
				case "D" -> System.out.println("La división de los números es de " + (numero1 / numero2));
				// Si la elección no es válida, mostramos un mensaje de error.
				default -> System.out.println("Indica una instrucción válida");
				}
			}

			// Condición del bucle: se repetirá mientras se cumplan las condiciones
			// especificadas.
		} while ((eleccion.equals("A") || eleccion.equals("B") && eleccion.equals("C") || eleccion.equals("D"))
				|| !eleccion.equals("E"));

		// Mensaje que indica que se ha salido del bucle.
		System.out.println("Saliste del bucle");

		// Cerramos el Scanner para liberar recursos.
		sc.close();
	}
}
