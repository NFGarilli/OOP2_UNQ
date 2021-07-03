package tp7_Composite_Ej6_ShapeShifter;

import java.util.List;

public interface IShapeShifter {
	
	public IShapeShifter compose(IShapeShifter iShapeShifter);
	public int deepest();
	public IShapeShifter flat();
	public List<Integer> values();
	
}