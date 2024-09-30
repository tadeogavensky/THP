package TP1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		
		do {
            System.out.println("Ingrese un número positivo: ");
            num = scanner.nextInt();

            if (num < 0) {
                System.out.println("El número ingresado debe ser positivo");
            }
        } while (num < 0);

        System.out.println("A) " + num * 5);
        System.out.println("B) " + num / 2);

        scanner.close();
    }

			
}


