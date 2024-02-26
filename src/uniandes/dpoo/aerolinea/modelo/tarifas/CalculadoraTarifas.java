package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public interface CalculadoraTarifas {

	public double impuesto = 0.28;
	
	public int calcularTarifa(Vuelo vuelo, Cliente cliente);
	
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente);
	
	protected double porcentajeDescuento(Cliente cliente);
	
	protected int calcularDistanciaVuelo(Ruta ruta);
	
	protected int calcularValorImpuestos(int costoBase);
}
