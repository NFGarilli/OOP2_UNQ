package tp4MercadoCentral;

public class Servicio implements ICalculable{
	
	private Double precioXUnidad;
	private Integer cantidadDeUnidades;
	
	public Servicio(Double precioXUnidad, Integer cantidadDeUnidades) {
		this.precioXUnidad = precioXUnidad;
		this.cantidadDeUnidades = cantidadDeUnidades;
		
	}
	
	public Double calcularMontoAPagar() {
		return this.precioXUnidad * this.cantidadDeUnidades;
		
	}

	public Double getPrecioXUnidad() {
		return precioXUnidad;
	}

	public void setPrecioXUnidad(Double precioXUnidad) {
		this.precioXUnidad = precioXUnidad;
	}

	public Integer getCantidadDeUnidades() {
		return cantidadDeUnidades;
	}

	public void setCantidadDeUnidades(Integer cantidadDeUnidades) {
		this.cantidadDeUnidades = cantidadDeUnidades;
	}
	
	
	

}
