package ar.edu.unlp.info.oo1.ej13;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public double calcularPrecio() {
        return ingredientes.stream()
                .mapToDouble(Ingrediente::getPrecio)
                .sum();
    }

    @Override
    public String toString() {
        return "Sandwich: " + ingredientes.toString() + " - Precio total: $" + calcularPrecio();
    }
}
