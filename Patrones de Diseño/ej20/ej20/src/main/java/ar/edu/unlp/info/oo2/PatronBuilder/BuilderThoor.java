package ar.edu.unlp.info.oo2.PatronBuilder;

import ar.edu.unlp.info.oo2.armaduras.ArmaduraHierro;
import ar.edu.unlp.info.oo2.armas.Martillo;
import ar.edu.unlp.info.oo2.habilidades.CombateADistancia;
import ar.edu.unlp.info.oo2.habilidades.LanzarRayos;
import ar.edu.unlp.info.oo2.personaje.Personaje;

public class BuilderThoor extends Builder {

    public BuilderThoor(Personaje personaje) {
        super(personaje);
    }

    public void construirArmadura() {
        personaje.setArmadura(new ArmaduraHierro());
    }

    public void construirHabilidades() {
        personaje.agregarHabilidad(new CombateADistancia());
        personaje.agregarHabilidad(new LanzarRayos());

    }
    public void construirArma() {
        personaje.setArma(new Martillo());

    }
}
