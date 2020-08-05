package src;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Entrada2 {

	public static void main(String[] args) {
		

		
		String edadTeclado = JOptionPane.showInputDialog("Escriba su edad");
		 
		int edad = Integer.parseInt(edadTeclado);
	
		if(edad >= 18) {
			JOptionPane.showMessageDialog(null,"Eres mayor de edad");
		} else {
			JOptionPane.showMessageDialog(null,"Eres menor de edad");

		}
		
	}

}
