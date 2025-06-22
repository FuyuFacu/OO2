package ar.edu.unlp.info.oo2.PatronBuilder;

import ar.edu.unlp.info.oo2.armaduras.ArmaduraAcero;
import ar.edu.unlp.info.oo2.armas.Espada;
import ar.edu.unlp.info.oo2.habilidades.CombateCuerpoACuerpo;
import ar.edu.unlp.info.oo2.personaje.Personaje;

public class BuilderGuerrero extends Builder {

    public BuilderGuerrero(Personaje personaje) {
        super(personaje);
    }

    public void construirArmadura() {
        personaje.setArmadura(new ArmaduraAcero());

    }

    public void construirHabilidades() {
        personaje.agregarHabilidad(new CombateCuerpoACuerpo());

    }

    public void construirArma() {
        personaje.setArma(new Espada());
    }


}
