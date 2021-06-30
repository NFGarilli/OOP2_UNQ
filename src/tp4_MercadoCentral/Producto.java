package tp4MercadoCentral;

public class Producto implements IPrecio{
	protected Double precio;
	protected int stock;
	protected String nombre;
	
	public Producto(Double precioProducto, int cantidad, String nombre) {
		precio = precioProducto;
		stock = cantidad;

	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public Double getPrecio() {
		return precio;
	}
	
	
	public void setPrecio(Double unPrecio) {
		this.precio = unPrecio; 
	}
	

	public void setStock(int cantidad) {
		stock = cantidad; 
	}
	
	public int getStock() {
		return stock;
	}
	
	public void decrementarStock() {
		stock -= 1;
	}


}