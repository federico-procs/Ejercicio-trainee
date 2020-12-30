package Concesionaria;

import java.util.ArrayList;

public class Sistema {
	ArrayList<Vehiculo> lstVehiculos = new ArrayList<Vehiculo>();

	public Sistema(ArrayList<Vehiculo> lstVehiculos) {
		this.lstVehiculos = lstVehiculos;
	}
	
	/**Recibe los datos de un auto que se usarán para instanciar el objeto
	 * 
	 * @param marca, String perteneciente al nombre de la marca
	 * @param modelo, String perteneciente al nombre del modelo
	 * @param precio
	 * @param puertas
	 * 
	 * @return true si se cargó correctamente
	 */
	public boolean agregarAuto (String marca, String modelo, double precio, int puertas) {
		this.lstVehiculos.add(new Auto(new Marca(marca, new Modelo(modelo)), precio, puertas));
		return true;
	}
	
	/**Recibe los datos de una moto que se usarán para instanciar el objeto
	 * 
	 * @param marca, String perteneciente al nombre de la marca
	 * @param modelo, String perteneciente al nombre del modelo
	 * @param precio
	 * @param cilindrada
	 * 
	 * @return true si se cargó correctamente
	 */
	public boolean agregarMoto (String marca, String modelo, double precio, String cilindrada) {
		this.lstVehiculos.add(new Moto(new Marca(marca, new Modelo(modelo)), precio, cilindrada));
		return true;
	}
	
	/**Recorre la lista y en base a comparaciones encuentra la posicion del objeto 
	 * 
	 * @return elemento de la lista correspondiente al indice obtenido
	 */
	public Vehiculo traerVehiculoMasCaro() {
		int posicionVehiculo= 0, i=0;
		for (i=0;i<(this.lstVehiculos.size()-1);i++) {
			if(this.lstVehiculos.get(i++).getPrecio() > this.lstVehiculos.get(i).getPrecio()) {
				posicionVehiculo = i++;
			}
		}
		return this.lstVehiculos.get(posicionVehiculo);
	}
	
	/**Recorre la lista y en base a comparaciones encuentra la posicion del objeto 
	 * 
	 * @return elemento de la lista correspondiente al indice obtenido
	 */
	public Vehiculo traerVehiculoMasBarato() {
		int posicionVehiculo= 0, i=0;
		for (i=0;i<(this.lstVehiculos.size()-1);i++) {
			if(this.lstVehiculos.get(i++).getPrecio() < this.lstVehiculos.get(i).getPrecio()) {
				posicionVehiculo = i++;
			}
		}
		return this.lstVehiculos.get(posicionVehiculo);
	}
	
	/**Recorre la lista y compara sus caracteres con el caracter "Y"
	 * 
	 * @return elemento de la lista correspondiente a la comparación
	 */
	public Vehiculo traerVehiculoModeloConY() {
		int i=0;
		for(i=0;i<this.lstVehiculos.size();i++) {
			if (this.lstVehiculos.get(i).getMarca().getModelo().getNombre().indexOf("Y")!=-1) return this.lstVehiculos.get(i);
		}
		return null;	
	}
	
	/**Reccore la lista y muestra sus elementos
	 * 
	 */
	public void mostrarVehiculos() {
		for(Vehiculo vehiculo : this.lstVehiculos) {
			System.out.println(vehiculo.toString());
		}
	}
	
	/**Recorre la lista y compara cada elemento con los siguientes de la lista. En caso de cumplirse la condición, se intercambian las posiciones de los elementos
	 * 
	 * @return true si se procedió correctamente
	 */
	public boolean ordenPrecioMayorAMenor() {
		int i=0, j=0;
		for(i=0;i<(this.lstVehiculos.size()-1);i++) {
			for(j=(i+1);j<this.lstVehiculos.size();j++) {
				if(this.lstVehiculos.get(i).getPrecio()<this.lstVehiculos.get(j).getPrecio()) {
					this.lstVehiculos.add(i, this.lstVehiculos.get(j));
					this.lstVehiculos.remove(j+1);
				}
			}
		}
		return true;
	}
}
