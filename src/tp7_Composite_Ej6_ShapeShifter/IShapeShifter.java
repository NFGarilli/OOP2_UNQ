package tp7_Composite_Ej6_ShapeShifter;

import java.util.List;

public interface IShapeShifter {
	
	public IShapeShifter compose(IShapeShifter iShapeShifter);
	public Integer deepest();
	public IShapeShifter flat();
	public List<Integer> values();
	public void agregarProfundidad(Integer profundidad, IShapeShifter iShapeShifter);
	public int getProfundidad();
	public void setProfundidad(int i);
	
}