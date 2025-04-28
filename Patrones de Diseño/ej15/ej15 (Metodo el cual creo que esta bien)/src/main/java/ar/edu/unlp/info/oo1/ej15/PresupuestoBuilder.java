package ar.edu.unlp.info.oo1.ej15;

import java.time.LocalDate;

public class PresupuestoBuilder {
	private String nombrePersona;
	private LocalDate fechaRealizacion;
	private Presupuesto presupuesto;
	
	public PresupuestoBuilder(String nombrePersona, LocalDate fechaRealizacion) {
		this.nombrePersona = nombrePersona;
		this.fechaRealizacion = LocalDate.now();
		this.presupuesto = new Presupuesto();
	}
	
	
	// Deberia hacer agregarComponente Simplemente en vez de agregarProcesador, agregarMemoriaRam y eso? total el catalogo
	//	Es quien se encarga de buscar los componentes de la pc, asi que no deberia dividirlos
	// Si hago eso seria muchisimo mas eficiente al tener que reutilizarlo porque simplemente daria agregar componente y dicho componente
	// se buscaria en el catalogo, entonces si quiero agregar monitores o perifericos simplemente daria a agregarComponente
	// buscarComponente(nombre) y entonces el builder no se sobrecarga de metodos

	public PresupuestoBuilder agregarComponente(Componente E) {
		presupuesto.agregarComponente(E);
		return this;
	}
	
	public Presupuesto build() {
		return this.presupuesto;
	}


	public String getNombrePersona() {
		return nombrePersona;
	}


	public LocalDate getFechaRealizacion() {
		return fechaRealizacion;
	}


	public Presupuesto getPresupuesto() {
		return presupuesto;
	}
	
	

}
