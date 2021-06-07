package bancoYPrestamos;

public class Hipotecario extends SolicitudDeCredito {
	
	private Propiedad propiedad;
	
	public Propiedad getPropiedad() {
		return propiedad;
	}
	
	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}
	
	public Hipotecario(Cliente cliente, float monto, float cuotas, Propiedad propiedad) {
		this.setPropiedad(propiedad);
		this.setCliente(cliente);
		this.setMonto(monto);
		this.setCuotas(cuotas);
		
	}
	
	@Override
	public boolean evaluarCredito() {
		return esMontoValido()	&& this.tieneEdadValida();
	}
	
	@Override
	public boolean esMontoValido() {
		return this.montoCuotaMensual() < (this.getCliente().getSueldoNeto()*0.5) 
				&& this.getMonto() < (this.getPropiedad().getValorFiscal()*0.7);
	}
	
	public boolean tieneEdadValida() {
		return this.getCliente().getEdad() < 65;
	}
	
}


