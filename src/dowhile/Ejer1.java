package dowhile;

public class Ejer1 {
	public static void main(String[] args) {
		// Realiza un programa que muestre por pantalla los 20 primeros números
		// naturales (1, 2, 3... 20).
		// Declaramos la variable que almacenará el número.
		int num = 0;
		// Creamos un do-while
		do {
			// Incrementamos el valor en 1
			num++;
			// Imprimimos el valor
			System.out.println(num);
			// Hasta que el valor sea superior a 20.
		} while (num < 20);

	}
}
