package org.example;

public class EstadoEnConstruccion implements IEstado {


    public void Aprobar(Projecto P) {

        if (P.getPrecioProjecto() == 0) 
            throw new RuntimeException("El precio debe ser mayor a 0");
        else 
            P.setEstado(new EstadoEnEvaluacion());

        
    }

    public void actualizarMargenGanancia(Projecto P, int valor) {
        // se actualiza el margen de ganancia si este mismo se encuentra entre el 8% y 10% 
        // del valor actual
        
        if (valor >= 8 && valor <= 10) {
            P.setMargenGanancia(valor);
        }

    }

    public void cancelarProjecto(Projecto P) {
        P.agregarTexto("(Cancelado)");
        P.setEstado(new EstadoCancelado());
    }

}