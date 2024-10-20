package Ejercicio1;

public class Domicilio {
	private String calle;
	private int numero;
	private String ciudad;
	
	
	
	public Domicilio(String calle, int numero, String ciudad) {
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
	}
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	@Override
	public String toString() {
		return "Domicilio" + " "  + calle + " " + numero + " " + ciudad;
	}

}
