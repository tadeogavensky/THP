package ejercicio3;

import java.util.ArrayList;

public class Inmobiliaria {
	private String nombre;
	private ArrayList<Barrio> barrios;

	public Inmobiliaria(String nombre) {
		this.nombre = nombre;
		this.barrios = new ArrayList<Barrio>();
	}

	public void agregarBarrio(Barrio barrio) {
		barrios.add(barrio);
	}

	public void mostrarPropiedades() {
		for (Barrio barrio : barrios) {
			System.out.println("Barrio: " + barrio.getNombre());
			for (Propiedad propiedad : barrio.getPropiedades()) {
				System.out.println(propiedad);
			}
		}
	}

	public Barrio buscarBarrio(Barrio barrio) {
		Barrio barrioEncontrado = null;
		int i = 0;

		while (i < barrios.size() && barrioEncontrado == null) {
			if (barrios.get(i).equals(barrio)) {
				barrioEncontrado = barrios.get(i);
			}
			i++;
		}

		return barrioEncontrado;
	}

	public boolean cambiarPropiedadDeBarrio(Propiedad propiedad,Barrio barrio) {
		Barrio barrioNuevo = buscarBarrio(barrio);
		boolean seCambio = false;
		if (barrioNuevo != null) {
			barrio.borrarPropiedad(propiedad);
			barrioNuevo.agregarPropiedad(propiedad);
			seCambio = true;
		}
		
		return seCambio;

	}
	
	public ArrayList<Barrio> obtenerBarrioMayorProp(){
		ArrayList<Barrio> barriosConMayorProp = new ArrayList<Barrio>();
		Barrio barrioConMayorProp = barrios.get(0);
		int mayorCantidadProp = 0;
		
		
		for(Barrio barrio : barrios) {
			int numProp = barrio.getPropiedades().size();
			if (numProp > mayorCantidadProp) {
				mayorCantidadProp = numProp;
				barrioConMayorProp = barrio;
			}

		}
		
		for(Barrio barrio : barrios) {
			if (barrio.getPropiedades().size() == mayorCantidadProp) {
                barriosConMayorProp.add(barrio);
			}
		}
		
		return barriosConMayorProp;
		
	}
	
	public void mostrarBarriosMayorProp() {
		System.out.println("Barrios con mayor cantidad de propiedades: ");
		ArrayList<Barrio> barriosConMayorProp = obtenerBarrioMayorProp();
		for (Barrio barrio : barriosConMayorProp) {
			System.out.println(barrio);
		}
	}
	
	public Propiedad buscarPropiedad(String domicilio) {
		int i = 0;
		Propiedad propiedadEncontrada= null;
		while (i < barrios.size() && propiedadEncontrada == null) {
			if (barrios.get(i).getPropiedades().get(i).getDomicilio().equals(domicilio)) {
				propiedadEncontrada = barrios.get(i).getPropiedades().get(i);
			}
			i++;
		}
		return propiedadEncontrada;
	}
	
	public void borrarPropiedad(String domicilio) {
		Propiedad propiedadABorrar = buscarPropiedad(domicilio);
		System.out.println(propiedadABorrar);
		
		int i = 0;
		boolean encontro = false;
		while (i < barrios.size() && !encontro) {
			if (barrios.get(i).getPropiedades().equals(propiedadABorrar)) {
				barrios.get(i).borrarPropiedad(propiedadABorrar);
				encontro = true;
			}
			i++;
		}
		System.out.println("Se borro la propiedad");
	}
	
	public void borrarBarrio(Barrio barrio) {
		barrios.remove(barrio);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Barrio> getBarrios() {
		return barrios;
	}
	
	public void setBarrios(ArrayList<Barrio> barrios) {
		this.barrios = barrios;
	}
	

}
