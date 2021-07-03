package tp7_Composite_Ej6_ShapeShifter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ShapeShifterCompuesto implements IShapeShifter {
	private List<IShapeShifter> listaDeFormas;
	
	
	public ShapeShifterCompuesto() {
		super();
		listaDeFormas = new ArrayList<IShapeShifter>();	
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
		this.listaDeFormas.add(unShapeShifter);
	}

/*	TODO ROTO ESTE ANDA A SABER
  @Override
	public int deepest() {
		AtomicInteger profundidad = new AtomicInteger(1);
		this.listaDeFormas.stream().forEach(e -> profundidad += e.deepest());
		return profundidad;
	}*/
	
	
/* TODO ROTO ESTO NO SE COMO HACERLO
	@Override
	public IShapeShifter flat() {
		// TODO Auto-generated method stub
		ShapeShifterCompuesto nuevoShapeShifterCompuesto = new ShapeShifterCompuesto();
		List<Integer> valores = this.values();
		this.listaDeFormas.stream().forEach(e -> nuevoShapeShifterCompuesto.agregarElemento()
		*/
		

	}

	@Override
	public List<Integer> values() {
		// TODO Auto-generated method stub
		return null;
	}

}
