package tp5_Solid_BancoYPrestamos;

public abstract class SolicitudDeCredito {
	protected float monto;
	protected float cuotas;
	protected Cliente cliente;
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public float getMonto() {
		return monto;
	}
	
	public void setMonto(float monto) {
		this.monto = monto;
	}
	
	public float getCuotas() {
		return cuotas;
	}
	
	public void setCuotas(float cuotas) {
		this.cuotas = cuotas;
	}
	
	public float montoCuotaMensual() {
		return this.getMonto()/ this.getCuotas();
		
	}
	
	public abstract boolean evaluarCredito();
		
	
	public abstract boolean esMontoValido();
}
