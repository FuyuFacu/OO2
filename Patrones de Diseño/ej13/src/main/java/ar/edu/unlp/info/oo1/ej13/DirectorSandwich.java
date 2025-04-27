package ar.edu.unlp.info.oo1.ej13;

public class DirectorSandwich {

    public Sandwich construirClasico() {
        return new SandwichBuilder()
                .agregarPan("Pan Brioche", 100)
                .agregarAderezo("Mayonesa", 20)
                .agregarPrincipal("Carne de Ternera", 300)
                .agregarAdicional("Tomate", 80)
                .build();
    }

    public Sandwich construirVegetariano() {
        return new SandwichBuilder()
                .agregarPan("Pan con Semillas", 120)
                .agregarPrincipal("Provoleta Grillada", 200)
                .agregarAdicional("Berenjenas al Escabeche", 100)
                .build();
    }

    public Sandwich construirVegano() {
        return new SandwichBuilder()
                .agregarPan("Pan Integral", 100)
                .agregarAderezo("Salsa Criolla", 20)
                .agregarPrincipal("Milanesa de Gírgolas", 500)
                .build();
    }

    public Sandwich construirSinTacc() {
        return new SandwichBuilder()
                .agregarPan("Pan de Chipá", 150)
                .agregarAderezo("Salsa Tártara", 18)
                .agregarPrincipal("Carne de Pollo", 250)
                .agregarAdicional("Verduras Grilladas", 200)
                .build();
    }
}
