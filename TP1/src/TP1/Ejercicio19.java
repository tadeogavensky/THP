package TP1;

import java.util.Scanner;

public class Ejercicio19 {
	final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean esDeUnSoloDigito = false, esImpar = false, estaEnAmbosGrupos = false, noEstaEnNingunGrupo = false;
		Integer num;

		System.out.println("Ingrese un número: ");
		num = scanner.nextInt();
		System.out.println("El número ingresado es: " + num);

		System.out.println("LONGITUD" + String.valueOf(num).length());

		System.out.println("-----------------VERSION ORT-----------------------");

		System.out.println("Es de un solo dígito: " + (num >= 0 && num <= 9));
		System.out.println("Es impar: " + (num % 2 != 0));
		System.out.println("Está en ambos grupos: " + ((num >= 0 && num <= 9) && (num % 2 != 0)));
		System.out.println("No está en ninguno de los grupos: " + ((num >= 0 && num <= 9) && (num % 2 == 0)));

		System.out.println("----------------------V1---------------------------------");

		System.out.println("Es de un solo dígito: " + (String.valueOf(num).length() == 1));
		System.out.println("Es impar: " + (num % 2 != 0));
		System.out.println("Está en ambos grupos: " + ((String.valueOf(num).length() == 1) && (num % 2 != 0)));
		System.out.println(
				"No está en ninguno de los grupos: " + ((String.valueOf(num).length() != 1) && (num % 2 == 0)));

		System.out.println("----------------------V2---------------------------------");

		if ((String.valueOf(num).length() == 1) && (num % 2 != 0)) {
			System.out.println("El número ingresado es de un solo dígito e impar");
			esDeUnSoloDigito = true;
			esImpar = true;
			estaEnAmbosGrupos = true;
			noEstaEnNingunGrupo = false;
		} else if ((num % 2 != 0)) {
			System.out.println("El número ingresado es impar");
			esImpar = true;
		} else if ((int) (Math.log10(num) + 1) == 1) {
			System.out.println("El número ingresado es de un solo dígito");
			esDeUnSoloDigito = true;
		} else {
			System.out.println("El número ingresado no está en ninguno de los grupos");
			noEstaEnNingunGrupo = true;
		}

		System.out.println("No está en ninguno de los grupos: " + noEstaEnNingunGrupo);
		System.out.println("Es de un solo dígito: " + esDeUnSoloDigito);
		System.out.println("Es impar: " + esImpar);
		System.out.println("Está en ambos grupos: " + estaEnAmbosGrupos);

	}

}
