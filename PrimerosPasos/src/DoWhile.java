package src;

import javax.swing.JOptionPane;

public class DoWhile {

	public static void main(String[] args) {

		/*
		 * int aleatorio = (int)(Math.random()*100); System.out.println(aleatorio);
		 * 
		 * //JOptionPane.showMessageDialog(null, "Este es el número aleatorio " +
		 * aleatorio);
		 * 
		 * int numero = 0;
		 * 
		 * int intentos = 0;
		 * 
		 * do { intentos++; numero =
		 * Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un número"));
		 * 
		 * if(aleatorio<numero) { JOptionPane.showMessageDialog(null,"Más bajo"); } else
		 * if(aleatorio>numero) { JOptionPane.showMessageDialog(null,"Más alto");
		 * 
		 * }
		 * 
		 * } while(numero!=aleatorio);
		 * JOptionPane.showMessageDialog(null,"Óle tu pelo, lo has conseguido en "+
		 * intentos + " intentos" );
		 */

		String genero = "";

		do {
			genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");
		} while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);

		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		int pesoideal = 0;

		if (genero.equalsIgnoreCase("H")) {
			pesoideal = altura - 105;
		} else if (genero.equalsIgnoreCase("M")) {
			pesoideal = altura - 105;
		}
		JOptionPane.showMessageDialog(null, "Tu peso ideal es " + pesoideal);
	}

}
