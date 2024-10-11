package switchcase;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		/*
		 * Queremos saber, una vez introducida la letra del tipo de carnet de conducir,
		 * se debe imprimir a qué tipo de vehículos corresponde: E: remolques. D:
		 * autobuses. C1-C5: camiones. A: motocicletas. B1-B2: automóviles. En caso de
		 * introducir uno distinto: “Categoría no contemplada”.
		 */
		// Declaramos la variable que almacenará el valor dado por el usuario.
		String carnet;
		String tipo;
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);
		// Preguntamos al usuario que tipo de carnet tiene.
		System.out.println("Introduce el tipo de carnet.");
		carnet = sc.nextLine();
		tipo = switch (carnet.toUpperCase()) {
		case "E" -> {
			yield "remolques";
		}
		case "D" -> {
			yield "autobuses";
		}
		case "C1", "C2", "C3", "C4" -> {
			yield "camiones";
		}
		case "A" -> {
			yield "motocicletas";
		}
		case "B1", "B2" -> {
			yield "coches";
		}
		default -> {
			System.out.println("Coloca un tipo de carnet correcto.");
			yield "nada";
		}

		};
		System.out.println("Tu carnet es para: " + tipo);
		sc.close();
	}
}
