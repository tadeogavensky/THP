
package ejercicio14;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Promedio promedio = new Promedio();
		int nota;

		do {
			System.out.println("Ingrese las notas del primer parcial (entre 0 y 10). Ingrese -1 para terminar.");
            nota = scanner.nextInt();
		} while (nota != -1);

		System.out.printf("El promedio de las notas es: %.2f%n", promedio.obtenerPromedio());
		scanner.close();
	}

}

