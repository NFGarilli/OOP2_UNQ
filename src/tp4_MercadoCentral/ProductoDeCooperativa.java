package tp4_MercadoCentral;

public class ProductoDeCooperativa extends Producto{
	
	protected Double porcentajeIva;

	public ProductoDeCooperativa(Double precioProducto, int cantidad, String nombre) {
		super(precioProducto, cantidad, nombre);
		this.porcentajeIva = 0.1;

	}
	
	public Double getIva() {
		return this.precio * this.porcentajeIva;
	}
	

	
	public Double getPrecio() {
		return this.precio - this.getIva();
		
	}
	
	
	
}
