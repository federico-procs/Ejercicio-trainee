package Concesionaria;

public class Auto extends Vehiculo{
	private int puertas;

	public Auto(Marca marca, double precio, int puertas) {
		super(marca, precio);
		this.puertas = puertas;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		return marca.toString() + " // Puertas: " + this.puertas + " // Precio: " + this.precio;
	}
	

}
