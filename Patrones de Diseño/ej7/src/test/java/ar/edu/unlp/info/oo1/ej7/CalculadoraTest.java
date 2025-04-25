package ar.edu.unlp.info.oo1.ej7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private Calculadora calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculadora();
    }

    @Test
    public void testOperacionCorrecta() {
        calc.setValor(5);
        calc.mas();
        calc.setValor(3);
        assertEquals("Valor: 8.0", calc.getResultado());
    }

    @Test
    public void testMultiplicacion() {
        calc.setValor(4);
        calc.por();
        calc.setValor(2);
        assertEquals("Valor: 8.0", calc.getResultado());
    }

    @Test
    public void testDivisionPorCero() {
        calc.setValor(10);
        calc.dividido();
        calc.setValor(0); // Error
        assertEquals("error", calc.getResultado());
    }

    @Test
    public void testUsoIncorrectoSinValor() {
        calc.setValor(5);
        calc.menos();
        calc.menos(); // operación sin setValor → error
        assertEquals("error", calc.getResultado());
    }

    @Test
    public void testRecuperarDeError() {
        calc.setValor(5);
        calc.menos();
        calc.menos(); // entra en error
        calc.borrar(); // vuelve a inicial
        assertEquals("Valor: 0.0", calc.getResultado());
    }
}
