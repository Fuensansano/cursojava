package src;

import java.util.*;

import javax.swing.JOptionPane;

public class Bucles2 {

	public static void main(String[] args) {
		// System.out.println(Math.random());

		int aleatorio = (int) (Math.random() * 100);
		System.out.println(aleatorio);

		// JOptionPane.showMessageDialog(null, "Este es el número aleatorio " +
		// aleatorio);

		int numero = 0;

		int intentos = 0;

		while (numero != aleatorio) {
			intentos++;
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número"));

			if (aleatorio < numero) {
				JOptionPane.showMessageDialog(null, "Más bajo");
			} else if (aleatorio > numero) {
				JOptionPane.showMessageDialog(null, "Más alto");

			} else {
				JOptionPane.showMessageDialog(null, "Óle tu pelo, lo has conseguido en " + intentos + " intentos");

			}

		}
	}

}