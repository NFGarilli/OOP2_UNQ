package bancoYPrestamos;

public class Personal extends SolicitudDeCredito {

	
	public Personal(Cliente cliente, float monto, float cuotas) {
		this.setCliente(cliente);
		this.setMonto(monto);
		this.setCuotas(cuotas);
		
	}
	
	@Override
	public boolean evaluarCredito() {
		return this.cumpleConIngresos() && this.esMontoValido();
	}
	
	@Override
	public boolean esMontoValido() {
		return this.montoCuotaMensual() < (this.getCliente().getSueldoNeto()*0.7);
	}

	public boolean cumpleConIngresos() {
		return this.getCliente().sueldoNetoAnual() >= 15000;
	}

}

