package TP1;

import java.util.Scanner;

public class Ejercicio25 {
	final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int alto, ancho;

		System.out.print("Ingrese el alto: ");
		alto = Integer.parseInt(scanner.nextLine());
		System.out.print("Ingrese el ancho: ");
		ancho = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print("X ");
			}
			System.out.println();
		}
		  
        scanner.close();
	}
	
}
