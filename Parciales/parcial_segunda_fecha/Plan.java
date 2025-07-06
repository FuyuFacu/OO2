package ar.edu.unlp.info.oo2;

import java.time.LocalDate;
import java.util.Date;

public abstract class Plan extends TemplatePlan {
    private double montoBase;
    private double cargoFamiliar;
    private LocalDate fechaContratacion;
    private Coseguro coseguro;


    public void setCoseguro(Coseguro coseguro) {
        this.coseguro = coseguro;
    }

    public double getMontoBase() {
        return montoBase;
    }

    public double getCargoFamiliar() {
        return cargoFamiliar;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }


    public boolean tieneCoseguro() {
        return this.coseguro != null;
    }

    public Coseguro getCoseguro() {
        return coseguro;
    }

    public static double getDescuento(double muestra, int porcentaje) {
        return muestra * porcentaje / 100;
    }

    public abstract double calcularMontoFijo();
    public abstract double cargoFamiliar(int cantIntegrantes, double salario);
    public abstract double coberturaViajera(double salario, int cantIntegrantes);
    public abstract double seguroInternacion();

}
