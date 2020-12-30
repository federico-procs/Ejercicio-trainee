package Concesionaria;

public class Marca {
	private String nombre;
	private Modelo modelo;
	
	public Marca(String nombre, Modelo modelo) {
		this.nombre = nombre;
		this.modelo = modelo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Marca: " + nombre + "// Modelo: " + modelo.getNombre();
	}
	
	
}
