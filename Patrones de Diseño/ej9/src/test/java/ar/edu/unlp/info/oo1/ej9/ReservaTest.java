package ar.edu.unlp.info.oo1.ej9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class ReservaTest {

    @Test
    public void testReembolsoFlexible() {
        Usuario user = new Usuario("Carlos");
        AutoEnAlquiler auto = new AutoEnAlquiler(100, 4, "Toyota");
        auto.setCancelacion(new CancelacionFlexible());
        Reserva reserva = new Reserva(3, new Date(2025 - 1900, 4, 30), auto, user);

        double reembolso = reserva.montoAReembolsar(new Date(2025 - 1900, 4, 20)); // 10 días antes
        assertEquals(300, reembolso);
    }

    @Test
    public void testReembolsoModeradaTotal() {
        Usuario user = new Usuario("Laura");
        AutoEnAlquiler auto = new AutoEnAlquiler(150, 4, "Ford");
        auto.setCancelacion(new CancelacionModerada());
        Reserva reserva = new Reserva(2, new Date(2025 - 1900, 4, 30), auto, user);

        double reembolso = reserva.montoAReembolsar(new Date(2025 - 1900, 4, 20)); // 10 días antes
        assertEquals(300, reembolso);
    }

    @Test
    public void testReembolsoModeradaMitad() {
        Usuario user = new Usuario("Sofi");
        AutoEnAlquiler auto = new AutoEnAlquiler(200, 5, "Renault");
        auto.setCancelacion(new CancelacionModerada());
        Reserva reserva = new Reserva(1, new Date(2025 - 1900, 4, 30), auto, user);

        double reembolso = reserva.montoAReembolsar(new Date(2025 - 1900, 4, 28)); // 2 días antes
        assertEquals(100, reembolso);
    }

    @Test
    public void testReembolsoModeradaCero() {
        Usuario user = new Usuario("Ana");
        AutoEnAlquiler auto = new AutoEnAlquiler(200, 5, "Fiat");
        auto.setCancelacion(new CancelacionModerada());
        Reserva reserva = new Reserva(1, new Date(2025 - 1900, 4, 30), auto, user);

        double reembolso = reserva.montoAReembolsar(new Date(2025 - 1900, 4, 29)); // 1 día antes
        assertEquals(0.0, reembolso);
    }

    @Test
    public void testReembolsoEstricta() {
        Usuario user = new Usuario("Leo");
        AutoEnAlquiler auto = new AutoEnAlquiler(120, 4, "Chevrolet");
        auto.setCancelacion(new CancelacionEstricta());
        Reserva reserva = new Reserva(4, new Date(2025 - 1900, 4, 30), auto, user);

        double reembolso = reserva.montoAReembolsar(new Date(2025 - 1900, 4, 25));
        assertEquals(0.0, reembolso);
    }
}
