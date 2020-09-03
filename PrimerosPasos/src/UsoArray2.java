	package src;
	
	import javax.swing.JOptionPane;
	
	public class UsoArray2 {
	
		public static void main(String[] args) {
			String [] paises = new String [8];
			String result = "";
			
			for(int i=0; i<paises.length; i++) {
				paises[i]= JOptionPane.showInputDialog("Introduce un país " + (i+1));
				result += paises[i] + "\n";
			}
			
			
			/*paises[0]= "España";
			paises[1]= "Suecia";
			paises[2]= "Francia";
			paises[3]= "Bélgica";
			paises[4]= "Ucrania";
			paises[5]= "Estonia";
			paises[6]= "Letonia";
			paises[7]= "Brasil";*/
		
		/*for(int i=0; i<paises.length;i++) {
			JOptionPane.showMessageDialog(null, "Pais " + ( i+1 ) + " " + paises[i]);
		}*/
			
			/*for(String pais:paises) {
				//System.out.println(elemento);
				result += pais + "\n";
			  }*/
			JOptionPane.showMessageDialog(null, result);

		}
	
	}
