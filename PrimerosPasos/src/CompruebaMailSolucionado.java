	package src;
	
	import javax.swing.JOptionPane;
	
	public class CompruebaMailSolucionado {
	
		public static void main(String[] args) {
			String username = "";
			String dominio = "";
			int arroba = 0;
			boolean punto = false;
			boolean espacio = true;
			boolean coladominio= false;
			
			String mail = JOptionPane.showInputDialog("Introduce tu mail");
			
			for(int i=0; i<mail.length(); i++) {
				if(mail.charAt(i)=='@'){
					arroba++;
					for(int j=0; j<i; j++) {
						username += mail.charAt(j);
					}
					for(int z= i+1; z<mail.length(); z++) {
						dominio += mail.charAt(z);
						if(mail.charAt(z)=='.');{
							System.out.println(mail.charAt(z)=='.');
							coladominio =true;
						}
					}
					
				}	
				if(mail.charAt(i)==' ') {
					espacio = false;
				}
				
			}
				if(arroba==1 && coladominio==true && espacio==true) {
					JOptionPane.showMessageDialog(null, "Es correcto el mail");
					JOptionPane.showMessageDialog(null, "Your username: " + username +"\n" +"Your domain: " + dominio);
					//JOptionPane.showInternalMessageDialog(null, dominio);

				}else{
					JOptionPane.showMessageDialog(null, "No es correcto el mail");
			
			}
		}	
}
