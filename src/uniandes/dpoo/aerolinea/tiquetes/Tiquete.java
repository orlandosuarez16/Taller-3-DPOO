package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {

	private String codigo;
	private int tarifa;
	private boolean usado;
	private Vuelo vuelo;
	private Cliente cliente;
	
	public Tiquete(String nCodigo, Vuelo nVuelo, Cliente clienteComprador, int nTarifa) {
		this.codigo = nCodigo;
		this.vuelo = nVuelo;
		this.cliente = clienteComprador;
		this.tarifa = nTarifa;
		this.usado = false;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public Vuelo getVuelo() {
		return this.vuelo;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public int getTarifa() {
		return this.tarifa;
	}
	
	public void marcarComoUsado() {
		this.usado = true;
	}
	
	public boolean esUsado() {
		return this.usado;
	}
}
