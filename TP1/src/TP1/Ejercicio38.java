package TP1;

import java.util.Scanner;

public class Ejercicio38 {
	final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String usuario = "admin", password = "123456", usuarioCargado, passwordCargado;
		int intentos = 3;
		boolean puedeEntrar = false;
		

		do {
			System.out.println("Ingrese el usuario:");
			usuarioCargado = scanner.nextLine();
			System.out.println("Ingrese la contraseña:");
			passwordCargado = scanner.nextLine();

			puedeEntrar = usuarioCargado.equals(usuario) && passwordCargado.equals(password);
			if(!puedeEntrar) {
				intentos--;
			}
		} while (intentos > 0 && (!(usuarioCargado.equals(usuario) && passwordCargado.equals(password))));

		if (puedeEntrar) {
			System.out.println("Acceso concedido, con " + intentos + " intentos" );
		} else {
			System.out.println("Se ha bloqueado el acceso.");
		}

	}

}
