package ar.edu.unlp.info.oo1.ej6;

public class EstadoProvisorio implements IEstado{
	 
	public void inscribirse(Excursion excursion, Usuario usuario) {
		excursion.agregarAListaDeEspera(usuario);
		if (excursion.cupoMinimoAlcanzado()) {
			excursion.transicionarAInscriptos();
			excursion.setEstado(new EstadoDefinitivo());
		}
		
	}
	
	public String obtenerInformacion(Excursion excursion) {
		return excursion.imprimirInicioExcursion();
	}
	
	
}
