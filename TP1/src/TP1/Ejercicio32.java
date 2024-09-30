package TP1;

import java.util.Scanner;

public class Ejercicio32 {
	final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		double nota;
		
	

		do {
			System.out.println("Ingrese la nota del alumno:");
			nota = scanner.nextDouble();

		} while (nota != 2 && (nota < 4 || nota > 10));

		System.out.println("La nota ingresada es: " + nota);
		scanner.close();

	}

}
