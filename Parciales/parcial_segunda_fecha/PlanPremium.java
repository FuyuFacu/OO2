package ar.edu.unlp.info.oo2;

public class PlanPremium extends Plan {


    public double calcularMontoFijo() {
        double total = this.getMontoBase();
        if (this.tieneCoseguro())
            total -= getDescuento(total, this.getCoseguro().getPorcentajeDescuento());

        return total;

    }
    public double cargoFamiliar(int cantIntegrantes, double salario) {
        double total = cantIntegrantes * 2800;
        double descuentoIntegrantesSuperior = 0;
        if (cantIntegrantes > 4) {
            descuentoIntegrantesSuperior = (cantIntegrantes - 4) * 2800;
        }
        return total - descuentoIntegrantesSuperior;
    }


    public double coberturaViajera(double salario, int cantIntegrantes) {
        double total = getDescuento(salario, 1);

        if (tieneCoseguro()) {
            total -= getDescuento(total, this.getCoseguro().getPorcentajeDescuento());
        }

        return total;

    }
    public double seguroInternacion() {
        return getDescuento(calcularMontoFijo(), 5);
    }
}
