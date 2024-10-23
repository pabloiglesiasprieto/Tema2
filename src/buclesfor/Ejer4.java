package buclesfor;

public class Ejer4 {
	public static void main(String[] args) {
		// Diseñar un programa que muestre la suma de los 10 primeros números impares.
		// Declaramos la variable que almacenará la suma de los números impares.
		int suma = 0;
		// Declaramos la variable que almacenará la iteración.
		int iteracion = 0;
		// Creamos un bucle
		// El valor inicial de i será 0 ya que este se irá incrementando, el bucle
		// finalizará hasta que iteracion llegue a 10, se incrementará en 1 por cada
		// iteración.
		for (int i = 0; iteracion < 10; i++) {
			// Si el resto de i entre 2 es distinto de cero, significa que es impar.
			if (i % 2 != 0) {
				// Se le sumará el valor de i a suma.
				suma += i;
				// Se incrementará la iteración
				iteracion++;
			}
		}
		// Imprimimos el resultado.
		System.out.println("La suma de los 10 primeros números impares es de " + suma);

	}
}
