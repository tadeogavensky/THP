package TP1;

import java.util.Scanner;

public class Ejercicio37 {
	final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		double total = 0, salario = 0;
		boolean continuar = true;
		int mes = 1;

		do {
			System.out.println("Ingrese el salario del mes " + mes + ":");
			salario = scanner.nextDouble();
			if (salario > 0) {
				total += salario;

			} else {
				continuar = false;
			}
			mes++;
		} while (continuar && mes <= 12);

		System.out.println("El salario cobrado hasta ahora es de $" + total);

	}

}
