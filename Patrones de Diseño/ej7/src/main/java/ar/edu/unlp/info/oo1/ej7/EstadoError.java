package ar.edu.unlp.info.oo1.ej7;

public class EstadoError implements EstadoCalculadora{
	public void setValor(Calculadora contexto, double Valor) {}
	public String getResultado(Calculadora contexto) {
		return "error";
	}
	public void mas(Calculadora contexto) {}
	public void menos(Calculadora contexto) {}
	public void por(Calculadora contexto) {}
	public void dividido(Calculadora contexto) {}
	public void borrar(Calculadora c) {
		c.setEstado(new EstadoInicial());
		c.setValorAcumulado(0);
	}
}
