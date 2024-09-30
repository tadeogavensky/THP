package TP1;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int EDAD_MIN_HOMBRE = 65;
        final int EDAD_MIN_MUJER = 60;
        final int EDAD_MAX = 120;
        final int EDAD_MIN = 1;
        final char GENERO_MASCULINO = 'M';
        final char GENERO_FEMENINO = 'F';
        int edad;
        char genero;
        int version;

        boolean puedeJubilarse = false;

        System.out.println("Ingrese la versión que desea ejecutar: (1 DO WHILE o 2 IF ANIDADO) ");
        version = scanner.nextInt();

        switch (version) {
            case 1: {
                do {
                    do {
                        System.out.println("Ingrese su edad entre " + EDAD_MIN + " y " + EDAD_MAX);
                        edad = scanner.nextInt();
                    } while ((edad < EDAD_MIN || edad > EDAD_MAX));

                    do {
                        System.out.println("Ingrese su género " + GENERO_MASCULINO + " para masculino o " + GENERO_FEMENINO + " para femenino: ");
                        genero = scanner.next().toUpperCase().charAt(0);
                    } while ((genero != GENERO_FEMENINO && genero != GENERO_MASCULINO));

                    if ((genero == GENERO_MASCULINO && edad >= EDAD_MIN_HOMBRE) || (genero == GENERO_FEMENINO && edad >= EDAD_MIN_MUJER)) {
                        System.out.println("La persona puede jubilarse");
                        puedeJubilarse = true;
                    } else {
                        System.out.println("La persona no puede jubilarse");
                        puedeJubilarse = false;
                    }

                    System.out.println(puedeJubilarse);

                } while (!puedeJubilarse);
                break;
            }
            case 2: {
                System.out.println("Ingrese su edad entre " + EDAD_MIN + " y " + EDAD_MAX);
                edad = scanner.nextInt();

                System.out.println("Ingrese su género " + GENERO_MASCULINO + " para masculino o " + GENERO_FEMENINO + " para femenino: ");
                genero = scanner.next().toUpperCase().charAt(0);

                if ((edad >= EDAD_MIN && edad <= EDAD_MAX) && (genero == GENERO_FEMENINO || genero == GENERO_MASCULINO)) {
                    if ((genero == GENERO_MASCULINO && edad >= EDAD_MIN_HOMBRE) || (genero == GENERO_FEMENINO && edad >= EDAD_MIN_MUJER)) {
                        System.out.println("La persona puede jubilarse");
                    } else {
                        System.out.println("La persona no puede jubilarse");
                    }
                } else {
                    System.out.println("La edad debe estar entre 1 y 120 y el género debe ser F o M");
                }
                break;
            }
            default:
                System.out.println("Versión no válida. Por favor, elija 1 o 2.");
                break;
        }

        scanner.close();
    }
}