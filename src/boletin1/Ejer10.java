package boletin1;

import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
		/*
		 * Escribir un programa que pida al usuario tres números enteros, y que muestre
		 * por pantalla si la suma de dos de esos números da como resultado el otro
		 * número.
		 */
		// Declaramos las variables
		int num1;
		int num2;
		int num3;
		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);
		// Preguntamos el primer número
		System.out.println("Introduce el primer número");
		// Leemos entrada de teclado
		num1 = sc.nextInt();
		// Preguntamos el segundo número
		System.out.println("Introduce el segundo número");
		// Leemos entrada de teclado
		num2 = sc.nextInt();
		// Preguntamos el tercer número
		System.out.println("Introduce el tercer número");
		// Leemos entrada de teclado
		num3 = sc.nextInt();
		// Creamos condicional por si se cumple que el num1+num2 corresponda al num3
		if (num1+num2 == num3) {
			// Imprimimos el resultado
			System.out.println("La suma del primer número y segundo número corresponde al valor del tercer número");
			// Si no se cumple la condición se ejecutará este bloque
		} else {
			// Imprimimos el resultado
			System.out.println("La suma del primer número y segundo número no corresponde al valor del tercer número");
		}
		// Cerramos el Scanner
		sc.close();		
		}
	}

