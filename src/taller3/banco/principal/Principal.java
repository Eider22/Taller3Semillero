package taller3.banco.principal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import taller3.banco.clases.Ahorro;
import taller3.banco.clases.Corriente;
import taller3.banco.clases.Cuenta;
import taller3.banco.clases.Propietario;
import taller3.banco.excepciones.CuentaSinFondosException;
import taller3.banco.excepciones.MaximoRetirosException;

public class Principal {
	public static void main(String[] args) throws CuentaSinFondosException, MaximoRetirosException {
		try {
			menu();
		} catch (CuentaSinFondosException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (MaximoRetirosException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

	public static void menu() throws CuentaSinFondosException, MaximoRetirosException {
		Propietario propietario = new Propietario("John", "Eider", "Cardona", "Castrillón", "11111111111", 27);
		Propietario propietario2 = new Propietario("Samuel", "", "Marín", "", "22222222222", 27);

		Cuenta cuentaCorriente = new Corriente("5555555", 100000, propietario);
		Cuenta cuentaAhorros = new Ahorro("6666666", 100000, propietario2);

		int option = -1;
		boolean isValidInput = false;
		do {
			String input = JOptionPane.showInputDialog(
					"Ingrese una opción" + "\n1- Cuenta de ahorro" + "\n2- Cuenta corriente" + "\n0-Salir");
			try {
				option = Integer.parseInt(input);
				isValidInput = true;
				switch (option) {
				case 0:
					break;
				case 1:
					menuCuenta(cuentaAhorros);
					isValidInput = false;
					break;
				case 2:
					menuCuenta(cuentaCorriente);
					isValidInput = false;
					break;
				default:
					JOptionPane.showMessageDialog(null, "'" + option + "' no es una opción válida");
					isValidInput = false;
				}
			} catch (NumberFormatException e) {
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Hasta pronto!");
					return;
				}
				JOptionPane.showMessageDialog(null, "'" + input + "' no es una entrada válida");
			}
		} while (!isValidInput && option != 0);

	}

	public static void menuCuenta(Cuenta cuenta) throws CuentaSinFondosException, MaximoRetirosException {
		int option = -1;
		boolean isValidInput = false;
		do {
			String input = JOptionPane
					.showInputDialog("Ingrese una opción" + "\n1- Depositar" + "\n2- Retirar" + "\n0- Atrás");
			try {
				option = Integer.parseInt(input);
				isValidInput = true;
				switch (option) {
				case 0:
					break;
				case 1:
					depositar(cuenta);
					isValidInput = false;
					break;
				case 2:
					retirar(cuenta);
					isValidInput = false;
					break;
				default:
					JOptionPane.showMessageDialog(null, "'" + option + "' no es una opción válida");
					isValidInput = false;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "'" + input + "' no es una entrada válida");
			}
		} while (!isValidInput && option != 0);
	}

	public static void retirar(Cuenta cuenta) throws CuentaSinFondosException, MaximoRetirosException {
		imprimirSaldo(cuenta);
		String input = JOptionPane.showInputDialog("Ingrese la cantidad a retirar");
		double cantidad = Double.parseDouble(input);
		cuenta.retirar(cantidad);
		System.out.println("Retiro: " + cantidad);
		imprimirSaldo(cuenta);
	}

	public static void depositar(Cuenta cuenta) throws CuentaSinFondosException, MaximoRetirosException {
		imprimirSaldo(cuenta);
		String input = JOptionPane.showInputDialog("Ingrese la cantidad a depositar");
		double cantidad = Double.parseDouble(input);
		cuenta.depositar(cantidad);
		System.out.println("deposito: " + cantidad);
		imprimirSaldo(cuenta);
	}

	public static void imprimirSaldo(Cuenta cuenta) {
		System.out.println("Saldo actual " + cuenta.getSaldo());
	}
}
