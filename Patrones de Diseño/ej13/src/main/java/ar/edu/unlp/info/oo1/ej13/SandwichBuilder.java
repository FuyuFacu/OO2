package ar.edu.unlp.info.oo1.ej13;

public class SandwichBuilder {
    private Sandwich sandwich;

    public SandwichBuilder() {
        this.sandwich = new Sandwich();
    }

    public SandwichBuilder agregarPan(String nombre, double precio) {
        sandwich.agregarIngrediente(new Ingrediente(nombre, precio));
        return this;
    }

    public SandwichBuilder agregarAderezo(String nombre, double precio) {
        sandwich.agregarIngrediente(new Ingrediente(nombre, precio));
        return this;
    }

    public SandwichBuilder agregarPrincipal(String nombre, double precio) {
        sandwich.agregarIngrediente(new Ingrediente(nombre, precio));
        return this;
    }

    public SandwichBuilder agregarAdicional(String nombre, double precio) {
        sandwich.agregarIngrediente(new Ingrediente(nombre, precio));
        return this;
    }

    public Sandwich build() {
        return sandwich;
    }
}
