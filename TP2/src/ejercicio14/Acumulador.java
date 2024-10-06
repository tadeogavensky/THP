package ejercicio14;

public class Acumulador {
	private int acumulador = 0;

	public void incrementar(int valor) {
		this.acumulador += valor;
	}
	
	public int obtenerValor() {
		return this.acumulador;
	}
}
