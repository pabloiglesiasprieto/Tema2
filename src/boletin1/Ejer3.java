package boletin1;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		/*
		 * Implementar un programa que pida por teclado un número decimal e indique si
		 * es un número casi-cero, que son aquellos, positivos o negativos, que se
		 * acercan a 0 por menos de 1 unidad, aunque curiosamente el 0 no se considera
		 * un número casi-cero. Es decir, un número casi-cero es el que se encuentra en
		 * el intervalo (-1, 1), donde se excluye el -1, el 0 y el 1.
		 */
		// Declaramos las variables.
		double numero;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		// Preguntamos por el número.
		System.out.println("¿Cuál es el número?");
		// Leemos entrada de teclado.
		numero = sc.nextDouble();
		// Creamos condicional
		if (-1 <= numero && numero <= 1) {
			// Imprimimos resultado si la condición se cumple
			System.out.println("El número es casi-cero");
		} else {
			// Imprimimos el resultado si no se cumple el if
			System.out.println("El número no es casi-cero");
			// Cerramos Scanner.
			sc.close();
		}
	}
}
