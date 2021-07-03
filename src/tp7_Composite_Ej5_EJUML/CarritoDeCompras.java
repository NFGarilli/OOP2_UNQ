package tp7_Composite_Ej5_EJUML;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
	List<Producto> listaDeProductos;
	
	public CarritoDeCompras() {
		super();
		this.listaDeProductos = new ArrayList<Producto>();
	}

	private void setProducto(Producto producto) {
		this.listaDeProductos.add(producto);
	}
	
	public List<Producto> getElements() {
		return this.listaDeProductos;
	}
	
	public Integer totalRounded() {
		return (int) Math.round(this.total());
	}
	
	public Double total(){	
		return this.listaDeProductos.stream().mapToDouble(p -> p.getPrice()).sum();
		
	}
	
	
}
