package tp4_MercadoCentral;
public class Impuesto implements ICalculable {

	private Double tasaDeServicio;
	
	
	public Impuesto(Double tasaDeServicios) {
		this.tasaDeServicio = tasaDeServicios;
	}
	
	
	@Override
	public Double calcularMontoAPagar() {
		return this.tasaDeServicio;
	}


	public void setTasaDeServicio(Double tasaDeServicio) {
		this.tasaDeServicio = tasaDeServicio;
	}
	
	
	

}
