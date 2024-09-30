package ejercicio6;

public class Dado {
	private int CARAS = 6;
	private int valor;
	
	public Dado() {
	
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int tirar() {
		return (int)(Math.random() * 6);
	}
	
	
}
