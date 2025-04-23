package ar.edu.unlp.info.oo1.ej2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {

    @Test
    public void testSueldoPasante() {
        Pasante p = new Pasante(3); // 3 examenes rendidos
        assertEquals(20000, p.sueldoBasico());
        assertEquals(6000, p.calcularAdicionales());
        assertEquals(20000 + 6000 - (20000 * 0.13 + 6000 * 0.05), p.sueldo(), 0.01);
    }

    @Test
    public void testSueldoTemporarioSinFamilia() {
        Temporario t = new Temporario(false, 0, false, 10); // 10 horas
        assertEquals(20000 + 3000, t.sueldoBasico());
        assertEquals(0, t.calcularAdicionales());
        assertEquals(23000 - (23000 * 0.13 + 0), t.sueldo(), 0.01);
    }

    @Test
    public void testSueldoTemporarioConFamilia() {
        Temporario t = new Temporario(true, 2, true, 20); // esta casado con 2 hijos y 20 horas
        assertEquals(20000 + 6000, t.sueldoBasico());
        assertEquals(5000 + 4000, t.calcularAdicionales());
        double sueldoEsperado = 26000 + 9000 - (26000 * 0.13 + 9000 * 0.05);
        assertEquals(sueldoEsperado, t.sueldo(), 0.01);
    }

    @Test
    public void testSueldoPlantaConFamilia() {
        Planta p = new Planta(true, 1, true, 15, 3); // Casado con 1 hijo, 15 horas, 3 años antiguedad
        assertEquals(20000 + 4500, p.sueldoBasico());
        assertEquals(5000 + 2000 + 6000, p.calcularAdicionales());
        double sueldoEsperado = 24500 + 13000 - (24500 * 0.13 + 13000 * 0.05);
        assertEquals(sueldoEsperado, p.sueldo(), 0.01);
    }

    @Test
    public void testSueldoPlantaSinFamilia() {
        Planta p = new Planta(false, 0, false, 10, 5);
        assertEquals(20000 + 3000, p.sueldoBasico());
        assertEquals(0 + 0 + 10000, p.calcularAdicionales());
        double sueldoEsperado = 23000 + 10000 - (23000 * 0.13 + 10000 * 0.05);
        assertEquals(sueldoEsperado, p.sueldo(), 0.01);
    }
}
