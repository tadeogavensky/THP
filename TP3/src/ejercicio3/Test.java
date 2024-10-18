package ejercicio3;

public class Test {

	public static void main(String[] args) {
		Inmobiliaria inmobiliaria = new Inmobiliaria("Martin & Asociados");

		Barrio recoleta = new Barrio("Recoleta");
		Barrio caballito = new Barrio("Caballito");
		Barrio villaCrespo = new Barrio("Villa Crespo");
		Barrio belgrano = new Barrio("Belgrano");
		Barrio palermo = new Barrio("Palermo");

		inmobiliaria.agregarBarrio(recoleta);
		inmobiliaria.agregarBarrio(caballito);
		inmobiliaria.agregarBarrio(villaCrespo);
		inmobiliaria.agregarBarrio(belgrano);
		inmobiliaria.agregarBarrio(palermo);

		// Agregar propiedades a Recoleta
		recoleta.agregarPropiedad(new Propiedad("Juncal 425", (double) 450000, Tipo.CASA));
		recoleta.agregarPropiedad(new Propiedad("Av. Alvear 1800", (double) 350000, Tipo.DEPARTAMENTO));

		// Agregar propiedades a Caballito
		caballito.agregarPropiedad(new Propiedad("Av. Rivadavia 5678", (double) 280000, Tipo.PH));
		caballito.agregarPropiedad(new Propiedad("Acoyte 145", (double) 220000, Tipo.DEPARTAMENTO));
		caballito.agregarPropiedad(new Propiedad("Pedro Goyena 789", (double) 380000, Tipo.CASA));

		// Agregar propiedades a Villa Crespo
		villaCrespo.agregarPropiedad(new Propiedad("Av. Corrientes 5678", (double) 200000, Tipo.DEPARTAMENTO));
		villaCrespo.agregarPropiedad(new Propiedad("Av. Corrientes 5680", (double) 210000, Tipo.DEPARTAMENTO));
		villaCrespo.agregarPropiedad(new Propiedad("Araoz 1234", (double) 260000, Tipo.PH));
		villaCrespo.agregarPropiedad(new Propiedad("Av. Scalabrini Ortiz 2000", (double) 290000, Tipo.CASA));
		villaCrespo.agregarPropiedad(new Propiedad("Av. Scalabrini Ortiz 2002", (double) 300000, Tipo.CASA));

		// Agregar propiedades a Belgrano
		belgrano.agregarPropiedad(new Propiedad("Av. Cabildo 2500", (double) 320000, Tipo.DEPARTAMENTO));
		belgrano.agregarPropiedad(new Propiedad("Juramento 2345", (double) 550000, Tipo.CASA));
		belgrano.agregarPropiedad(new Propiedad("Blanco Encalada 1500", (double) 300000, Tipo.PH));
		
		// Agregar propiedades a Palermo
	
		
		
		
		
		// Cambiar propiedad de barrio
		Propiedad propiedad = new Propiedad("Av. Santa Fe 1234", (double) 500000, Tipo.CASA);
		palermo.agregarPropiedad(propiedad);
		palermo.mostrarPropiedades("Av. Santa Fe 1234");
		
		inmobiliaria.cambiarPropiedadDeBarrio(propiedad, recoleta);
		
		recoleta.mostrarPropiedades("Av. Santa Fe 1234");
		
        inmobiliaria.borrarPropiedad("Av. Cabildo 2500");
		
		
		
		
		
		
		
		

	}

}
