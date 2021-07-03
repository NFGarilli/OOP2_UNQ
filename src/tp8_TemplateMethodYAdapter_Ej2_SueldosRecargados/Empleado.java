package tp8_TemplateMethodYAdapter_Ej2_SueldosRecargados;

public abstract class Empleado {
	
	public abstract float sueldoBruto();
	
	public float sueldoNeto() {
		
		return (float) (this.sueldoBruto() - (this.sueldoBruto() * 0.13));
		
	}
	
}