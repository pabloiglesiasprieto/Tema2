package switchcase;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		/*
		 * Escribe un algoritmo que le pida al usuario dos números. A continuación debe
		 * mostrar el siguiente menú por pantalla: SUMAR LOS NÚMEROS RESTAR LOS NÚMEROS
		 * MULTIPLICAR LOS NÚMEROS DIVIDIR LOS NÚMEROS
		 */
		// Declaramos las variables que almacenaran los 2 datos dados por el usuario.
		int numero1;
		int numero2;
		String decision;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		// Preguntamos al usuario el primero número
		System.out.println("Introduce el primer número");
		// Leemos el valor introducido por el usuario
		numero1 = sc.nextInt();
		// Preguntamos al usuario el segundo número
		System.out.println("Introduce el segundo número");
		// Leemos el valor introducido por el usuario
		numero2 = sc.nextInt();
		// Imprimimos el menú
		System.out.println("Elige que accion realizar");
		System.out.println("A. SUMAR LOS NÚMEROS");
		System.out.println("B. RESTAR LOS NÚMEROS");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("D. DIVIDIR LOS NÚMEROS");
		// Leemos la opción que ha dado el usuario y lo almacenamos en la variable
		// 'decision'
		decision = sc.next();
		// Creamos un Switch
		switch (decision.toUpperCase()) {
		// Si el usuario ha introducido A, hacemos la suma
		case "A":
			// Imprimimos el resultado
			System.out.println("El resultado de la suma es de: " + (numero1 + numero2));
			// Rompemos
			break;
		// Si el usuario ha introducido B, hacemos la resta
		case "B":
			// Imprimimos el resultado
			System.out.println("El resultado de la resta es de: " + (numero1 - numero2));
			// Rompemos la cadena
			break;
		// Si el usuario ha introducido la C, multiplicamos
		case "C":
			// Imprimimos el resultado
			System.out.println("El resultado de la multiplicación es de: " + (numero1 * numero2));
			// Rompemos
			break;
		// Si el usuario ha introducido D, hacemos la división
		case "D":
			// Imprimimos el resultado
			System.out.println("El resultado de la división es de: " + (numero1 / numero2));
			// Rompemos
			break;
		// En caso de que no se cumpla ningun caso
		default:
			// Imprimimos el resultado
			System.out.println("Introduce un valor correspondiente a las acciones dadas.");
			// Rompamos
			break;
		}
		// Cerramos el Scanner.
		sc.close();
	}
}
