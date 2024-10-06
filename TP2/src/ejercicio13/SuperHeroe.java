package ejercicio13;

import java.util.List;

public class SuperHeroe {
	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;

	public SuperHeroe(String nombre, int fuerza, int resistencia, int superpoderes) {
		this.nombre = nombre;
		setFuerza(fuerza);
		setResistencia(resistencia);
		setSuperpoderes(superpoderes);
	}

	public String competir(SuperHeroe otroSuperHeroe) {
		int puntajeSuperHeroe = 0;
		int puntajeOtroSuperHeroe = 0;
		int PUNTAJE_GANADOR = 2;
		
		if (this.fuerza > otroSuperHeroe.fuerza) {
			puntajeSuperHeroe++;
		} else if (this.fuerza < otroSuperHeroe.fuerza) {
			puntajeOtroSuperHeroe++;
		}
		if (this.resistencia > otroSuperHeroe.resistencia) {
			puntajeSuperHeroe++;
		} else if (this.resistencia < otroSuperHeroe.resistencia) {
			puntajeOtroSuperHeroe++;
		}
		if (this.superpoderes > otroSuperHeroe.superpoderes) {
			puntajeSuperHeroe++;
		} else if (this.superpoderes < otroSuperHeroe.superpoderes) {
			puntajeOtroSuperHeroe++;
		}

		if (puntajeSuperHeroe >= PUNTAJE_GANADOR) {
			return Resultado.TRIUNFO.toString();
		} else if (puntajeOtroSuperHeroe >= PUNTAJE_GANADOR) {
			return Resultado.DERROTA.toString();
		} else {
			return Resultado.EMPATE.toString();
		}

	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		if (fuerza < 0)
			fuerza = 0;
		if (fuerza > 100)
			fuerza = 100;
		this.fuerza = fuerza;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		if (resistencia < 0)
			resistencia = 0;
		if (resistencia > 100)
			resistencia = 100;
		this.resistencia = resistencia;
	}

	public int getSuperpoderes() {
		return superpoderes;
	}

	public void setSuperpoderes(int superpoderes) {
		if (superpoderes < 0)
			superpoderes = 0;
		if (superpoderes > 100)
			superpoderes = 100;
		this.superpoderes = superpoderes;
	}

	@Override
	public String toString() {
		return "SuperHeroe: \n" + "Nombre: " + nombre + "\n" + "Fuerza: " + fuerza + "\n" + "Resistencia: "
				+ resistencia + "\n" + "Superpoderes: " + superpoderes + "\n";
	}

}
