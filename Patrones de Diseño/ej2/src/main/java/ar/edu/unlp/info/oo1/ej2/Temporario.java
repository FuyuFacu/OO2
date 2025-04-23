package ar.edu.unlp.info.oo1.ej2;

public class Temporario extends EmpleadoConFamilia {
	private int cantHorasTrabajadas;
	
	public Temporario(boolean casado, int cantHijos, boolean tieneHijos, int cantHorasTrabajadas) {
		super(casado, cantHijos, tieneHijos);
		this.cantHorasTrabajadas = cantHorasTrabajadas;
	}
	
	public double sueldoBasico() {
		return 20000 + this.cantHorasTrabajadas * 300;
		
	}
	public double calcularAdicionales() {
		double sueldo = 0;
		if (this.esCasado()) sueldo += 5000;
		if (this.TieneHijos()) sueldo += this.getCantHijos() * 2000;
		return sueldo;
		
	}
}
