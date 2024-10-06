package ejercicio14;


public class Promedio {
	private Contador contador;
	private Acumulador acumulador;

	
	public Promedio() {
		this.contador = new Contador();
		this.acumulador = new Acumulador();
	}
	
	public void incrementar(int valor) {
        this.contador.contar();
        this.acumulador.incrementar(valor);
    }
	
	public int obtenerPromedio() {
		int contadorValor = contador.obtenerValor();
		int acumuladorValor = acumulador.obtenerValor();
		
		if (contadorValor == 0) {
			return 0;
		} else {
			return acumuladorValor / contadorValor;
		}
	}

}
