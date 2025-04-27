package ar.edu.unlp.info.oo1.ej14;

public class Automovil implements Prenda{
	private int cantAniosAntiguedad;
	private double costo0km;
	private String modelo;
	
	public Automovil(int cantAniosAntiguedad, double costo0km, String modelo) {
		super();
		this.cantAniosAntiguedad = cantAniosAntiguedad;
		this.costo0km = costo0km;
		this.modelo = modelo;
	}

	public double calcularValor() {
		return costo0km - (costo0km * 0.10 * cantAniosAntiguedad);
	}
	
	public double calcularValorPrendario() {
		return calcularValor() * 0.7;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
}
