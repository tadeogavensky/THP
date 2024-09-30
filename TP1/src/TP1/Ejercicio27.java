package TP1;

import java.util.Scanner;

public class Ejercicio27 {
	final static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int edad;
		int acumulador = 0;
		final int CANT_EDADES = 5;
		int contImparMayor = 0;
		
		for (int i = 1; i <= CANT_EDADES; i++) {
			System.out.println("Ingrese la edad de la persona " + i);
			edad = Integer.parseInt(scanner.nextLine());
			acumulador += edad;
			if (edad % 2 != 0 && edad > 18) {
				System.out.println("La edad ingresada es impar y mayor a 18");
				contImparMayor++;
			}
		}
		System.out.println("El promedio de las edades ingresadas es: " + acumulador / CANT_EDADES);
		System.out.println("La cantidad de edades impares y mayores a 18 son: " + contImparMayor);

	}
}
