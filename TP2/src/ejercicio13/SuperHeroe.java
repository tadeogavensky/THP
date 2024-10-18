package ejercicio13;

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

	public Resultado competir(SuperHeroe otroSuperHeroe) {
		int puntajeSuperHeroe = 0;
		int puntajeOtroSuperHeroe = 0;
		final int PUNTAJE_GANADOR = 2;
		
		System.out.println(this.fuerza);
		System.out.println(otroSuperHeroe.fuerza);

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
			return Resultado.TRIUNFO;
		} else if (puntajeOtroSuperHeroe >= PUNTAJE_GANADOR) {
			return Resultado.DERROTA;
		} else {
			return Resultado.EMPATE;
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
		this.fuerza = validarAtributo(fuerza);
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = validarAtributo(resistencia);
	}

	public int getSuperpoderes() {
		return superpoderes;
	}

	public void setSuperpoderes(int superpoderes) {
		this.superpoderes = validarAtributo(superpoderes);
	}

	private static int validarAtributo(int atributo) {
		int MIN = 0;
		int MAX = 100;
		if (atributo < MIN)
			atributo = MIN;
		if (atributo > MAX)
			atributo = MAX;
		return atributo;
	}

	@Override
	public String toString() {
		return "SuperHeroe: \n" + "Nombre: " + nombre + "\n" + "Fuerza: " + fuerza + "\n" + "Resistencia: "
				+ resistencia + "\n" + "Superpoderes: " + superpoderes + "\n";
	}

}
