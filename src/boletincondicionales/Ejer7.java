package boletincondicionales;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		/*
		 * Determinar el precio de un billete de tren, conociendo la distancia a
		 * recorrer, y sabiendo que si el número de días de estancia es superior a 7 y
		 * la distancia superior a 800 km el billete tiene una reducción del 30%. El
		 * precio por kilómetro es de 2,5€. La distancia a recorrer y el número de días
		 * de estancia los debes solicitar al usuario por teclado.
		 */
		// Creamos las variables que almacenarán la distancia y el número de días de
		// instanciaa.
		int dias;
		double distancia;
		double precio;
		// Creamos una constante que almacenará el precio por km.
		final double COSTE = 2.5;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		// Preguntamos al usuario la distancia que tiene que recorrer.
		System.out.println("Cuanta distancia va a recorrer.");
		// Leemos entrada de teclado.
		distancia = sc.nextDouble();
		// Preguntamos al usuario los días de instancia.
		System.out.println("Cuantos días será la instancia");
		// Leemos entrada de teclado.
		dias = sc.nextInt();
		// Si la condición mencionada en el enunciado se cumple, se ejecutará el bloque
		// if,
		if (distancia >= 800 && dias >= 7) {
			// Se aplicará un descuento del 30%.
			precio = ((distancia * COSTE) - (distancia * COSTE) * 0.3);
			// Se imprime el coste del viaje.
			System.out.println("El precio del viaje es de: " + precio + "€");
			// Si la condición del enunciado no se cumple, se ejecutará el bloque else.
		} else {
			// Se calcula el coste del viaje sin descuento.
			precio = distancia * COSTE;
			// Se imprime el costo del viaje.
			System.out.println("El precio del viaje es de: " + precio + "€");
		}
		// Cerramos el Scanner.
		sc.close();
	}
}
