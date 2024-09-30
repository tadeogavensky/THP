package TP1;

import java.util.Scanner;

public class Ejercicio35 {
	final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int edad, edadMasJoven = Integer.MAX_VALUE;
		String nombre, nombreMasJoven = "";

		System.out.println("Ingrese el nombre de la persona más joven o '*' para finalizar:");
		nombre = scanner.nextLine();


		while (!nombre.equals("*")) {
			System.out.println("Ingrese la edad:");
			edad = scanner.nextInt();
			scanner.nextLine();
			

			if (edad < edadMasJoven) {
				edadMasJoven = edad;
				nombreMasJoven = nombre;
			}
			System.out.println("Ingrese el nombre de la persona más joven o '*' para finalizar:");
			nombre = scanner.nextLine();

		}

	

		if (!nombreMasJoven.equals("") ) {
			System.out.println("La persona más joven es: " + nombreMasJoven + " con " + edadMasJoven + " años.");
		} else {
			System.out.println("No se ingresaron personas.");
		}
	}
}