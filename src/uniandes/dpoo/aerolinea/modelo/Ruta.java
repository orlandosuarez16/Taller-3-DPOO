package uniandes.dpoo.aerolinea.modelo;

/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta
{
    // TODO completar
	private String horaSalida;
	private String horaLlegada;
	private String codigoRuta;
	private Aeropuerto origen;
	private Aeropuerto destino;
	
	public Ruta (Aeropuerto Origen, Aeropuerto Destino, String horaDeSalida, String horaDeLlegada, String codigoDeRuta) {
		
		this.horaSalida = horaDeSalida;
		this.horaLlegada = horaDeLlegada;
		this.codigoRuta = codigoDeRuta;
		this.origen = Origen;
		this.destino = Destino;
	}
	
	
	public String getCodigoRuta() {
		return this.codigoRuta;
	}
	
	public Aeropuerto getOrigen() {
		return this.origen;
	}
	
	public Aeropuerto getDestino() {
		return this.destino;
	}
	
	public String getHoraSalida() {
		return this.horaSalida;
	}
	
	public String getHoraLLegada() {
		return this.horaLlegada;
	}

	public int getDuración (String horaDeSalida, String horaDeLlegada) {
		int horaExactaSalida = getHoras(horaDeSalida);
		int horaExactaLlegada = getHoras(horaDeLlegada);
		int minutosExactosSalida = getMinutos(horaDeSalida);
		int minutosExactosLlegada = getMinutos(horaDeLlegada);
		int duracionHoras;
		int duracionMinutos;
		
		if(horaExactaSalida < horaExactaLlegada) {
			duracionHoras = horaExactaLlegada - horaExactaSalida;
		}
		else {
			duracionHoras = horaExactaLlegada + (24-horaExactaSalida);
		}
		
		if(minutosExactosSalida < minutosExactosLlegada) {
			duracionMinutos = minutosExactosLlegada - minutosExactosSalida;
		}
		else {
			duracionMinutos = minutosExactosLlegada + (60-minutosExactosSalida);
		}
		
		int duracion = (60* duracionHoras)+duracionMinutos;
		return duracion;
	}

    /**
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
    public static int getMinutos( String horaCompleta )
    {
        int minutos = Integer.parseInt( horaCompleta ) % 100;
        return minutos;
    }

    /**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public static int getHoras( String horaCompleta )
    {
        int horas = Integer.parseInt( horaCompleta ) / 100;
        return horas;
    }

    
}
