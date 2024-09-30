package TP1;

import java.util.Scanner;

public class Ejercicio31 {
	final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		char opcion;

		System.out.println("WHILE");
		System.out.println("¿Deseás continuar? [S/N]");
		opcion = scanner.next().charAt(0);

		while (opcion == 'S' || opcion == 's') {

			System.out.println("¿Deseás continuar? [S/N]");
			opcion = scanner.next().charAt(0);

		}
		System.out.println("Chau.");

		System.out.println("DO WHILE");
		do {
			System.out.println("¿Deseás continuar? [S/N]");
			opcion = scanner.next().charAt(0);
		} while (opcion == 'S' || opcion == 's');

		System.out.println("Chau.");

	}

}
