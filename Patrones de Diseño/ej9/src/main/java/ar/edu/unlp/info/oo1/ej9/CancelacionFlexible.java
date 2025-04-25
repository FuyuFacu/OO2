package ar.edu.unlp.info.oo1.ej9;

import java.util.Date;

public class CancelacionFlexible implements PoliticaCancelacion{
	public double montoAreembolsar(Reserva reserva, Date fechaCancelacion) {
		return reserva.montoAPagar();
	}
}
