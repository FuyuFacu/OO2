package org.example;

public interface IEstado {

    public void Aprobar(Projecto P);
    public void cancelarProjecto(Projecto P);
    public void actualizarMargenGanancia(Projecto P, int valor);

}
