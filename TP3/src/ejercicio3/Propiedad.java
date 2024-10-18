package ejercicio3;

public class Propiedad {

	private String domicilio;
	private Double precio;
	private Tipo tipo;

	public Propiedad(String domicilio, Double precio, Tipo tipo) {
		this.domicilio = domicilio;
		this.precio = precio;
		this.tipo = tipo;
	}

	public Propiedad() {

	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Propiedad [domicilio=" + domicilio + ", precio=" + precio + ", tipo=" + tipo + "]";
	}
	
	

}
