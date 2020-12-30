package Concesionaria;

public class Moto extends Vehiculo{
	private String cilindrada;

	public Moto(Marca marca, double precio, String cilindrada) {
		super(marca, precio);
		this.cilindrada = cilindrada;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return marca.toString() + " // Cilidrada: " + this.cilindrada + " // Precio: " + this.precio;
	}
	
	
}
