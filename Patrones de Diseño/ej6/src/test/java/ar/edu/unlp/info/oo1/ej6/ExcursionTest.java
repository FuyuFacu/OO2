package ar.edu.unlp.info.oo1.ej6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Calendar;

public class ExcursionTest {
    private Excursion excursion;
    private Usuario u1, u2, u3;

    @BeforeEach
    public void setUp() {
        Date inicio = crearFecha(2025, Calendar.JUNE, 1);
        Date fin    = crearFecha(2025, Calendar.JUNE, 3);

        excursion = new Excursion(
            "Dos dias en kayak bajando el Parana",
            inicio, fin,
            "Puerto de salida",
            15000,
            1,  // cupo mínimo
            2   // cupo máximo
        );

        u1 = new Usuario("Ana",   "ana@email.com",   "López");
        u2 = new Usuario("Bruno", "bruno@email.com", "Martínez");
        u3 = new Usuario("Carlos","carlos@email.com","Pérez");
    }

    private Date crearFecha(int anio, int mes, int dia) {
        Calendar cal = Calendar.getInstance();
        cal.set(anio, mes, dia);
        return cal.getTime();
    }

    @Test
    public void testPasaAEstadoDefinitivo() {
        excursion.inscribir(u1);
        assertTrue(excursion.getEstado() instanceof EstadoDefinitivo,
                   "Debe pasar a EstadoDefinitivo al alcanzar el mínimo");
    }

    @Test
    public void testPasaAEstadoCompleto() {
        excursion.inscribir(u1); // mínimo -> definitivo
        excursion.inscribir(u2); // máximo -> completo
        assertTrue(excursion.getEstado() instanceof EstadoCompleto,
                   "Debe pasar a EstadoCompleto al alcanzar el máximo");
    }

    @Test
    public void testEnEstadoCompletoSigueEnEspera() {
        excursion.inscribir(u1);
        excursion.inscribir(u2);  // lleno
        excursion.inscribir(u3);  // debería ir a espera
        // comprobamos que sigue en EstadoCompleto
        assertTrue(excursion.getEstado() instanceof EstadoCompleto);
        // y que la info que devuelve es sólo la básica (sin mails ni faltantes)
        String info = excursion.obtenerInformacion();
        assertFalse(info.contains("@"), "No debe listar e-mails en completo");
        assertFalse(info.toLowerCase().contains("faltan"), "No debe mostrar faltantes en completo");
    }

    @Test
    public void testMailsEnEstadoDefinitivo() {
        excursion.inscribir(u1);
        String info = excursion.obtenerInformacion();
        assertTrue(info.contains("ana@email.com"),
                   "En EstadoDefinitivo debe listar los e-mails de los inscriptos");
        assertTrue(info.toLowerCase().contains("faltan"),
                   "En EstadoDefinitivo debe indicar faltantes al cupo máximo");
    }
}
