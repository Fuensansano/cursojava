package src;

import javax.swing.*;

public class EntradaNumeros {

	public static void main(String[] args) {
		
		/*double x = 10000.0;
		
		System.out.printf("%1.2f", x/3);*/
		
		String entryNumber = JOptionPane.showInputDialog("Introduce una cuantía");
		
		//Double entryNumber2 = Double.parseDouble(entryNumber);
		
		//System.out.print("La raiz de " + entryNumber2 + " es ");
		
		//System.out.print("La raiz de " + entryNumber + " es ");
		
		// System.out.printf("%1.2f", Math.sqrt(Double.parseDouble(entryNumber)));
		
		JOptionPane.showMessageDialog(null, "tu resultado es " + Math.sqrt(Double.parseDouble(entryNumber)));
		
		
	}

}
