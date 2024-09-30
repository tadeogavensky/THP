package ejercicio8;

public class Test {

	public static void main(String[] args) {
		TarjetaDeCredito tarjeta = new TarjetaDeCredito("4145-4141-2222-1111", "Juan Perez", 10000);
		System.out.println("Tarjeta:");
		System.out.println(tarjeta);

		System.out.println();
		System.out.println("Realizando compra de 4000");
		tarjeta.realizarCompra(4000);

		System.out.println("A la tarjeta le queda: " + tarjeta.montoDisponible());
		tarjeta.actualizarLimite(3000);
		System.out.println("Se actualiza el limite a " + tarjeta.getLimiteDeCompra());

		
		System.out.println();
		
		System.out.println("Realizando compra de 4000");
		tarjeta.realizarCompra(4000);
		
		System.out.println(tarjeta);

	}

}
