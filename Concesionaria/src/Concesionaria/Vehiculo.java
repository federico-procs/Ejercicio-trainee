package Concesionaria;

public abstract class Vehiculo {
	protected Marca marca;
	protected double precio;
	
	public Vehiculo(Marca marca, double precio) {
		this.marca = marca;
		this.precio = precio;
	}

	protected Marca getMarca() {
		return marca;
	}

	protected void setMarca(Marca marca) {
		this.marca = marca;
	}

	protected double getPrecio() {
		return precio;
	}

	protected void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
