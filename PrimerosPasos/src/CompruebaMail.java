package src;

import javax.swing.JOptionPane;

public class CompruebaMail {

	public static void main(String[] args) {
		
		boolean arroba = false;
		
		String mail = JOptionPane.showInputDialog("Introduce tu mail");
		
		for(int i=0; i<mail.length(); i++) {
			if(mail.charAt(i)=='@'){
				arroba = true;
			}
		}
			if(arroba==true) {
			JOptionPane.showMessageDialog(null, "Es correcto el mail");
			}else{
		JOptionPane.showMessageDialog(null, "No es correcto el mail");
		
		}
	}
}
