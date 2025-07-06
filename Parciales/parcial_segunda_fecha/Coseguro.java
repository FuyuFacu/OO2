package ar.edu.unlp.info.oo2;

import java.time.LocalDate;
import java.util.Date;

public class Coseguro {
    private String nombre;
    private LocalDate fecha;
    private int porcentajeDescuento;
    private double montoCoberturaViajes;

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public double getMontoCoberturaViajes() {
        return montoCoberturaViajes;
    }
}
