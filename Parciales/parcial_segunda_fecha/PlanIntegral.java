package ar.edu.unlp.info.oo2;

public class PlanIntegral extends Plan {


    public double calcularMontoFijo() {
        return super.getMontoBase();
    }

    public double cargoFamiliar(int cantIntegrantes, double salario) {
        double cargoIntegrante = super.getCargoFamiliar();
        if (this.tieneCoseguro())
            cargoIntegrante -= getDescuento(salario, getCoseguro().getPorcentajeDescuento());

        return cargoIntegrante * cantIntegrantes;
    }



    public double coberturaViajera(double salario, int cantIntegrantes) {
        double porcentajeSalario = salario * 0.01;

        if (this.tieneCoseguro())
            porcentajeSalario =- this.getCoseguro().getMontoCoberturaViajes();

        return porcentajeSalario;

    }

    public double seguroInternacion() {
        return 0;
    }

}
