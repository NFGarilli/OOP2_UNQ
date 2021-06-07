package tp4MercadoCentral;

public class ProductoDeCooperativa extends Producto{
	
	private float iva;

	public ProductoDeCooperativa(Float precioProducto, int cantidad) {
		super(precioProducto, cantidad);
		iva = 10;

	}
	
	public float getIva() {
		return iva;
	}
	
	public void setIva(Float iva) {
		this.iva = iva;
	}

	
	public float precio() {
		return this.precio() - (this.precio()*iva/100);
		
	}
}
