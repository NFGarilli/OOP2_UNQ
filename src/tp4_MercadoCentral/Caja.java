package tp4_MercadoCentral;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Caja {
	
	private List<IPrecio> listaDepreciables;
	private IAgencia agency;
	
	
	public Caja() {
		listaDepreciables = new ArrayList<IPrecio>();
		
	}
	
	
	public void registrarProducto(Producto unProducto) {
		
		listaDepreciables.add(unProducto);
		unProducto.decrementarStock();
		
	}
	
	public void registrarFactura(Factura factura) {
		
		listaDepreciables.add(factura);
		agency.registarPago(factura);
		
	}
	
	public Double getMonto() {
		
		return listaDepreciables.stream().collect(Collectors.summingDouble(p -> p.getPrecio()));
	}


	public Integer getCantidadDeProductos() {
		// TODO Auto-generated method stub
		return listaDepreciables.size();
	}
	
}