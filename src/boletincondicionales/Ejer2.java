package boletincondicionales;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		// Utiliza un operador ternario para calcular el valor absoluto de un número que
		// se solicita al usuario por teclado.
		// Declaramos la variable que almacenará el valor dado por el usuario.
		int numero;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		// Preguntamos el número al usuario.
		System.out.println("Introduce el número");
		// Leemos entrada de teclado
		numero = sc.nextInt();
		// Imprimimos el resultado.
		System.out.println((numero > 0) ? "El valor absoluto del número es de: " + numero : "El valor absoluto del número es de: " + (-(numero)));
		// Cerramos el Scanner.
		sc.close();
	}
}
