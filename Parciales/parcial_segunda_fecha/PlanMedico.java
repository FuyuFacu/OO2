package ar.edu.unlp.info.oo2;

import java.time.temporal.ChronoUnit;

public class PlanMedico extends Plan {


    public double calcularMontoFijo() {
        return super.getMontoBase();
    }

    public double cargoFamiliar(int cantIntegrantes, double salario) {
        double total = super.getCargoFamiliar() * cantIntegrantes;
        double porcentajeSalario = getDescuento(salario, 1);

        return total + porcentajeSalario;

    }


    public double coberturaViajera(double salario, int cantIntegrantes) {
        double total = getDescuento(salario, 3);

        if (this.tieneCoseguro()) {
            double descuento = ChronoUnit.YEARS.between(super.getFechaContratacion(), this.getCoseguro().getFecha()) * 10000;
            total -= descuento;
        }

        return total;

    }
    public double seguroInternacion() {
        return getDescuento(calcularMontoFijo(), 5);
    }

}
