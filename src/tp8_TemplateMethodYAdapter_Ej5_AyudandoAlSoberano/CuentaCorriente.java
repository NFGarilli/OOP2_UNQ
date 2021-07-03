package tp8_TemplateMethodYAdapter_Ej5_AyudandoAlSoberano;

public class CuentaCorriente extends CuentaBancaria {

	private int descubierto;

	public CuentaCorriente(String titular, int descubierto) {
		super(titular);
		this.descubierto = descubierto;
	}

	@Override
	public boolean puedeExtraer(int monto) {
		return (this.getSaldo() + this.getDescubierto() >= monto);
	}
	
	public int getDescubierto() {
		return this.descubierto;
	}

}
