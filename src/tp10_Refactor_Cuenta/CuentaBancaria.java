package cuenta;

//Mucho codigo repetido en las subclases, puedo solucionar con template method en la superclase. Tambien puedo encapsular el codigo un poco mas para que quede mas legible (Lo ultimo en las subclases).
//Utilizo el extraer desde aca ya que es igual para ambos, cada subclase implementa puedeExtraer siguiendo su logica.
//Tambien genere getters y setters.

public abstract class CuentaBancaria {
	protected HistorialMovimientos historialDeMovimientos;
	protected Notificador notificador;
	protected int saldo;
	
	public CuentaBancaria(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super();
		this.historialDeMovimientos = historialDeMovimientos;
		this.notificador = notificador;
		this.saldo = saldo;
	}

	public int getSaldo() {
		return saldo;
	}
	
	public void extraer(Integer monto) {
			if(this.puedeExtraer(monto)) {
				this.setSaldo(this.getSaldo() - monto);
				this.getHistorialDeMovimientos().registrarMovimiento("Extraccion", monto);
				this.getNotificador().notificarNuevoSaldoACliente(this);
			}
		}

	protected abstract boolean puedeExtraer(Integer monto);

	public HistorialMovimientos getHistorialDeMovimientos() {
		return historialDeMovimientos;
	}

	public void setHistorialDeMovimientos(HistorialMovimientos historialDeMovimientos) {
		this.historialDeMovimientos = historialDeMovimientos;
	}

	public Notificador getNotificador() {
		return notificador;
	}

	public void setNotificador(Notificador notificador) {
		this.notificador = notificador;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	

	
}
