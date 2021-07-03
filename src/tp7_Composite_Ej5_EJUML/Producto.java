package tp7_Composite_Ej5_EJUML;

public class Producto {
	
	private String nombre;
	private Double price;
	
	public Producto(String nombre, Double price) {
		super();
		this.nombre = nombre;
		this.price = price;
	}

	public Double getPrice() {
		return this.price;
	}
	
	public String getName() {
		return this.nombre;
	}
	
}
