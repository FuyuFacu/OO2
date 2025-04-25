package ar.edu.unlp.info.oo1.ej9;

import java.time.temporal.ChronoUnit;
import java.util.Date;

public class CancelacionModerada implements PoliticaCancelacion{
	
	public double montoAreembolsar(Reserva reserva, Date fechaCancelacion) {
		long cantDias = ChronoUnit.DAYS.between(fechaCancelacion.toInstant(), reserva.getFecha().toInstant());
		if (cantDias > 7) return reserva.montoAPagar(); 
		else if (cantDias >= 2) return reserva.montoAPagar() * 0.5; 
		else return 0.0; 
				
	}
}
