package org.example;

public class EstadoEnEvaluacion implements IEstado {

    public void Aprobar(Projecto P) {
        P.setEstado(new EstadoConfirmado());
    }


    public void cancelarProjecto(Projecto P) {
        P.agregarTexto("(Cancelado)");
        P.setEstado(new EstadoCancelado());
    }

    public void actualizarMargenGanancia(Projecto P, int valor) {

        if (valor >= 11 && valor <= 15) {
            P.setMargenGanancia(valor);
        }
        

    }

}