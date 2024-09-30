package ejercicio8;

public class TarjetaDeCredito {
	private String numero;
	private String titular;
	private double limiteDeCompra;
	private double acumuladoActual;
	
	public TarjetaDeCredito(String numero, String titular, double limiteDeCompra) {
        this.numero = numero;
        this.titular = titular;
        this.limiteDeCompra = limiteDeCompra;
        this.acumuladoActual = 0;
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getLimiteDeCompra() {
		return limiteDeCompra;
	}

	public void setLimiteDeCompra(double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}

	public double getAcumuladoActual() {
		return acumuladoActual;
	}

	public double montoDisponible() {
		double montoDisponible = limiteDeCompra - acumuladoActual;
		if (montoDisponible < 0)
			return 0;
		else
			return limiteDeCompra - acumuladoActual;
	}
	
	private boolean compraPosible(double monto) {
		if (montoDisponible() < monto) {
			return false;
		}else {
			return true;
		}
	}
	
	public void actualizarLimite(double monto) {
		limiteDeCompra = monto;
	}
	
	public void acumularGastoActual(double importe) {
		acumuladoActual += importe;
	}
	
	
	public boolean realizarCompra(double monto) {
		if(compraPosible(monto) == true) {
			acumularGastoActual(monto);
			return true;
		}else {
			return false;
		}
    
	}

	public String toString() {
	    return "Numero: " + numero + 
	           "\nTitular: " + titular + 
	           "\nLimite de compra: " + limiteDeCompra + 
	           "\nAcumulado actual: " + acumuladoActual + 
	           "\nMonto disponible: " + montoDisponible();
	}
	

}
