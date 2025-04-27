package ar.edu.unlp.info.oo1.ej14;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class Alquiler implements Prenda{
	private LocalDate comienzoContrato;
	private LocalDate finContrato;
	private double costoMensual;
	
	public Alquiler(LocalDate comienzoContrato, LocalDate finContrato, double costoMensual) {
		super();
		this.comienzoContrato = comienzoContrato;
		this.finContrato = finContrato;
		this.costoMensual = costoMensual;
	}

	public double calcularValor() {
		return ChronoUnit.MONTHS.between(LocalDate.now(), finContrato) * costoMensual;
	}
	
	public double calcularValorPrendario() {
		return calcularValor() * 0.9;
	}
	
	
	
}
