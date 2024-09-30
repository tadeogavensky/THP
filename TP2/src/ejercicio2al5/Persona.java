package ejercicio2al5;

public class Persona {
	private String nombre;
	private String apellido;
	private Domicilio domicilio;

	public Persona() {
		nombre = "";
		apellido = "";
	}
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Domicilio obtenerDomicilio() {
		if (domicilio != null) {
			return domicilio;
		}else {
			return null;
		}
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	public String obtenerNombreCompleto() {
		return nombre + " " + apellido;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
	}


	
	

}
