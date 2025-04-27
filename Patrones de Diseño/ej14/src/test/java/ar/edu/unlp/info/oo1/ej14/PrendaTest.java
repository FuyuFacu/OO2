package ar.edu.unlp.info.oo1.ej14;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrendaTest {

    private Automovil auto;
    private Inmueble inmueble;
    private Alquiler alquiler;
    private Mixta mixto;
    private LocalDate hoy;

    @BeforeEach
    void setUp() {
        // Fecha base para pruebas de Alquiler
        hoy = LocalDate.now();

        // Automóvil de 2 años, costo 1_000_000
        auto = new Automovil(2, 1_000_000, "Modelo A");

        // Inmueble de 100 m2 a 2000 $/m2
        inmueble = new Inmueble("Calle Falsa 123", 100, 2000);

        // Alquiler con fin de contrato a 5 meses desde hoy, costo mensual 50_000
        alquiler = new Alquiler(hoy, hoy.plusMonths(5), 50_000);

        // Prenda combinada vacía
        mixto = new Mixta();
    }

    @Test
    void testAutomovilValorBrutoYPrendario() {
        // Valor bruto = 1_000_000 - (1_000_000 * 0.1 * 2) = 800_000
        assertEquals(800_000, auto.calcularValor(), 0.01);

        // Valor prendario = 800_000 * 0.7 = 560_000
        assertEquals(560_000, auto.calcularValorPrendario(), 0.01);

        // getModelo()
        assertEquals("Modelo A", auto.getModelo());
    }

    @Test
    void testInmuebleValorBrutoYPrendario() {
        // Valor bruto = 100 * 2000 = 200_000
        assertEquals(200_000, inmueble.calcularValor(), 0.01);

        // Valor prendario = 200_000 * 0.2 = 40_000
        assertEquals(40_000, inmueble.calcularValorPrendario(), 0.01);

        // getDireccion()
        assertEquals("Calle Falsa 123", inmueble.getDireccion());
    }

    @Test
    void testAlquilerValorBrutoYPrendario() {
        // Valor bruto = 5 meses * 50_000 = 250_000
        assertEquals(250_000, alquiler.calcularValor(), 0.01);

        // Valor prendario = 250_000 * 0.9 = 225_000
        assertEquals(225_000, alquiler.calcularValorPrendario(), 0.01);
    }

    @Test
    void testMixtaVacia() {
        // Sin prendas, valor bruto y prendario deben ser 0
        assertEquals(0.0, mixto.calcularValor(), 0.01);
        assertEquals(0.0, mixto.calcularValorPrendario(), 0.01);
    }

    @Test
    void testMixtaConPrendas() {
        mixto.agregarPrenda(auto);
        mixto.agregarPrenda(inmueble);
        mixto.agregarPrenda(alquiler);

        // Suma de valores brutos: 800_000 + 200_000 + 250_000 = 1_250_000
        assertEquals(1_250_000, mixto.calcularValor(), 0.01);

        // Valor prendario mixto = 1_250_000 * 0.5 = 625_000
        assertEquals(625_000, mixto.calcularValorPrendario(), 0.01);
    }

    @Test
    void testMixtaIgnoraNulls() {
        mixto.agregarPrenda(auto);
        mixto.agregarPrenda(null);
        mixto.agregarPrenda(inmueble);

        // Debe sumar solo auto + inmueble = 800_000 + 200_000 = 1_000_000
        assertEquals(1_000_000, mixto.calcularValor(), 0.01);
    }
}
