package ar.edu.unlp.info.oo2;

public abstract class TemplatePlan {

    public double calcularCostoMensual(double salario, int cantIntegrantes) {
        return
                calcularMontoFijo() +
                cargoFamiliar(cantIntegrantes, salario) +
                coberturaViajera(salario, cantIntegrantes) +
                seguroInternacion();
    }

    public abstract double calcularMontoFijo();
    public abstract double cargoFamiliar(int cantIntegrantes, double salario);
    public abstract double coberturaViajera(double salario, int cantIntegrantes);
    public abstract double seguroInternacion();

}
