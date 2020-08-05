package src;

import javax.swing.JOptionPane;

public class BucleFor {

	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		String result = "";
		
		for(int i=0; i<10; i++) {
			
//			if(i>9) {
//				result += nombre;
//			} else {
//				result += nombre +"\n";
//			}
			
			result += (i>9) ? nombre : nombre +"\n";
			//result = result + nombre +"\n";
		}
		
		JOptionPane.showMessageDialog(null,result);
		System.out.print(result);
	}
	
}
