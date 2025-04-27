package ar.edu.unlp.info.oo1.ej13;

public class Ingrediente {
    private String nombre;
    private double precio;

    public Ingrediente(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " ($" + precio + ")";
    }
}
