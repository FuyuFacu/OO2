package org.example;

public class Persona {
	private String nombre;
	private double MontoFijo;

    public Persona(String nombre, double montoFijo) {
        this.nombre = nombre;
        MontoFijo = montoFijo;
    }

    public double getMontoFijo() {
        return MontoFijo;
    }
}