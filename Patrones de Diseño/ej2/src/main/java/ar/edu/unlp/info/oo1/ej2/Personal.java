package ar.edu.unlp.info.oo1.ej2;

public abstract class Personal {

    public double sueldo() {
        return this.sueldoBasico() + this.calcularAdicionales() - this.calcularDescuento();
    }

    public double calcularDescuento() {
        return this.sueldoBasico() * 0.13 
        + this.calcularAdicionales() * 0.05;
    }


    public abstract double sueldoBasico();
    public abstract double calcularAdicionales();


}
