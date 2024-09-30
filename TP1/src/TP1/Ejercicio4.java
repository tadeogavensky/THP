package TP1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double pagaxhora;
		int horasTrabajadas;
		double salarioSemanal;
		
		
		System.out.println("Ingrese el pago por hora: ");
		pagaxhora = scanner.nextDouble();
		System.out.println("Ingrese las horas trabajadas: ");
		horasTrabajadas = scanner.nextInt();
		
		
		int totalHorasTrabajadas = 5 * horasTrabajadas + 4;
		salarioSemanal= pagaxhora*totalHorasTrabajadas;
		
		System.out.println("Total ganado por semana: $"+salarioSemanal);

	}

}
