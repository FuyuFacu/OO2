package org.example;

public class EstadoConfirmado implements IEstado {

	public void Aprobar(Projecto P) {}

    public void actualizarMargenGanancia(Projecto P, int valor) {}

    public void cancelarProjecto(Projecto P) {
        P.agregarTexto("(Cancelado)");
        P.setEstado(new EstadoCancelado());
    }

	
}