package TP1;

import java.util.Scanner;

public class Ejercicio34 {
	final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		double estatura, promedio, acumulador = 0;
		int contador = 0;

		do {
			System.out.println("Ingrese la estatura:");
			estatura = scanner.nextDouble();
			acumulador += estatura;
			contador++;

		} while (estatura != 0);

		promedio = acumulador / (contador - 1);
		
		System.out.println("El promedio de estaturas ingresadas es: " + promedio);
	}

}
