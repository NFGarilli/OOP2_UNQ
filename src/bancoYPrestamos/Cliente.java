package bancoYPrestamos;

public class Cliente {

	String nombre;
	String apellido;
	String direccion;
	int edad;
	float sueldoNeto;
	
		
	public Cliente(String nombre, String apellido, String direccion, int edad, float sueldoNeto) {
		this.nombre 	= nombre;
		this.apellido 	= apellido;
		this.direccion 	= direccion;
		this.edad 		= edad;
		this.sueldoNeto = sueldoNeto;
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public String getDireccion() {
		return direccion;
	}


	public int getEdad() {
		return edad;
	}

	
	public float getSueldoNeto() {
		return sueldoNeto;
	}

	public float sueldoNetoAnual() {
		return (this.getSueldoNeto() * 12);
	}
	
	public void pedirCreditoPersonal(Banco banco, float monto, float cuotas) {
		SolicitudDeCredito nuevaSolicitud = new Personal(this, monto, cuotas);
		SistemaInformaticoBancario.agregarNuevaSolicitudAlBanco(nuevaSolicitud, banco);
	}
	
	public void solicitarCreditoHipotecario(Banco banco, float monto, float cuotas, Propiedad propiedad) {
		SolicitudDeCredito nuevaSolicitud = new Hipotecario(this, monto, cuotas, propiedad);
		SistemaInformaticoBancario.agregarNuevaSolicitudAlBanco(nuevaSolicitud, banco);
	}
	
	
	
	public float recibirCredito(float monto) {
		return monto;
	}

}
