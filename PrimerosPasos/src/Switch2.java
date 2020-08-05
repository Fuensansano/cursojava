package src;

import javax.swing.JOptionPane;

public class Switch2 {

	public static void main(String[] args) {
		/* 
		 *  I could have use the Integer.parseInt to convert the output of the JOptionPane
		 *	into an Integer at the same line.
		 */
		String figura = JOptionPane.showInputDialog("Elige una figura \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
	
		int figuraEleccion = Integer.parseInt(figura);
		
		switch(figuraEleccion) {
			
			case 1:
				int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida del lado"));
				
				JOptionPane.showMessageDialog(null, "El area del cuadrado es "+ Math.pow(lado, 2));
				
				break;
			
			case 2:
				int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida de la base"));
				int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida de la altura"));
	
				
				JOptionPane.showMessageDialog(null, "El area del cuadrado es "+ (base*altura));
				
				break;
			
			case 3:
				int baseTriangulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida de la base"));
				int alturaTriangulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida de la altura"));
	
				JOptionPane.showMessageDialog(null, "El area del cuadrado es "+ ((baseTriangulo*alturaTriangulo)/2));
				
				break;
			
			case 4:
				double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce la medida del radio"));
				
				JOptionPane.showMessageDialog(null, "El area del círculo es "+ (Math.PI*(Math.pow(radio, 2))));
				
				break;
		
			default:
				JOptionPane.showMessageDialog(null, "La opción no es correcta");
				
				break;
		}
		
		
	}

}

