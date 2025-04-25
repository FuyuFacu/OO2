package ar.edu.unlp.info.oo1.ej6;

public class EstadoCompleto implements IEstado{
	
	public void inscribirse(Excursion excursion, Usuario usuario) {
		excursion.agregarAListaDeEspera(usuario);
	}
	
	public String obtenerInformacion(Excursion excursion) {
		return excursion.imprimirNormal();
	}
}
