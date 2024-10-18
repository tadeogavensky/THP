package Ejercicio1;

public class Persona {
	private String nombre;
	private String apellido;
	private Domicilio domicilio;
	private String dni;

	public Persona() {
		nombre = "";
		apellido = "";
	}
	
	public Persona(String nombre, String apellido, Domicilio domicilio, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.dni = dni;
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
	
	
	public String getDNI() {
		return dni;
	}

	public void setDNI(String dni) {
		this.dni = dni;
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
		return "Persona [nombre=" + nombre + ", apellido=" + apellido +  ", dni=" + dni + ", domicilio=" + domicilio +"]";
	}


	
	

}
