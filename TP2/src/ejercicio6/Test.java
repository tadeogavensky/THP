package ejercicio6;

public class Test {

	public static void main(String[] args) {
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();

		dado1.setValor(dado1.tirar());
		dado2.setValor(dado2.tirar());
		
		
		int lanzamientos = 100;
		int promedio = 0;
		int suma = 0;

		
		
		System.out.println("Tirada unica");
		System.out.println("El valor del primer dado es: " + dado1.getValor());
		System.out.println("El valor del segundo dado es: " + dado2.getValor());
		if (dado1.getValor() == dado2.getValor()) {
			System.out.println("El resultado es el mismo en los dos dados: " +dado1.getValor());
		} else {
			if (dado1.getValor() > dado2.getValor()) {
				System.out.println("El valor mayor es: " + dado1.getValor());
			} else {
				System.out.println("El valor mayor es: " + dado2.getValor());
			}

		}
		
		System.out.println("El valor entre los dos dados es: " + (dado1.getValor() + dado2.getValor()));
		
		System.out.println();
		System.out.println();

		
		
		
		System.out.println("Tirada de 100");
		for (int lanzamiento = 0; lanzamiento < lanzamientos; lanzamiento++) {
			dado1.setValor(dado1.tirar());
			dado2.setValor(dado2.tirar());
			suma += dado1.getValor() + dado2.getValor();
			
		}
		
		promedio = suma / lanzamientos;
		System.out.println("El promedio de los resultados de 100 lanzamientos es: " + promedio);


	}

}
