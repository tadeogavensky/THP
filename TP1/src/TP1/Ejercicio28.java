package TP1;

import java.util.Scanner;

public class Ejercicio28 {
	final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int cantidad;
		int posicion=1;
		int mayor = -99999;
		int num;

		System.out.println("Ingrese la cantidad de números a ingresar: ");
		cantidad = Integer.parseInt(scanner.nextLine());

		for (int i = 1; i <= cantidad; i++) {
			System.out.println("Cargá número: " + i);
			num = Integer.parseInt(scanner.nextLine());
			if (num > mayor) {
				mayor = num;
				posicion = i;
			}
		}
	    System.out.println("El número mayor ingresado es: " + mayor + " en la posición: " + posicion);
	}

}
