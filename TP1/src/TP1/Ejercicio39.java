package TP1;

import java.util.Scanner;

public class Ejercicio39 {
	final static Scanner scanner = new Scanner(System.in);

	final static int DISPAROS_MAX = 3;
	final static int PARTICIPANTES_MAX = 2;

	public static void main(String[] args) {
		int puntaje;
		int participantes;
		int puntajeMaximo = 0;
		int tirosAlCentro = 0;

		String nombre;
		String ganador = "";

		double distancia;

		System.out.println("Ingrese la cantidad de participantes (2 como minimo): ");
		participantes = scanner.nextInt();
		while (participantes < PARTICIPANTES_MAX) {
			System.out.println("ATENCIÓN! Ingresar cantidad de participantes (2 cómo mínimo): ");
			participantes = scanner.nextInt();
		}

		for (int participanteActual = 1; participanteActual <= participantes; participanteActual++) {
			System.out.println("Ingrese el nombre del participante " + participanteActual + ": ");
			nombre = scanner.next();
			puntaje = 0;
			for (int disparoActual = 1; disparoActual <= DISPAROS_MAX; disparoActual++) {

				System.out.println("Ingrese la distancia al centro del disparo " + disparoActual + " (en metros): ");
				distancia = scanner.nextDouble();
				while (distancia < 0) {
					System.out.println("La distancia debe ser mayor o igual a 0, ingresar distancia nuevamente:");
					distancia = scanner.nextDouble();
				}
				if (distancia == 0) {
					tirosAlCentro++;
					puntaje += 500;
				} else if (distancia <= 10) {
					puntaje += 250;
				} else if (distancia >= 11 && distancia <= 50) {
					puntaje += 100;
				} else {
					puntaje += 0;

				}

				if (puntaje > puntajeMaximo) {
					puntajeMaximo = puntaje;
					ganador = nombre;
				}

			}
		}
		System.out.println("El ganador es: " + ganador + " con un puntaje total de: " + puntajeMaximo);
		System.out.println("La cantidad de tiros al centro fue de: " + tirosAlCentro);

	}

}
