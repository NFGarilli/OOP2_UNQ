package tp4MercadoCentral;

public class Producto{
	private float precio;
	private int stock;
	
	public Producto(Float precioProducto, int cantidad) {
		precio = precioProducto;
		stock = cantidad;

	}
	
	protected Float getPrecio() {
		return precio;
	}
	
	
	public void setPrecio(Float unPrecio) {
		this.precio = unPrecio; 
	}
	

	public void setStock(int cantidad) {
		stock = cantidad; 
	}
	
	public int getStock() {
		return stock;
	}
	
	public void decrementarStock() {
		stock = stock - 1;
	}


}