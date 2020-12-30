package Concesionaria;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Vehiculo> lstVehiculo = new ArrayList<Vehiculo>();
		Sistema sistema = new Sistema(lstVehiculo);
		
		sistema.agregarAuto("Peugeot", "206", 200000.00, 4);
		sistema.agregarMoto("Honda", "Titan", 60000.00, "125cc");
		sistema.agregarAuto("Peugeot", "208", 250000.00, 5);
		sistema.agregarMoto("Yamaha", "YBR", 80500.00, "160cc");
		
		sistema.mostrarVehiculos();
		
		System.out.println("============================================");
		//VEHICULO MAS CARO
		System.out.println("Vehiculo más caro: " + sistema.traerVehiculoMasCaro().getMarca().toString());
		System.out.println("============================================");
		
		//VEHICULO MAS BARATO
		System.out.println("Vehiculo más barato: " + sistema.traerVehiculoMasBarato().getMarca().toString());
		System.out.println("============================================");
		
		//VEHICULO QUE EN EL MODELO TIENE LA LETRA Y
		System.out.println("Vehiculo que en el modelo tiene la letra Y: " + sistema.traerVehiculoModeloConY().toString());
		System.out.println("============================================");
		
		
		//ORDEN POR PRECIO
		sistema.ordenPrecioMayorAMenor();
		sistema.mostrarVehiculos();
	}

}
