package TP1;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a, b, mayor, menor;

		System.out.println("Ingrese un número: ");
		a = scanner.nextInt();
		System.out.println("Ingrese el otro número: ");
		b = scanner.nextInt();

		if ((a > b) && (a % b == 0)) {
			mayor = a;
			menor = b;
			System.out.println("Mayor: " + mayor);
			System.out.println("Menor: " + menor);
			System.out.println(mayor + " es múltiplo de " + menor);

		} else if ((b > a) && (b % a == 0)) {
			mayor = b;
			menor = a;
			System.out.println("Mayor: " + mayor);
			System.out.println("Menor: " + menor);

			System.out.println(mayor + " es múltiplo de " + menor);

		} else if ((a == b) && (a % b == 0)) {
			System.out.println("Los números son iguales y múltiplos entre sí");

		} else {
			System.out.println("Los números no son múltiplos entre sí");
		}
	}
}
