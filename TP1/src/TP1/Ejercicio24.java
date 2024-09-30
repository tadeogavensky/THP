package TP1;

import java.util.Scanner;

public class Ejercicio24 {
	final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int num1, num2, aux;

		System.out.print("Ingrese el primer número (num1): ");
		num1 = scanner.nextInt();
		aux = num1;
		System.out.print("Ingrese el segundo número (num2): ");
		num2 = scanner.nextInt();

		while (num1 > num2) {
			System.out.print("Ingrese el primer número (num1): ");
			num1 = scanner.nextInt();
		}

		System.out.println("Incluyendo");
		while (num1 <= num2) {
			System.out.println(num1);

			num1++;
		}

		num1 = aux;

		System.out.println("Excluyendo");
		do {
			if (num2 - num1 == 1) {
				num1 = num2;
				System.out.println("No hay secuencia");
			} else {
				num1++;
				System.out.println(num1);
			}

		} while (num1 <= (num2 - 1));

		scanner.close();
	}

}
