package tp7_Composite_Ej6_ShapeShifter;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;



public class ShapeShifterBasico implements IShapeShifter {
	private Integer valor;
	
	
	public ShapeShifterBasico(Integer valor) {
		super();
		this.valor = valor;
	}

	@Override
	public IShapeShifter compose(IShapeShifter iShapeShifter) {
		ShapeShifterCompuesto nuevoShapeShifterCompuesto = new ShapeShifterCompuesto();
		nuevoShapeShifterCompuesto.agregarElemento(this);
		nuevoShapeShifterCompuesto.agregarElemento(iShapeShifter);
		return nuevoShapeShifterCompuesto;
	}

	@Override
	public Integer deepest() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public IShapeShifter getFlat() {
		// TODO Auto-generated method stub
		return this;
	}
	
	@Override
	public IShapeShifter flat() {
		// TODO Auto-generated method stub
		return this;
	}
	

	@Override
	public List<Integer> values() {
		List<Integer> valor = new ArrayList<Integer>(Arrays.asList(this.getValor()));
		return valor;	
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	@Override
	public void agregarProfundidad(Integer profundidad, IShapeShifter iShapeShifter) {
		// TODO Auto-generated method stub
		
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
