package TP1;

import java.util.Scanner;

public class Ejercicio21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;

		System.out.println("Ingrese un número del 1 al 7: ");
		numero = scanner.nextInt();

		switch (numero) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Lunes");
			break;
		case 3:
			System.out.println("Martes");
			break;
		case 4:
			System.out.println("Miércoles");
			break;
		case 5:
			System.out.println("Jueves");
			break;
		case 6:
			System.out.println("Viernes");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Número inválido");
			break;
		}

	}
}
