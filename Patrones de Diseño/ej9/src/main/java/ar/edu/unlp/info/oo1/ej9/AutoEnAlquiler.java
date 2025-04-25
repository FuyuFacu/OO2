package ar.edu.unlp.info.oo1.ej9;



public class AutoEnAlquiler {
	private double precioPorDia;
	private int cantidadPlazas;
	private String marca;
	private PoliticaCancelacion cancelacion;
	
	public AutoEnAlquiler(double precioPorDia, int cantidadPlazas, String marca) {
		this.precioPorDia = precioPorDia;
		this.cantidadPlazas = cantidadPlazas;
		this.marca = marca;
	}
	
	public double getPrecioPorDia() {
		return precioPorDia;
	}
	
	public PoliticaCancelacion getCancelacion() {
		return cancelacion;
	}
	
	public void setCancelacion(PoliticaCancelacion cancelacion) {
		this.cancelacion = cancelacion;
	}

	public int getCantidadPlazas() {
		return cantidadPlazas;
	}

	public String getMarca() {
		return marca;
	}
	
	
	
	
	
}
