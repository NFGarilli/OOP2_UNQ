package cuenta;


//Uso el extraer desde la super clase, cree el metodo puedeExtraer para encapsular. Tambien genere getters


public class CuentaCorriente extends CuentaBancaria{
	private Integer limiteDescubierto;
	
	public CuentaCorriente(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo, Integer limiteDescubierto) {
		super(historialDeMovimientos, notificador, saldo);
		this.limiteDescubierto = limiteDescubierto;
	}
	
	@Override
	public boolean puedeExtraer(Integer monto) {
		return this.getSaldo() + this.getLimiteDescubierto() >= monto;
	}

	public Integer getLimiteDescubierto() {
		return limiteDescubierto;
	}

	public void setLimiteDescubierto(Integer limiteDescubierto) {
		this.limiteDescubierto = limiteDescubierto;
	}

	
	
}
