package taller3.banco.clases;

import taller3.banco.excepciones.CuentaSinFondosException;
import taller3.banco.excepciones.MaximoRetirosException;

public class Corriente extends Cuenta {
	private int numeroRetiros;

	public Corriente(String numeroCuenta, double saldo, Propietario propietario) {
		super(numeroCuenta, saldo, propietario);
		this.numeroRetiros = 0;
	}

	@Override
	public void depositar(double cantidad) {
		this.setSaldo(this.getSaldo() + cantidad);
	}

	@Override
	public void retirar(double cantidad) throws MaximoRetirosException, CuentaSinFondosException {
		if (this.getSaldo() < cantidad) {
			throw new CuentaSinFondosException("La cuenta no tiene fondos suficientes");
		}

		if (this.getNumeroRetiros() == 5) {
			throw new MaximoRetirosException("Esta cuenta ya hizo el máximo de retiros posibles");
		}

		this.setSaldo(this.getSaldo() - cantidad);
		this.numeroRetiros ++;
	}

	public int getNumeroRetiros() {
		return numeroRetiros;
	}

	public void setNumeroRetiros(int numeroRetiros) {
		this.numeroRetiros = numeroRetiros;
	}
}
