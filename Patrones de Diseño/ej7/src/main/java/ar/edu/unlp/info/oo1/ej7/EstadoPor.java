package ar.edu.unlp.info.oo1.ej7;

public class EstadoPor extends AbstractEstado{
	
	public void setValor(Calculadora contexto, double unValor) {
		contexto.setValorAcumulado(contexto.getValorAcumulado() * unValor);
		contexto.setEstado(new EstadoInicial());
	}
}
