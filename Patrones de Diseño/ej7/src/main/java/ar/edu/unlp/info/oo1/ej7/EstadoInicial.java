package ar.edu.unlp.info.oo1.ej7;

public class EstadoInicial extends AbstractEstado{
	
	public String getResultado(Calculadora contexto) {
		return "Valor: " + contexto.getValorAcumulado();
	}
	
	public void mas(Calculadora contexto) {
		contexto.setEstado(new EstadoMas());
	}
	
	public void setValor(Calculadora contexto, double unValor) {
		contexto.setValorAcumulado(unValor);
	}
	
	public void menos(Calculadora contexto) {
		contexto.setEstado(new EstadoMenos());
	}
	
	public void por(Calculadora contexto) {
		contexto.setEstado(new EstadoPor());
	}
	
	public void dividido(Calculadora contexto) {
		contexto.setEstado(new EstadoDividido());
	}

	public void borrar(Calculadora c) {
		c.setValorAcumulado(0);		
	}

}
