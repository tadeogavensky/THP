package TP1;

import java.util.Scanner;

public class Ejercicio33 {
	final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int max, min, num;

		System.out.println("Ingrese un número:");
		num = scanner.nextInt();
		max = num;
		min = num;

		if (num != 0) {
			do {
				System.out.println("Ingrese un número:");
				num = scanner.nextInt();

				if (num != 0) {
					if (num > max) {
						max = num;
					}
					if (num < min) {
						min = num;
					}
				}
			} while (num != 0);
			

			System.out.println("El número máximo ingresado es: " + max);
			System.out.println("El número mínimo ingresado es: " + min);
		}else {
			System.out.println("No se ingresaron números.");
		}


	}

}
