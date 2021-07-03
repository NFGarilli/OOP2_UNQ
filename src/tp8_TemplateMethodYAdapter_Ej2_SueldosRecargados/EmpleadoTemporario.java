package tp8_TemplateMethodYAdapter_Ej2_SueldosRecargados;

public class EmpleadoTemporario extends Empleado {

	private int horasTrabajadas;
	private boolean tieneHijos;
	private boolean estaCasado;
	private float sueldoBasico = 1000;
	
	public EmpleadoTemporario(int horasTrabajadas, boolean hijos, boolean casado) {
		super();
		this.horasTrabajadas = horasTrabajadas;
		this.tieneHijos = hijos;
		this.estaCasado = casado;
	}
	
	@Override
	public float sueldoBruto() {
		float sueldoBruto = this.getSueldoBasico() + (this.getHorasTrabajadas() * 5);
		sueldoBruto += this.extraPorHijosOCasado();
		return sueldoBruto;
	}
	
	public float extraPorHijosOCasado() {
		
		return (this.isTieneHijos() || (this.isCasado()) ? (float) 100 : (float) 0);
		
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public boolean isTieneHijos() {
		return tieneHijos;
	}
	
	public void setTieneHijos(boolean tieneHijos) {
		this.tieneHijos = tieneHijos;
	}
	
	public boolean isCasado() {
		return estaCasado;
	}
	
	public void setEstaCasado(boolean estaCasado) {
		this.estaCasado = estaCasado;
	}
	
	public float getSueldoBasico() {
		return sueldoBasico;
	}
	
	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

}
