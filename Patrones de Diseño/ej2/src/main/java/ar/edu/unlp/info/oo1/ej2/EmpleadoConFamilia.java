package ar.edu.unlp.info.oo1.ej2;

public abstract class EmpleadoConFamilia extends Personal{
	private boolean casado;
	private int cantHijos;
	private boolean tieneHijos;
	
	public EmpleadoConFamilia(boolean casado, int cantHijos, boolean tieneHijos) {
		this.casado = casado;
		this.cantHijos = cantHijos;
		this.tieneHijos = tieneHijos;
	}

	public boolean esCasado() {
		return casado;
	}

	public int getCantHijos() {
		return cantHijos;
	}

	public boolean TieneHijos() {
		return tieneHijos;
	}
	
	
	
	
	
	
}
