package TP1;

import java.util.Scanner;

public class Ejercicio30 {
	final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		char operacion;
		int num1, num2;

		do {
			System.out.println("Ingrese la operación a realizar (+,-,*,/) o F para terminar: ");
			operacion = scanner.next().charAt(0);

			if (operacion != 'F' && operacion != 'f') {

				System.out.println("Ingrese el primer número:");
				num1 = scanner.nextInt();
				System.out.println("Ingrese el segundo número:");
				num2 = scanner.nextInt();
			
				switch (operacion) {
				case '+':
					System.out.println("La suma es: " + (num1 + num2));
					break;
				case '-':
					System.out.println("La resta es: " + (num1 - num2));
					break;
				case '*':
					System.out.println("La multiplicación es: " + (num1 * num2));
					break;
				case '/':
					if (num2 == 0) {
						System.out.println("No se puede dividir por 0.");
					} else {
						System.out.println("La división es: " + (num1 / num2));
					}
					break;
				}

			}

		}while (operacion != 'F' && operacion != 'f');
		

		System.out.println("Chau.");
		scanner.close();
	}

}
