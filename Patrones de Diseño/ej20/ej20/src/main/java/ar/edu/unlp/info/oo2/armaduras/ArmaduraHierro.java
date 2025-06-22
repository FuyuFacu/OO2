package ar.edu.unlp.info.oo2.armaduras;


import ar.edu.unlp.info.oo2.personaje.Personaje;

public class ArmaduraHierro implements Armadura {
    public void recibirDanioEspada(Personaje P) {
        P.decreaseHealth(5);
    }
    public void recibirDanioArco(Personaje P) {
        P.decreaseHealth(3);
    }
    public void recibirDanioBaston(Personaje P) {
        P.decreaseHealth(1);
    }

    public void recibirDanioMartillo(Personaje P) {
        P.decreaseHealth(7);
    }
}
