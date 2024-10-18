package dowhile;

public class Ejer2 {
	public static void main(String[] args) {
		// Realiza un programa que muestre los números pares comprendidos entre el 1 y
		// el 200.
		// Declaramos la variable que almacenará el número inicial.
		int num = 1;
		// Creamos un do-while
		do {
			// Creamos un condicional que verá si el número es par o no
			if (num % 2 == 0) {
				// Si es par, imprimimos el valor
				System.out.println(num);
			}
			// Incrementamos
			num++;
			// Hasta que la variable num llegue a 200.
		} while (num <= 200);

	}
}
