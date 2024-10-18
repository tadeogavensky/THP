package ejercicio3;

import java.util.ArrayList;

public class Barrio {
	private String nombre;
	private ArrayList<Propiedad> propiedades;

	public Barrio(String nombre) {
		this.nombre = nombre;
		this.propiedades = new ArrayList<Propiedad>();
	}

	public void mostrarPropiedades(Tipo tipo) {
		System.out.println("Propiedades en: " + nombre);

		for (Propiedad propiedad : propiedades) {
			if (propiedad.getTipo().equals(tipo)) {
				System.out.println(propiedad);
			}
		}
	}
	
	public void mostrarPropiedades(String domicilio) {
		System.out.println("Propiedades en: " + nombre);

		for (Propiedad propiedad : propiedades) {
			if (propiedad.getDomicilio().equals(domicilio)) {
				System.out.println(propiedad);
			}
		}
	}

	public void agregarPropiedad(Propiedad propiedad) {
		propiedades.add(propiedad);
	}

	public void borrarPropiedad(Propiedad propiedad) {
		propiedades.remove(propiedad);
	}

	public Propiedad buscarPropiedad(Propiedad propiedad) {
		Propiedad propiedadEncontrada = null;
		int i = 0;

		while (i < propiedades.size() && propiedadEncontrada == null) {
			if (propiedades.get(i).equals(propiedad)) {
				propiedadEncontrada = propiedades.get(i);
			}
			i++;
		}

		return propiedadEncontrada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Propiedad> getPropiedades() {
		return propiedades;
	}

	public void setPropiedades(ArrayList<Propiedad> propiedades) {
		this.propiedades = propiedades;
	}

	@Override
	public String toString() {
		return "Barrio [nombre=" + nombre + ", propiedades=" + propiedades + "]";
	}

}
