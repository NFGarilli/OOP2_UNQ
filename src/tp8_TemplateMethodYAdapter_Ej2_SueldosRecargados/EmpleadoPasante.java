package tp8_TemplateMethodYAdapter_Ej2_SueldosRecargados;

public class EmpleadoPasante extends Empleado {
	
	private int horasTrabajadas;
	
	public EmpleadoPasante(int horasTrabajadas) {
		super();
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	public float sueldoBruto() {
		return this.getHorasTrabajadas() * 40;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}


}
