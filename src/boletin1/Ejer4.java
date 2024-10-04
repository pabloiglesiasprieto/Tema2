package boletin1;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		// Pedir dos números y mostrarlos ordenados de menor a mayor.
		// Declaramos las variables
		int num1;
		int num2;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		// Preguntamos el primer número
		System.out.println("¿Cuál es el primer número?");
		// Leemos entrada de teclado.
		num1 = sc.nextInt();
		// Preguntamos el segundo número
		System.out.println("¿Cuál es el segundo número?");
		// Leemos entrada de teclado.
		num2 = sc.nextInt();
		// Creamos condicional
		if (num1 < num2) {
			// Imprimimos resultado si la condición se cumple
			System.out.println("Ordenado de menor a mayor: " + num1 + " y " + num2);
			// Abrimos resultado si no se cumple la condición.
		} else {
			System.out.println("Ordenado de menor a mayor: " + num2 + " y " + num1);
		}
		// Cerramos el Scanner.
		sc.close();
	}
}
