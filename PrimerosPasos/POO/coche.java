package POO;

public class coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	String color;
	int pesoTotal;
	boolean  asientosCuero, climatizador;
	
	public coche() {
		
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso = 500;
		
		
	}
	
	public String dimeLargo() { //MÉTODO GETTER
		return "El largo del coche es " + largo;
	}
	
	public void estableceColor() { //MÉTODO SETTER
		color= "azul";
	}
	
	public String dimeColor() {
		return "El color del coche es " + color;
	}
	

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
