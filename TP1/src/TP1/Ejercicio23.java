package TP1;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio23 {
	final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int num;
		
		System.out.println("Ingrese un número entero: ");
		num = Integer.parseInt(scanner.nextLine());
		
		
		for (int i = 1; i <= 10; i++) {
			 int multiplo = num * i;
			 System.out.println(i + " x " + num + " = " + multiplo);
		}
		scanner.close();
	}

}
