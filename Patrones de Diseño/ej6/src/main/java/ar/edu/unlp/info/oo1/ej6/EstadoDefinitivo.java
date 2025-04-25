package ar.edu.unlp.info.oo1.ej6;

public class EstadoDefinitivo implements IEstado{
	
	public void inscribirse(Excursion excursion, Usuario usuario) {
		excursion.agregarAListaInscriptos(usuario);
		if (excursion.cuposAgotados()) excursion.setEstado(new EstadoCompleto());
	}
	
	
	public String obtenerInformacion(Excursion excursion) {
		return excursion.imprimirProcesoExcursion();
	}
}
