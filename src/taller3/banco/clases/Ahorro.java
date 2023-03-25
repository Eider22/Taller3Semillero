package taller3.banco.clases;

import taller3.banco.excepciones.CuentaSinFondosException;

public class Ahorro extends Cuenta {
	private int numeroRetiros;
	private int numeroDepositos;

	public Ahorro(String numeroCuenta, double saldo, Propietario propietario) {
		super(numeroCuenta, saldo, propietario);
		this.numeroRetiros = 0;
		this.numeroDepositos = 0;
	}

	@Override
	public void depositar(double cantidad) {
		if (this.numeroDepositos < 2) {
			this.setSaldo(this.getSaldo() + cantidad * 0.005);
		}

		this.setSaldo(this.getSaldo() + cantidad);
		this.numeroDepositos ++;
	}

	@Override
	public void retirar(double cantidad) throws CuentaSinFondosException {
		if (this.getSaldo() < cantidad) {
			throw new CuentaSinFondosException("La cuenta no tiene fondos suficientes");
		}

		if (this.getNumeroRetiros() >= 3) {
			if (this.getSaldo() < cantidad * 1.01) {
				throw new CuentaSinFondosException("La cuenta no tiene fondos suficientes");
			}

			this.setSaldo(this.getSaldo() - cantidad * 0.01);
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

	public int getNumeroDepositos() {
		return numeroDepositos;
	}

	public void setNumeroDepositos(int numeroDepositos) {
		this.numeroDepositos = numeroDepositos;
	}

}
