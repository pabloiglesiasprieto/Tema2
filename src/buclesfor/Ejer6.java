package buclesfor;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		// Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
		// Declaramos la variable que almacenará la nota de alumno.
		int notaAlumno;

		// Declaramos e inicializamos la variable que almacenará los suspensos.
		int suspenso = 0;

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);

		// Creamos bucle for.
		// En este bucle, i servirá para calcular las iteraciones
		// Cuando i alcance el valor de 5, el bucle dejará de iterarse.
		// Por cada iteración, se incrementará el valor de i
		for (int i = 0; i < 5; i++) {
			// Preguntamos la nota al usuario
			System.out.println("Introduce la nota");

			// Leemos entrada de teclado
			notaAlumno = sc.nextInt();

			// Si la nota de alumno es inferior a 4, se incrementará
			if (notaAlumno <= 4)
				suspenso++;
		}
		// Imprimimos el resultado.
		System.out.println("Hay un total de " + suspenso + " suspensos.");

		// Cerramos el Scanner.
		sc.close();
	}
}
