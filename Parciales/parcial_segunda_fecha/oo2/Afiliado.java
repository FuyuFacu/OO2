package ar.edu.unlp.info.oo2;

import java.util.Date;

public class Afiliado {

    // Cada afiliado tiene un plan que puede ser cambiado
    // Algunos afiliados cuentan con coseguro, que otorga descuentos

    private String nombre;
    private int familiaresACargo;
    private double salario;
    private Date fechaNacimiento;
    private Coseguro coseguro;
    private Plan plan;

    public double calcularCostoMensual() {
        return plan.calcularCostoMensual(this.salario, this.familiaresACargo);
    }


    public void setPlan(Plan plan) {
        plan.setCoseguro(coseguro);
        this.plan = plan;

    }
}
