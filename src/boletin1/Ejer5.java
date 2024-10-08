package boletin1;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
//Pedir tres números y mostrarlos ordenados de mayor a menor.
		// Declaramos las variables.
		int num1;
		int num2;
		int num3;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		// Preguntamos por el primer número.
		System.out.println("¿Cual es el primer número?");
		// Leemos entrada de teclado
		num1 = sc.nextInt();
		// Preguntamos por el segundo número.
		System.out.println("¿Cual es el segundo número?");
		// Leemos entrada de teclado
		num2 = sc.nextInt();
		// Preguntamos por el tercer número.
		System.out.println("¿Cual es el tercer número?");
		// Leemos entrada de teclado
		num3 = sc.nextInt();
		// Creamos condicional
		if (num1 >= num2 && num2 >= num3) {
			System.out.println(num1 + "," + num2 + "," + num3);
		} else if (num2 >= num1 && num1 >= num3) {
			System.out.println(num2 + "," + num1 + "," + num3);
		} else if (num1 >= num3 && num3 >= num2) {
			System.out.println(num1 + "," + num3 + "," + num2);
		} else if (num2 >= num3 && num3 >= num1) {
			System.out.println(num2 + "," + num3 + "," + num1);
		} else if (num3 >= num1 && num1 >= num2) {
			System.out.println(num3 + "," + num1 + "," + num2);
		} else if (num3 >= num2 && num2 >= num1) {
			System.out.println(num3 + "," + num2 + "," + num1);
		}
		// Cerramos el Scanner.
		sc.close();
	}
}
