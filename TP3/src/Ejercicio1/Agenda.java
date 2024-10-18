package Ejercicio1;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Persona> personas;

	public Agenda() {
		this.personas = new ArrayList<Persona>();
	}

	public Persona buscarPersona(String dni) {
		Persona persona = null;
		Persona personaEncontrada = null;
		int i = 0;
		while (i < personas.size() && personaEncontrada == null) {
			if (personas.get(i).getDNI().equals(dni)) {
				personaEncontrada = personas.get(i);
			} else {
				i++;
			}
		}

		return personaEncontrada;
	}

	public boolean agregarPersona(String dni, String nombre, String apellido, Domicilio domicilio) {
		Persona personaEncontrada = buscarPersona(dni);
		boolean agregado = false;
		if (personaEncontrada == null) {
			personas.add(new Persona(nombre, apellido, domicilio, dni));
			agregado = true;
		}
		return agregado;
	}

	public Persona removerPersona(String dni) {
		Persona personaEncontrada = buscarPersona(dni);
		Persona aux = null;
		if (personaEncontrada != null) {
			aux = personaEncontrada;
			personas.remove(personaEncontrada);
			return aux;
		} else {
			return null;
		}
	}

	public boolean modificarDomicilio(String dni, Domicilio domicilio) {
		Persona personaEncontrada = buscarPersona(dni);

		if (personaEncontrada != null) {
			personaEncontrada.setDomicilio(domicilio);
			return true;
		} else {
			return false;
		}
	}

	public void listarPersonas() {
		if (personas.isEmpty()) {
			System.out.println("No hay personas en la agenda");
		} else {
			for (Persona persona : personas) {
				System.out.println(persona.toString());
			}
		}
	}

	public Persona devolerUltimo() {
		if (personas.isEmpty()) {
			return null;
		} else {
			return personas.get(personas.size() - 1);
		}
	}

	public void eliminarTodosElementosAMano() {

		while (!personas.isEmpty()) {
			personas.remove(0);
		}
	}

}
