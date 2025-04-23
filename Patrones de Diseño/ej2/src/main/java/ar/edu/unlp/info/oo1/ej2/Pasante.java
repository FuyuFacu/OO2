package ar.edu.unlp.info.oo1.ej2;

public class Pasante extends Personal{
	private int cantExamenesRendidos;
	
	public double sueldoBasico() {
		return 20000;
	}
	
	public Pasante (int cantExamenesRendidos) {
		this.cantExamenesRendidos = cantExamenesRendidos;
	}
	
	public double calcularAdicionales() {
		return this.cantExamenesRendidos * 2000;
	}
	
	


}
