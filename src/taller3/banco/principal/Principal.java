package taller3.banco.principal;

import javax.swing.JOptionPane;

import taller3.banco.clases.Ahorro;
import taller3.banco.clases.Corriente;
import taller3.banco.clases.Cuenta;
import taller3.banco.clases.Propietario;
import taller3.banco.excepciones.CuentaSinFondosException;
import taller3.banco.excepciones.MaximoRetirosException;

public class Principal {
	public static void main(String[] args) {
		Propietario propietario = new Propietario("John", "Eider", "Cardona", "Castrillón", "11111111111", 27);
		Propietario propietario2 = new Propietario("Samuel", "", "Marín", "", "22222222222", 27);

		Cuenta cuentaCorriente = new Corriente("5555555", 100000, propietario);
		Cuenta cuentaAhorros = new Ahorro("6666666", 100000, propietario2);

		try {
			System.out.println("--------------------Eider cuenta ahorros---------------");
			cuentaAhorros.retirar(10000);
			System.out.println("Saldo: " + cuentaAhorros.getSaldo());
			cuentaAhorros.retirar(10000);
			System.out.println("Saldo: " + cuentaAhorros.getSaldo());
			cuentaAhorros.retirar(10000);
			System.out.println("Saldo: " + cuentaAhorros.getSaldo());
			cuentaAhorros.retirar(3000);
			System.out.println("Saldo: " + cuentaAhorros.getSaldo());
			cuentaAhorros.retirar(3000);
			System.out.println("Saldo: " + cuentaAhorros.getSaldo());

			cuentaAhorros.depositar(5000);
			System.out.println("Saldo: " + cuentaAhorros.getSaldo());
			cuentaAhorros.depositar(5000);
			System.out.println("Saldo: " + cuentaAhorros.getSaldo());
			cuentaAhorros.depositar(5000);
			System.out.println("Saldo: " + cuentaAhorros.getSaldo());
			cuentaAhorros.depositar(5000);
			System.out.println("Saldo: " + cuentaAhorros.getSaldo());
			cuentaAhorros.depositar(5000);

			System.out.println("--------------------Samuel cuenta corriente---------------");
			cuentaCorriente.depositar(5000);
			System.out.println("Saldo: " + cuentaCorriente.getSaldo());
			cuentaCorriente.depositar(5000);
			System.out.println("Saldo: " + cuentaCorriente.getSaldo());
			cuentaCorriente.depositar(5000);
			System.out.println("Saldo: " + cuentaCorriente.getSaldo());

			cuentaCorriente.retirar(5000);
			System.out.println("Saldo: " + cuentaCorriente.getSaldo());
			cuentaCorriente.retirar(5000);
			System.out.println("Saldo: " + cuentaCorriente.getSaldo());
			cuentaCorriente.retirar(5000);
			System.out.println("Saldo: " + cuentaCorriente.getSaldo());
			cuentaCorriente.retirar(5000);
			System.out.println("Saldo: " + cuentaCorriente.getSaldo());
			cuentaCorriente.retirar(5000);
			System.out.println("Saldo: " + cuentaCorriente.getSaldo());
			cuentaCorriente.retirar(5000);
			System.out.println("Saldo: " + cuentaCorriente.getSaldo());

		} catch (CuentaSinFondosException e) {
			// System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (MaximoRetirosException e) {
			// System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}
}
