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
				.agregarComponente(buscarComponente("Procesador Basico"))
				.agregarComponente(buscarComponente("8 gb"))
				.agregarComponente(buscarComponente("HDD 500 GB"))
				.agregarComponente(buscarComponente("Gabinete Estandar"))
				.build();
	}

	public Presupuesto construirPcIntermedia(String nombre) {
		return new PresupuestoBuilder(nombre, LocalDate.now())
				.agregarComponente(buscarComponente("Procesador Intermedio"))
				.agregarComponente(buscarComponente("16 GB"))
				.agregarComponente(buscarComponente("SSD 500 GB"))
				.agregarComponente(buscarComponente("GTX 1650"))
				.agregarComponente(buscarComponente("Gabinete Intermedio"))
				.agregarComponente(buscarComponente("Fuente 800 w"))
				.build();
	}
	
	public Presupuesto construirPcGamer(String nombre) {	
		
		PresupuestoBuilder builder =  new PresupuestoBuilder(nombre, LocalDate.now());
				builder.agregarComponente(buscarComponente("Procesador Gamer"));
				builder.agregarComponente(buscarComponente("Pad Termico"));
				builder.agregarComponente(buscarComponente("Cooler"));
				builder.agregarComponente(buscarComponente("32 GB"));
				builder.agregarComponente(buscarComponente("32 GB"));
				builder.agregarComponente(buscarComponente("SSD 500 GB"));
				builder.agregarComponente(buscarComponente("RTX 4090"));
				builder.agregarComponente(buscarComponente("Gabinete Gamer"));
		
		// Creo presupuesto parcial para calcular consumo		
		Presupuesto presupuestoParcial = builder.build();		
		
		PresupuestoBuilder builderFinal = new PresupuestoBuilder(nombre, LocalDate.now());
		
		presupuestoParcial.getComponentes().forEach(builderFinal::agregarComponente);
		builderFinal.agregarComponente(buscarComponente("Fuente " + calcularConsumo(presupuestoParcial) + " w"));
		
		return builderFinal.build();
		
		
	}
	
	public int calcularConsumo(Presupuesto P) {
		return (int) Math.ceil(P.calcularConsumos() * 1.5);
	}
	
	
	
	public Componente buscarComponente(String nombre) {
		return this.catalogoComponentes.getComponente(nombre);
	}
}
