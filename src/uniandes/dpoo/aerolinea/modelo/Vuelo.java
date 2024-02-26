package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.Map;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {

	private String fecha;
	private Ruta ruta;
	private Avion avion;
	private Map<String, Tiquete> tiquetes;
	
	public Vuelo(String nFecha, Ruta nRuta, Avion nAvion) {
		this.fecha = nFecha;
		this.ruta = nRuta;
		this.avion = nAvion;
	}
	
	public String getFecha() {
		return this.fecha;
	}
	
	public Ruta getRuta() {
		return this.ruta;
	}
	
	public Avion getAvion() {
		return this.avion;
	}
	
	public Collection<Tiquete> getTiquetes() {
		return tiquetes.values();
	}
	
	public int venderTiquete(Cliente nCliente, CalculadoraTarifas calculadora, int cantidad) {
		return cantidad;
	}
	
	public boolean equals(Object obj){
		return false;	
	}
	
}


