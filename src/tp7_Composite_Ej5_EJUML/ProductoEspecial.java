package tp7_Composite_Ej5_EJUML;

public class ProductoEspecial extends Producto {

	public ProductoEspecial(String nombre, Double price) {
		super(nombre, price);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Double getPrice() {
		return this.getPrice(); //aca lo implementaria con la logica que tenga el producto especial.
	}

}
