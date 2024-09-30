package TP1;

import java.util.Scanner;

public class Ejercicio29 {
	final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		double nota;
		System.out.println("CON DO-WHILE");
		do {
			System.out.println("Ingresar nota (entre 0 y 10)");
			nota = Double.parseDouble(scanner.nextLine());
		}while(nota < 0 || nota > 10);
		
		System.out.println("CON WHILE");

		System.out.println("Ingresar nota (entre 0 y 10)");
		nota = Double.parseDouble(scanner.nextLine());

		while (nota < 0 || nota > 10) {
			System.out.println("Ingresar nota (entre 0 y 10), boludo");
			nota = Double.parseDouble(scanner.nextLine());
		}
		
		System.out.println("Nota ingresada: " + nota);
	}

}
