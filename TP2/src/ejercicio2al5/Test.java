package ejercicio2al5;

public class Test {

	public static void main(String[] args) {

		Persona persona1 = new Persona();
		persona1.setNombre("Fulano");
		persona1.setApellido("Gomez");

		System.out.println("Persona 1:");
		System.out.println(persona1.obtenerNombreCompleto());
		System.out.println();
		System.out.println("Persona 2:");
		Persona persona2 = new Persona();
		persona2.setNombre("Mengano");
		persona2.setApellido("Perez");
		System.out.println(persona2.obtenerNombreCompleto());

		Domicilio domicilio1 = new Domicilio("Calle falsa", 123, "Springfield");

		persona1.setDomicilio(domicilio1);
		System.out.println();
		
		System.out.println("Domicilio de Persona 1:");
		if (persona1.obtenerDomicilio() != null) {
			System.out.println(persona1.obtenerDomicilio());
		} else {
			System.out.println("No tiene domicilio");
		}
		System.out.println();
		
		persona2.setDomicilio(domicilio1);
		persona2.obtenerDomicilio().setCalle("Calle verdadera");
		
		System.out.println("Domicilio de Persona 2:");
		if (persona2.obtenerDomicilio() != null) {
			System.out.println(persona1.obtenerDomicilio());
		} else {
			System.out.println("No tiene domicilio");
		}

	}

}
