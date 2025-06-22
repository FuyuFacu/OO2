package ar.edu.unlp.info.oo2.PatronBuilder;

import ar.edu.unlp.info.oo2.armaduras.ArmaduraCuero;
import ar.edu.unlp.info.oo2.armas.BastonDeMago;
import ar.edu.unlp.info.oo2.habilidades.CombateADistancia;
import ar.edu.unlp.info.oo2.habilidades.Magia;
import ar.edu.unlp.info.oo2.personaje.Personaje;

public class BuilderMago extends Builder {

    public BuilderMago(Personaje personaje) {
        super(personaje);
    }

    public void construirArmadura() {
        personaje.setArmadura(new ArmaduraCuero());
    }

    public void construirHabilidades() {
        personaje.agregarHabilidad(new Magia());
        personaje.agregarHabilidad(new CombateADistancia());

    }
    public void construirArma() {
        personaje.setArma(new BastonDeMago());

    }
}
