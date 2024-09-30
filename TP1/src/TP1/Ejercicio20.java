package TP1;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		char operacion;
		
		System.out.println("Ingrese la operación que desea realizar (+,-,*,/): ");
		operacion = scanner.next().charAt(0);	
			

		System.out.println("Ingrese el primer número: ");
		num1 = scanner.nextInt();
		System.out.println("Ingrese el segundo número: ");
		num2 = scanner.nextInt();
		
		
			
			switch (operacion) {
			case '+':
				System.out.println("El resultado de la suma es: " + (num1 + num2));
				break;
			case '-':
				System.out.println("El resultado de la resta es: " + (num1 - num2));
				break;
			case '*':
				System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
			case '/':
				if(num2 == 0) {
	                System.out.println("No se puede dividir por 0");
				}else {
					System.out.println("El resultado de la división es: " + (num1 / num2));
				}
				break;
			default:
				System.out.println("Operación no válida");
				break;
			}


		

	

}
}
