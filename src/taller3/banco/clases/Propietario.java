package taller3.banco.clases;

public class Propietario {
	private String primerNombre;
	private String segundoNombre;
	private String PrimerApellido;
	private String segundoApellido;
	private String numeroCedula;
	private int edad;
	
	public Propietario(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			String numeroCedula, int edad) {
		super();
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		PrimerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.numeroCedula = numeroCedula;
		this.edad = edad;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return PrimerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		PrimerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getNumeroCedula() {
		return numeroCedula;
	}

	public void setNumeroCedula(String numeroCedula) {
		this.numeroCedula = numeroCedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}	
	
}
