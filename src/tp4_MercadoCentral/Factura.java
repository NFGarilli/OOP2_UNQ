package tp4MercadoCentral;

public class Factura implements IPrecio {
	
	private ICalculable wabbalabbadubdubb;
	
	public Factura(ICalculable wabbalabbadubdubb) {
		this.wabbalabbadubdubb = wabbalabbadubdubb;
	}
	
	public Double getPrecio() {
		return this.wabbalabbadubdubb.calcularMontoAPagar();
	}

	
	
	
	
	

}
