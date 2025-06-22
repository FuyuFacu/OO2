package ar.edu.unlp.info.oo2.armaduras;

import ar.edu.unlp.info.oo2.personaje.Personaje;

public interface Armadura {
    public void recibirDanioEspada(Personaje P);
    public void recibirDanioArco(Personaje P);
    public void recibirDanioBaston(Personaje P);
    public void recibirDanioMartillo(Personaje P);
}
