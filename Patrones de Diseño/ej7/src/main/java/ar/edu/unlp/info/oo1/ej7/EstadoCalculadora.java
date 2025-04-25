package ar.edu.unlp.info.oo1.ej7;

public interface EstadoCalculadora {
	
	public void setValor(Calculadora contexto, double Valor);
	public String getResultado(Calculadora contexto);
	public void mas(Calculadora contexto);
	public void menos(Calculadora contexto);
	public void por(Calculadora contexto);
	public void dividido(Calculadora contexto);
	public void borrar(Calculadora c);
}
