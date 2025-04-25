package ar.edu.unlp.info.oo1.ej9;

import java.util.Date;

public class Reserva {
	private int cantidadDias;
	private Date fecha;
	private AutoEnAlquiler autoReserva;
	private Usuario conductor;
	
	
	public Reserva(int cantidadDias, Date fecha, AutoEnAlquiler autoReserva, Usuario conductor) {
		this.cantidadDias = cantidadDias;
		this.fecha = fecha;
		this.autoReserva = autoReserva;
		this.conductor = conductor;
	}


	public double montoAPagar() {
		return cantidadDias * autoReserva.getPrecioPorDia();
	}

	
	public double montoAReembolsar(Date fechaCancelacion) {
		return autoReserva.getCancelacion().montoAreembolsar(this, fechaCancelacion);
	}


	public Date getFecha() {
		return fecha;
	}


	public Usuario getConductor() {
		return conductor;
	}
	
	
	
}
