package automotor;

import java.time.LocalDate;

//Ahora un vehiculo sabe si debeReaalizarVTV, encapsule codigo en metodos como tieneMasDeUnAnio(fecha) y esDeBuenosAires(). Genere getters y setters.
//Saque los comentraios ya que los metodos tienen un nombre que explica bien lo que hace cada uno.


public class Vehiculo {
	private Boolean esVehiculoPolicial;
	private LocalDate fechaFabricacion;	
	private String ciudadRadicacion; 
	
	public Vehiculo(Boolean esVehiculoPolicial, LocalDate fechaFabricacion, String ciudadRadicacion) {
		this.esVehiculoPolicial = esVehiculoPolicial;
		this.fechaFabricacion = fechaFabricacion;
		this.ciudadRadicacion = ciudadRadicacion;
	}

	public Boolean esVehiculoPolicial() {
		return esVehiculoPolicial;
	}

	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}

	public String ciudadRadicacion() {
		return ciudadRadicacion;
	}

	public Boolean debeRealizarVTV(LocalDate fecha) {
		// TODO Auto-generated method stub
		return (!this.getEsVehiculoPolicial() && this.tieneMasDeUnAnio(fecha) && this.esDeBuenosAires());
	}

	public Boolean tieneMasDeUnAnio(LocalDate fecha) {
			return fecha.minusYears(1).isAfter(this.getFechaFabricacion());		
	}
	
	private boolean esDeBuenosAires() {
		return this.getCiudadRadicacion().equalsIgnoreCase("Buenos Aires");
	}
	
	
	public Boolean getEsVehiculoPolicial() {
		return esVehiculoPolicial;
	}

	public void setEsVehiculoPolicial(Boolean esVehiculoPolicial) {
		this.esVehiculoPolicial = esVehiculoPolicial;
	}

	public String getCiudadRadicacion() {
		return ciudadRadicacion;
	}

	public void setCiudadRadicacion(String ciudadRadicacion) {
		this.ciudadRadicacion = ciudadRadicacion;
	}

	public void setFechaFabricacion(LocalDate fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}
	
	
	
	
	
}
