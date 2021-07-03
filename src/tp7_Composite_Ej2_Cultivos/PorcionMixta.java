package tp7_Composite_Ej2_Cultivos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PorcionMixta implements IPorcion {
	private List<IPorcion> porciones;
	
	public PorcionMixta(IPorcion p1, IPorcion p2, IPorcion p3, IPorcion p4) {
			super();
			this.porciones = new ArrayList<IPorcion>();
			this.setPorciones(p1, p2, p3, p4);
	}

	@Override
	public Double gananciaPorcion() {
		Double 	gananciaTotal = (this.porciones.stream().mapToDouble(p -> p.gananciaPorcion()).sum());
		Integer cantidadDePorciones =  porciones.size();
		
		return (gananciaTotal / cantidadDePorciones);
		
		//Return ((this.porciones.stream().mapToDouble(p -> p.gananciaPorcion()).sum()) / porciones.size());
		
		
	}


	public void setPorciones(IPorcion p1, IPorcion p2, IPorcion p3, IPorcion p4) {
		this.porciones = Arrays.asList(p1,p2,p3,p4);
	}

	
	
}