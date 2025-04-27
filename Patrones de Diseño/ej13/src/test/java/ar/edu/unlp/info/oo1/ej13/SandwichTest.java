package ar.edu.unlp.info.oo1.ej13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SandwichTest {
    private DirectorSandwich director;

    @BeforeEach
    public void setUp() {
        director = new DirectorSandwich();
    }

    @Test
    public void testSandwichClasico() {
        Sandwich clasico = director.construirClasico();
        assertEquals(500, clasico.calcularPrecio(), 0.01);
    }

    @Test
    public void testSandwichVegetariano() {
        Sandwich vegetariano = director.construirVegetariano();
        assertEquals(420, vegetariano.calcularPrecio(), 0.01);
    }

    @Test
    public void testSandwichVegano() {
        Sandwich vegano = director.construirVegano();
        assertEquals(620, vegano.calcularPrecio(), 0.01);
    }

    @Test
    public void testSandwichSinTacc() {
        Sandwich sinTacc = director.construirSinTacc();
        assertEquals(618, sinTacc.calcularPrecio(), 0.01);
    }
}
