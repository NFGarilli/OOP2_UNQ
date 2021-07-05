package tp7_Composite_Ej6_ShapeShifter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pruebita {
	
	public static void main(String[] args) {
		
		ShapeShifterCompuesto shapeShifterCompuesto1 = new ShapeShifterCompuesto();
		ShapeShifterCompuesto shapeShifterCompuesto2 = new ShapeShifterCompuesto();
		ShapeShifterCompuesto shapeShifterCompuesto3 = new ShapeShifterCompuesto();
		ShapeShifterCompuesto shapeShifterCompuesto4 = new ShapeShifterCompuesto();

		ShapeShifterBasico shapeShifterBasico1	= new ShapeShifterBasico(1);
		ShapeShifterBasico shapeShifterBasico2 	= new ShapeShifterBasico(2);
		ShapeShifterBasico shapeShifterBasico3	= new ShapeShifterBasico(3);
		
		shapeShifterCompuesto1.agregarElemento(shapeShifterCompuesto2);
		shapeShifterCompuesto1.agregarElemento(shapeShifterCompuesto3);
		
		
		shapeShifterCompuesto2.agregarElemento(shapeShifterBasico1);		
		shapeShifterCompuesto2.agregarElemento(shapeShifterBasico2);	
		shapeShifterCompuesto2.agregarElemento(shapeShifterCompuesto4);
		
		shapeShifterCompuesto3.agregarElemento(shapeShifterBasico3);		
		shapeShifterCompuesto3.agregarElemento(shapeShifterBasico2);		
		
		System.out.println(shapeShifterCompuesto1.deepest());
		//System.out.println(shapeShifterCompuesto1.flat());
		
		
		//List<IShapeShifter> listaDeFormas;
		//List<Character> listaDeFormas = new ArrayList<Character>(Arrays.asList('a', 'b', 'c'));
		
		//Integer valorARetornar;
		
		//valorARetornar = listaDeFormas.stream().mapToInt(f -> f.deepest()).max().getAsInt();
		
		
		
	}

}
