package POO;

import javax.swing.JOptionPane;

public class UsoCoche {

	public static void main(String[] args) {
		
		/*coche Renault = new coche();   //INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE
		
		System.out.println(Renault.dimeLargo());
		
		//JOptionPane.showMessageDialog(null, "Este coche tiene " + Renault.largo + " ruedas ");*/
	
		coche MiCoche = new coche();
		
		MiCoche.estableceColor();
		System.out.println(MiCoche.dimeColor());
	}

}
