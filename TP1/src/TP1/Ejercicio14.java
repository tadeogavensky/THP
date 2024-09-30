package TP1;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int edad;
		String nombre;
		double altura;
		final int EDAD_MINIMA = 7;
		final double ALTURA_MINIMA = 1.50;

		System.out.println("Ingrese su nombre: ");
		nombre = scanner.nextLine();
		System.out.println("Ingrese su edad: ");
		edad = scanner.nextInt();
		System.out.println("Ingrese su altura: ");
		altura = scanner.nextFloat();

		if (edad >= EDAD_MINIMA && altura > ALTURA_MINIMA) {
			System.out.println(nombre.toUpperCase() + " puede subir a la montaña rusa");

		} else {
			System.out.println(nombre.toUpperCase() + " no puede subir a la montaña rusa");
		}

	}
	}


