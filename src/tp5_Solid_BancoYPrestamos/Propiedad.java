package tp5_Solid_BancoYPrestamos;

public class Propiedad {
	
	private String descripcion;
	private String direccion;
	private Float valorFiscal;
	
	public Propiedad(String descripcion, String direccion, float valorFiscal) {
		this.setDescripcion(descripcion);
		this.setDireccion(direccion);
		this.setValorFiscal(valorFiscal);
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Float getValorFiscal() {
		return valorFiscal;
	}
	public void setValorFiscal(Float valorFiscal) {
		this.valorFiscal = valorFiscal;
	}


}