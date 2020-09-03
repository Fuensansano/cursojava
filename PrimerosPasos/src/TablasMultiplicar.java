package src;

import javax.swing.JOptionPane;

public class TablasMultiplicar {
	
  public static void main(String[] args) {
	int desde = Integer.parseInt(JOptionPane.showInputDialog("introduce desde que tabla quieres que comience"));
	int hasta = Integer.parseInt(JOptionPane.showInputDialog("introduce hasta que tabla quieres que termine"));
		if( desde<hasta) {
			for (int i=desde; i<=hasta;i++) {
				System.out.println("Tabla de " + i);
				for(int j=0; j<=10;j++) {
		
					System.out.println(i + " x " +j + " = " + i*j);
		
				}
			}
		
		}else {
				JOptionPane.showMessageDialog(null, "El hasta no puede ser mayor que el desde, pringao");
	}
						
}

}


	
 
	

			
  

