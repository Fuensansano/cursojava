package src;

import javax.swing.*;

public class Bucles {

	public static void main(String[] args) {
		// WHILE

		String clave = "Fuen";
		String pass = "";
		int intentos = 0;

		// equals compara si dos cadenas de texto son iugales
		while (clave.equals(pass) == false)

		{
			intentos++;
			pass = JOptionPane.showInputDialog("Introduzca su contraseña");

			if (clave.equals(pass) == false) {
				JOptionPane.showMessageDialog(null, "Contraseña incorrecta.Inténtalo de nuevo");
			}

		}
		JOptionPane.showInternalMessageDialog(null,
				"Contraseña correcta, lo has conseguido a los " + intentos + " intentos");
	}

}
