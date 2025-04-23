package ar.edu.unlp.info.oo1.ej2;

public class Planta extends EmpleadoConFamilia{
	private int cantHorasTrabajadas;
    private int antiguedad;
	

	public Planta(boolean casado, int cantHijos, boolean tieneHijos, int cantHorasTrabajadas, int antiguedad) {
		super(casado, cantHijos, tieneHijos);
		this.cantHorasTrabajadas = cantHorasTrabajadas;
		this.antiguedad = antiguedad;
	}

	public double sueldoBasico() {
		return 20000 + this.cantHorasTrabajadas * 300;
	}

	public double calcularAdicionales() {
		double sueldo = 0;
		if (this.esCasado()) sueldo += 5000;
		if (this.TieneHijos()) sueldo += this.getCantHijos() * 2000;

		return sueldo += 2000 * antiguedad;
	}


}
