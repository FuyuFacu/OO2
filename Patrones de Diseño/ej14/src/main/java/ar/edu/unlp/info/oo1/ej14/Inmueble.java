package ar.edu.unlp.info.oo1.ej14;

public class Inmueble implements Prenda{
	private String direccion;
	private double superficie;
	private double costoPorM2;
	
	public Inmueble(String direccion, double superficie, double costoPorM2) {
		super();
		this.direccion = direccion;
		this.superficie = superficie;
		this.costoPorM2 = costoPorM2;
	}

	public double calcularValor() {
		return this.superficie * this.costoPorM2;
	}

	public double calcularValorPrendario() {
		return calcularValor() * 0.2;
	}

	
	public String getDireccion() {
		return this.direccion;
	}
}
