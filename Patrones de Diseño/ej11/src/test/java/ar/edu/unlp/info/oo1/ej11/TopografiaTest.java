package ar.edu.unlp.info.oo1.ej11;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class TopografiaTest {

    private TopografiaAgua agua;
    private TopografiaTierra tierra;
    private TopografiaMixta mixtaSimple;
    private TopografiaMixta mixtaAnidada;

    @BeforeEach
    void setUp() {
        agua = new TopografiaAgua();
        tierra = new TopografiaTierra();
        mixtaSimple = new TopografiaMixta(List.of(agua, tierra, tierra, agua));
        mixtaAnidada = new TopografiaMixta(List.of(agua, tierra, tierra, mixtaSimple));
    }

    @Test
    void testProporcionAguaSimples() {
        assertEquals(1.0, agua.proporcionAgua());
        assertEquals(0.0, tierra.proporcionAgua());
    }

    @Test
    void testProporcionAguaMixtaSimple() {
        assertEquals(0.5, mixtaSimple.proporcionAgua(), 0.0001);
    }

    @Test
    void testProporcionAguaMixtaAnidada() {
        // (1 + 0 + 0 + 0.5) / 4 = 0.375
        assertEquals(0.375, mixtaAnidada.proporcionAgua(), 0.0001);
    }

    @Test
    void testIgualdadEntreAguas() {
        Topografia otraAgua = new TopografiaAgua();
        assertTrue(agua.equals(otraAgua));
    }

    @Test
    void testIgualdadEntreTierras() {
        Topografia otraTierra = new TopografiaTierra();
        assertTrue(tierra.equals(otraTierra));
    }

    @Test
    void testDesigualdadAguaTierra() {
        assertFalse(agua.equals(tierra));
    }

    @Test
    void testIgualdadEntreMixtas() {
        Topografia otraMixta = new TopografiaMixta(List.of(
                new TopografiaAgua(), new TopografiaTierra(), new TopografiaTierra(), new TopografiaAgua()
        ));
        assertTrue(mixtaSimple.equals(otraMixta));
    }

    @Test
    void testDesigualdadMixtasDistintoOrden() {
        Topografia distinta = new TopografiaMixta(List.of(
                new TopografiaTierra(), new TopografiaAgua(), new TopografiaAgua(), new TopografiaTierra()
        ));
        assertFalse(mixtaSimple.equals(distinta));
    }

    @Test
    void testDesigualdadMixtasDistintosComponentes() {
        Topografia distinta = new TopografiaMixta(List.of(
                new TopografiaAgua(), new TopografiaAgua(), new TopografiaTierra(), new TopografiaAgua()
        ));
        assertFalse(mixtaSimple.equals(distinta));
    }
}
