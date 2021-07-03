package tp8_TemplateMethodYAdapter_Ej5_AyudandoAlSoberano;

public class CajaDeAhorro extends CuentaBancaria {

	private int limite;

	public CajaDeAhorro(String titular, int limite) {
		super(titular);
		this.limite = limite;
	}

	@Override
	public boolean puedeExtraer(int monto) {
		return (this.getSaldo() >= monto && this.getLimite() >= monto);
	}

	public int getLimite() {
		return this.limite;
	}
}

