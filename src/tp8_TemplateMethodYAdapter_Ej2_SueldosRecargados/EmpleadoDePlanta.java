package tp8_TemplateMethodYAdapter_Ej2_SueldosRecargados;

public class EmpleadoDePlanta extends Empleado {
	private int hijos;
	private float sueldoBasico = 3000;
	
	public EmpleadoDePlanta(int hijos) {
		super();
		this.hijos = hijos;
	}

	@Override
	public float sueldoBruto() {
		return this.getSueldoBasico() + this.extraPorCantidadDeHijos();
	}
	
	public float extraPorCantidadDeHijos() {
		return this.getHijos() * 150;
	}

	public int getHijos() {
		return hijos;
	}

	public void setHijos(int hijos) {
		this.hijos = hijos;
	}

	public float getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
}
