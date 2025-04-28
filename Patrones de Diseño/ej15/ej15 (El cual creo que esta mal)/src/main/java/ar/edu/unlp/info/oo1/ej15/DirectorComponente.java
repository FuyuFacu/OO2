package ar.edu.unlp.info.oo1.ej15;

import java.time.LocalDate;

public class DirectorComponente {
	public Catalogo catalogoComponentes;
	
// Deberia hacer agregarComponente Simplemente en vez de agregarProcesador, agregarMemoriaRam y eso? total el catalogo
//	Es quien se encarga de buscar los componentes de la pc, asi que no deberia dividirlos
// Si hago eso seria muchisimo mas eficiente al tener que reutilizarlo porque simplemente daria agregar componente y dicho componente
// se buscaria en el catalogo, entonces si quiero agregar monitores o perifericos simplemente daria a agregarComponente
// buscarComponente(nombre) y entonces el builder no se sobrecarga de metodos	
	
	
	public Presupuesto construirPcBasica(String nombre) {
		return new PresupuestoBuilder(nombre, LocalDate.now())
				.agregarProcesador(buscarComponente("Procesador Basico"))
				.agregarMemoriaRam(buscarComponente("8 gb"))
				.agregarDisco(buscarComponente("HDD 500 GB"))
				.agregarGabinete(buscarComponente("Gabinete Estandar"))
				.build();
	}

	public Presupuesto construirPcIntermedia(String nombre) {
		return new PresupuestoBuilder(nombre, LocalDate.now())
				.agregarProcesador(buscarComponente("Procesador Intermedio"))
				.agregarMemoriaRam(buscarComponente("16 GB"))
				.agregarDisco(buscarComponente("SSD 500 GB"))
				.agregarTarjetaGrafica(buscarComponente("GTX 1650"))
				.agregarGabinete(buscarComponente("Gabinete Intermedio"))
				.agregarFuente(buscarComponente("Fuente 800 w"))
				.build();
	}
	
	public Presupuesto construirPcGamer(String nombre) {	
		
		PresupuestoBuilder builder =  new PresupuestoBuilder(nombre, LocalDate.now());
				builder.agregarProcesador(buscarComponente("Procesador Gamer"));
				builder.agregarPadTermino(buscarComponente("Pad Termico"));
				builder.agregarCooler(buscarComponente("Cooler"));
				builder.agregarMemoriaRam(buscarComponente("32 GB"));
				builder.agregarMemoriaRam(buscarComponente("32 GB"));
				builder.agregarDisco(buscarComponente("SSD 500 GB"));
				builder.agregarTarjetaGrafica(buscarComponente("RTX 4090"));
				builder.agregarGabinete(buscarComponente("Gabinete Gamer"));
		
		// Creo presupuesto parcial para calcular consumo		
		Presupuesto presupuestoParcial = builder.build();		
		
		PresupuestoBuilder builderFinal = new PresupuestoBuilder(nombre, LocalDate.now());
		
		presupuestoParcial.getComponentes().forEach(builderFinal::agregarGabinete);
		builderFinal.agregarFuente(buscarComponente("Fuente " + calcularConsumo(presupuestoParcial) + " w"));
		
		return builderFinal.build();
		
		
	}
	
	public int calcularConsumo(Presupuesto P) {
		return (int) Math.ceil(P.calcularConsumos() * 1.5);
	}
	
	
	
	public Componente buscarComponente(String nombre) {
		return this.catalogoComponentes.getComponente(nombre);
	}
}
