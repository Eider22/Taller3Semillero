package taller3.banco.clases;

import taller3.banco.excepciones.CuentaSinFondosException;
import taller3.banco.excepciones.MaximoRetirosException;

public abstract class Cuenta {
	private String numeroCuenta;
	private double saldo;
	private Propietario propietario;

	public Cuenta(String numeroCuenta, double saldo, Propietario propietario) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.propietario = propietario;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public abstract void depositar(double cantidad);

	public abstract void retirar(double cantidad) throws CuentaSinFondosException, MaximoRetirosException;

}
