package boletin1;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		/*
		 * Pedir los coeficientes de una ecuación de segundo grado y mostrar sus
		 * soluciones reales. Si no existen, habrá que indicarlo. Hay que tener en
		 * cuenta que las soluciones de una ecuación de segundo grado ax2 + bx + c = 0
		 */
		// Declaramos las variables.
		double a;
		double b;
		double c;
		double discriminante;
		double solucionPositiva;
		double solucionNegativa;
		// Creamos Scanner.
		Scanner input = new Scanner(System.in);
		// Preguntamos el primer número
		System.out.println("¿Cuánto vale a?");
		a = input.nextInt();
		// Preguntamos el segundo número
		System.out.println("¿Cuánto vale b?");
		b = input.nextInt();
		// Preguntamos el tercer número
		System.out.println("¿Cuánto vale c?");
		c = input.nextInt();
		// Calculamos el valor del discriminante (Valor que nos indica el número de
		// soluciones.
		discriminante = (b * b) - (4 * a * c);
		// Si el discriminante es positivo, existen 2 soluciones.
		if (discriminante > 0) {
			// Se calcula el valor positivo de la solución
			solucionPositiva = (-b + Math.sqrt(discriminante)) / (2 * a);
			// Se calcula el valor negativo de la solución.
			solucionNegativa = (-b - Math.sqrt(discriminante)) / (2 * a);
			// Se imprime el resultado.
			System.out.println("El valor positivo es de: " + solucionPositiva);
			System.out.println("El valor negativo " + solucionNegativa);
			// Si el discriminante es igual a 0, solo existe una solución
		} else if (discriminante == 0) {
			// Calculamos la solución
			solucionNegativa = (-b / Math.sqrt(discriminante)) / (2 * a);
			// Imprimimos la solución
			System.out.println("La solución es: " + solucionNegativa);
			// En caso de que no se cumpla las condiciones anteriores:
		} else {
			// Imprimimos que no hay soluciones reales.
			System.out.println("No hay soluciones reales");
		}
		// Cerramos el Scanner.
		input.close();
	}

}
