package ar.edu.unlp.info.oo2.armas;

import ar.edu.unlp.info.oo2.personaje.Personaje;

public class Espada implements Arma {
    public void atacar(Personaje P) {
        P.getArmadura().recibirDanioEspada(P);
    }
}
