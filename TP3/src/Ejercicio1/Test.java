package Ejercicio1;

public class Test {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Persona persona1 = new Persona("Juan", "Pérez", new Domicilio("Av. Libertador", 1234, "Buenos Aires"),
				"12345678");
		Persona persona2 = new Persona("María", "González", new Domicilio("Calle Corrientes", 567, "Córdoba"),
				"23456789");
		Persona persona3 = new Persona("Carlos", "Rodríguez", new Domicilio("Av. San Martín", 890, "Rosario"),
				"34567890");
		Persona persona4 = new Persona("Ana", "Fernández", new Domicilio("Calle Sarmiento", 123, "Mendoza"),
				"45678901");
		Persona persona5 = new Persona("Luis", "Martínez", new Domicilio("Av. Belgrano", 456, "La Plata"), "56789012");
	
		agenda.agregarPersona(persona1.getDNI(), persona1.getNombre(), persona1.getApellido(), persona1.obtenerDomicilio());
		agenda.agregarPersona(persona2.getDNI(), persona2.getNombre(), persona2.getApellido(), persona2.obtenerDomicilio());
		agenda.agregarPersona(persona3.getDNI(), persona3.getNombre(), persona3.getApellido(), persona3.obtenerDomicilio());
		agenda.agregarPersona(persona4.getDNI(), persona4.getNombre(), persona4.getApellido(), persona4.obtenerDomicilio());
		agenda.agregarPersona(persona5.getDNI(), persona5.getNombre(), persona5.getApellido(), persona5.obtenerDomicilio());
		

		
		
		
	
		
		System.out.println("ELIMINAR");
		agenda.eliminarTodosElementosAMano();
		
		System.out.println("----------------------");
		
		System.out.println("AGENDA DE PERSONAS");
		agenda.listarPersonas();

		
	}

}
