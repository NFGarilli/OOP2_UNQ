package tp7_Composite_Ej6_ShapeShifter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ShapeShifterCompuesto implements IShapeShifter {
	private List<IShapeShifter> listaDeFormas;
	private Integer profundidad;
	
	
	public ShapeShifterCompuesto() {
		super();
		listaDeFormas = new ArrayList<IShapeShifter>();	
		this.profundidad = 1;
		
	}

	@Override
	public IShapeShifter compose(IShapeShifter unShapeShifter) {
		ShapeShifterCompuesto nuevoShapeShifterCompuesto = new ShapeShifterCompuesto();
		nuevoShapeShifterCompuesto.agregarElemento(unShapeShifter);
		nuevoShapeShifterCompuesto.agregarElemento(this);
		return nuevoShapeShifterCompuesto;		
	}

	
	public void agregarElemento(IShapeShifter unShapeShifter) {
		// TODO Auto-generated method stub
		unShapeShifter.agregarProfundidad(this.profundidad, unShapeShifter);
		this.listaDeFormas.add(unShapeShifter);
	}
	
	public void agregarProfundidad(Integer profundidad, IShapeShifter unShapeShifter) {
		unShapeShifter.setProfundidad(unShapeShifter.getProfundidad() + 1); 
	}
	

  @Override
	public Integer deepest() {  
	  Integer profundidadMax;
	  	//List<Integer> listaDeProfundidades = listaDeFormas.stream().mapToInt(f -> f.deepest()).collect(Collectors.toList());
	  	
	  	List<Integer> listaDeProfundidades = new ArrayList<Integer>();
	  	
	  	for (IShapeShifter forma : this.listaDeFormas) {
	  		listaDeProfundidades.add(forma.deepest());
	  	}
	  	
	  	if (listaDeProfundidades.size() > 0) {
	  	profundidadMax = Collections.max(listaDeProfundidades);
	  	} else {
	  		profundidadMax = 0;
	  	}
		//valorARetornar = listaDeFormas.stream().mapToInt(f -> f.deepest()).max().getAsInt();
		
		
		if (profundidadMax > this.profundidad) {
		} else {
			profundidadMax = this.profundidad;
		}
		return profundidadMax;
  }
  
  

	public List<IShapeShifter> getListaDeFormas() {
	return listaDeFormas;
	}





	public void setProfundidad(Integer profundidad) {
	this.profundidad = profundidad;
}

	@Override
	public IShapeShifter flat() {
		
		this.listaDeFormas.stream().forEach(forma -> this.agregarElemento((forma.flat())));
		
		return this;
		
		
		//return this.listaDeFormas.stream().forEach(forma -> forma.values()).collect(Collectors.toList())) ++ this.listaDeFormas;
					
		//return this.listaDeFormas.stream().forEach(f -> f.flat());	
		
	}

	@Override
	public List<Integer> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getProfundidad() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setProfundidad(int i) {
		// TODO Auto-generated method stub
		
	}

}
