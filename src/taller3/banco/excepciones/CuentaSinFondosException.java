package taller3.banco.excepciones;

public class CuentaSinFondosException extends Exception{
	public CuentaSinFondosException(String message) {
		super(message);
	}
}
