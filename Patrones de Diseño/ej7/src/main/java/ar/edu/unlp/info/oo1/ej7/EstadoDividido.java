package ar.edu.unlp.info.oo1.ej7;

public class EstadoDividido extends AbstractEstado{
	
	public void setValor(Calculadora contexto, double unValor) {
		if (unValor != 0) {
			contexto.setValorAcumulado(contexto.getValorAcumulado() / unValor);
			contexto.setEstado(new EstadoInicial());
		} else contexto.setEstado(new EstadoError());
		
	}
}
