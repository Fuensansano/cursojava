package src;
public class Persona {
	
	private String nombre;
	private int edad;
	
	public Persona (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public void esMayorDeEdad() {
		if (this.edad >= 18) {
			System.out.println("La persona " + this.nombre + " Es mayor de edad");
		} else {
			System.out.println("La persona " + this.nombre + " Es MENOR de edad");
		}
	}

}
