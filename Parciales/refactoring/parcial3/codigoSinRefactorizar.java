public class Videojuego {
	// ...
	// 
	public Personaje personajeConMasDanio() {
		Personaje temp = null;
		double max = 0;

		for (Personaje p : personajes) {
			double danio = p.getTipoAtaque().calcularDanio(p.getDanio());

			if (danio > max) {
				temp = p;
				max = danio;
			}
		}

		return temp;
	}

	public void imprimirInfo(Personaje p) {
		System.out.println(p.getNombre() + "tiene como danio " + p.getDanio());
		if (p.getAtaque().getClass() == AtaqueHechizo.class) {
			System.out.println("Ataque tipo hechizo");
			System.out.println("Este ataque dobla tu fuerza");
		} else {
			System.out.println("Ataque tipo Ataque Basico");
			System.out.println("Este ataque matniene tu fuerza");
		}
	}



}


public class Personaje {
	private String nombre;
	private int daño;
	private TipoAtaque tipoAtaque;

	public TipoPersonaje(String nombre, int daño TipoAtaque tipoAtaque) {
		this.nombre = nombre;
		this.daño = daño;
		this.tipoAtaque = tipoAtaque;
	}

	public getTipoAtaque() {
		return tipoAtaque;
	}


}
