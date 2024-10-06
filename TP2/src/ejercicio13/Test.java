package ejercicio13;

public class Test {

	/*
	 * Escribir la clase Test que contenga el método main() para probar el correcto
	 * funcionamiento de la clase previamente realizada con el siguiente ejemplo:
	 * superHeroe1: Nombre: “Batman” , Fuerza: 90, Resistencia: 70, Superpoderes: 0
	 * superHeroe2: Nombre: “Superman” , Fuerza: 95, Resistencia: 60, Superpoderes:
	 * 70 Hacer jugar al superheroe1 pasándole el objeto superheroe2 y mostrar el
	 * resultado por pantalla. Chequear el resultado (debería ser DERROTA). Hacer
	 * jugar al superheroe2 contra el superheroe1 y mostrar el resultado por
	 * pantalla. Chequear el resultado (debería ser TRIUNFO). Crear más superhéroes
	 * con distintos valores y jugar.
	 */

	public static void main(String[] args) {
		SuperHeroe batman = new SuperHeroe("Batman", 90, 70, 0);
		SuperHeroe superman = new SuperHeroe("Superman", 95, 60, 70);
		SuperHeroe flash = new SuperHeroe("Flash", 80, 50, 90);
		SuperHeroe aquaman = new SuperHeroe("Aquaman", 70, 80, 60);
		SuperHeroe mujerMaravilla = new SuperHeroe("Mujer Maravilla", 85, 75, 80);
		
		String batmanVsSuperman = batman.competir(superman);
		String batmanVsFlash = flash.competir(batman);
		String flashVsAquaman = flash.competir(aquaman);
		String mujerMaravillaVsSuperman = mujerMaravilla.competir(superman);
		String batmanVsMujerMaravilla = batman.competir(mujerMaravilla);
		
		System.out.println("Batman vs Superman");
		System.out.println(batmanVsSuperman + " de " + batman.getNombre() + " contra " + superman.getNombre());
		System.out.println();
		System.out.println("Superman vs Batman");
		System.out.println(batmanVsFlash + " de " + superman.getNombre() + " contra " + batman.getNombre());
		System.out.println();
		System.out.println("Flash vs Aquaman");
		System.out.println(flashVsAquaman + " de " + flash.getNombre() + " contra " + aquaman.getNombre());
		System.out.println();
		System.out.println("Mujer Maravilla vs Superman");
		System.out.println(mujerMaravillaVsSuperman + " de " + mujerMaravilla.getNombre() + " contra " + superman.getNombre());
		System.out.println();
		System.out.println("Batman vs Mujer Maravilla");
		System.out.println(batmanVsMujerMaravilla + " de " + batman.getNombre() + " contra " + mujerMaravilla.getNombre());
		System.out.println();
		
		
	}

}
