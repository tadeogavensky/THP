package TP1;

import java.util.Scanner;

public class Ejercicio36 {
	final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int num;
		int promedio = 0;
		int contador = 0;
		int acumulador = 0;

		do {
			System.out.println("Ingrese un número:");
			num = scanner.nextInt();
			contador++;
			acumulador += num;
			promedio = acumulador / contador;

		} while (promedio < 20);
		System.out.println("La cantidad de valores leídos es: " + contador);
		System.out.println("El promedio de los números ingresados es: " + promedio);
	}
}
