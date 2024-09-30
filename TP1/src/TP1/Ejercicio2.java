package TP1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int nota1,nota2,nota3;
		int total = 0;
		double promedio;
		
		System.out.println("Ingrese la primer nota: ");
		nota1 = scanner.nextInt();
		total += nota1;
		System.out.println("Ingrese la segunda nota: ");
		nota2 = scanner.nextInt();
		total += nota2;
		System.out.println("Ingrese la tercer nota: ");
		nota3 = scanner.nextInt();
		total += nota3;
		
		promedio = total/3;
		
		System.out.println("El promedio  es: "+ promedio);
		

	}

}
