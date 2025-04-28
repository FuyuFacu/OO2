package ar.edu.unlp.info.oo1.ej15;

import java.time.LocalDate;

public class PresupuestoBuilder {
	private String nombrePersona;
	private LocalDate fechaRealizacion;
	private Presupuesto presupuesto;
	
	public PresupuestoBuilder(String nombrePersona, LocalDate fechaRealizacion) {
		this.nombrePersona = nombrePersona;
		this.fechaRealizacion = fechaRealizacion;
		this.presupuesto = new Presupuesto();
	}
	
	
	// Deberia hacer agregarComponente Simplemente en vez de agregarProcesador, agregarMemoriaRam y eso? total el catalogo
	//	Es quien se encarga de buscar los componentes de la pc, asi que no deberia dividirlos
	// Si hago eso seria muchisimo mas eficiente al tener que reutilizarlo porque simplemente daria agregar componente y dicho componente
	// se buscaria en el catalogo, entonces si quiero agregar monitores o perifericos simplemente daria a agregarComponente
	// buscarComponente(nombre) y entonces el builder no se sobrecarga de metodos

	public PresupuestoBuilder agregarProcesador(Componente E) {
		presupuesto.agregarComponente(E);
		return this;
	}
	
	public PresupuestoBuilder agregarMemoriaRam(Componente E) {
		presupuesto.agregarComponente(E);
		return this;
	}
	
	public PresupuestoBuilder agregarDisco(Componente E) {
		presupuesto.agregarComponente(E);
		return this;
	}
	
	public PresupuestoBuilder agregarTarjetaGrafica(Componente E) {
		presupuesto.agregarComponente(E);
		return this;
	}
	
	public PresupuestoBuilder agregarGabinete(Componente E) {
		presupuesto.agregarComponente(E);
		return this;
	}
	
	public PresupuestoBuilder agregarFuente(Componente E) {
		presupuesto.agregarComponente(E);
		return this;
	}
	
	public PresupuestoBuilder agregarPadTermino(Componente E) {
		presupuesto.agregarComponente(E);
		return this;
	}
	
	public PresupuestoBuilder agregarCooler(Componente E) {
		presupuesto.agregarComponente(E);
		return this;
	}
	
	public Presupuesto build() {
		return this.presupuesto;
	}
	

}
