package tp4MercadoCentral;

	
public class Caja {
	
	private Float montoTotal;
	
	
	
	public void registrarProducto(Producto unProducto) {
		
		Float precioDelProducto = unProducto.getPrecio();
		unProducto.decrementarStock();
		
		montoTotal += precioDelProducto;
	}
	
	public Float getMonto() {
		return(montoTotal);
	}
	
}