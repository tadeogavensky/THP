package TP1;

import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner	scanner = new Scanner(System.in);
		int inscriptos;
		int asientosDisponibles;
		
		System.out.println("Ingrese la cantidad de inscriptos: ");
		inscriptos = scanner.nextInt();
		System.out.println("Ingrese la cantidad de asientos disponibles: ");
		asientosDisponibles = scanner.nextInt();
		
		if(inscriptos <= asientosDisponibles) {
			System.out.println("Los asientos alcanzan");
		} else {
			System.out.println("Los asientos no alcanzan, faltan " + (inscriptos -asientosDisponibles) + " asientos");
		}
	}
}
