package src;

public class arrays {

	public static void main(String[] args) {
		
		/*int [] mi_Array = new int [5];
		mi_Array[0]=8;
		mi_Array[1]=33;
		mi_Array[2]=16;
		mi_Array[3]=7;
		mi_Array[4]=1;*/
		
		int [] mi_matriz = {8,33,16,7,1,85,65,23,24,77,88,96,55,2,6};
 
		for(int i=0; i<mi_matriz.length;i++) {
			System.out.println("El valor de índice " + i + " es " + mi_matriz[i]);
		}
 	}

}
