package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Projecto {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String objetivo;
    private List<Persona> integrantes; // Quienes cobran un monto fijo por dia.
    private int margenGanancia; // ESTO ES UN PORCENTAJE LOL
    private IEstado estadoProjecto;

    // Durante el armado del proyecto tieneque pasar por
    // diferentes etapas -> construccion, evaluacion, confirmada


    // Este es el constructor, se inicializa el estado del proyecto es estadoconstruccion
    public Projecto(LocalDate fechaInicio, LocalDate fechaFin, String objetivo, int margenGanancia) {

        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.objetivo = objetivo;
        this.margenGanancia = margenGanancia;
        this.estadoProjecto = new EstadoEnConstruccion();
        this.integrantes = new ArrayList<>();

    }

    public void setEstado(IEstado estado) {
        this.estadoProjecto = estado;
    }

    public void aprobarProjecto() {
        this.estadoProjecto.Aprobar(this);
    }

    public void cancelarProjecto() {
        this.estadoProjecto.cancelarProjecto(this);
    } 


    public double getCostoProjecto() {

        long cantidadDias = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        double montoIntegrantes =  integrantes.stream()
                                    .mapToDouble(Persona::getMontoFijo)
                                    .sum();


        return montoIntegrantes * cantidadDias;
    }


    public double getPrecioProjecto() {
        double margen = (getCostoProjecto() * margenGanancia) / 100;
        return getCostoProjecto() - margen;
    }

    public void setMargenGanancia(int valor) {
        this.margenGanancia = valor;
    }


    public void modificarMargenGanancia(int valor) {
        this.estadoProjecto.actualizarMargenGanancia(this, valor);
    }



    public void agregarTexto(String mensaje) {
        this.objetivo += " " + mensaje;
    }

    public void agregarPersona(Persona P) {
        this.integrantes.add(P);
    }


}
