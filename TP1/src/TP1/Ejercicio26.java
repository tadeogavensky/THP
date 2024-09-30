package TP1;

import java.util.Scanner;

public class Ejercicio26 {
	final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		 System.out.print("Ingrese un número natural n: ");
	        int n = scanner.nextInt();
	        
	        int contador = 0;
	        int numero = 1;
	        
	        System.out.println("Los primeros " + n + " múltiplos de 3 (excepto los múltiplos de 5) son:");
	        
	        while (contador < n) {
	            if (numero % 3 == 0 && numero % 5 != 0) {
	                System.out.print(numero + " ");
	                contador++;
	            }
	            numero++;
	        }
	

	}
}
