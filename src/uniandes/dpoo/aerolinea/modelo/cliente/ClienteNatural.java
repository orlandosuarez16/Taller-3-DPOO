package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente{

	public String NATURAL = "natural";
	private String nombre;
	
	public ClienteNatural(String nNombre) {
		super();
		this.nombre = nNombre;
	}
	
	public String getIdentificador() {
		return null;
	}
	
	public String getTipoCliente() {
		return NATURAL;
	}
}
