package ar.edu.unlp.info.oo1.ej5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

public class DecodificadorTest {

    private Decodificador deco;
    private Pelicula thor, rocky, capitanAmerica, ironMan, dunkirk, rambo;

    @BeforeEach
    void setUp() {
        deco = new Decodificador();

        thor = new Pelicula("Thor", new GregorianCalendar(2007, Calendar.JANUARY, 1).getTime(), 79);
        rocky = new Pelicula("Rocky", new GregorianCalendar(1976, Calendar.JANUARY, 1).getTime(), 81);
        capitanAmerica = new Pelicula("Capitan America", new GregorianCalendar(2016, Calendar.JANUARY, 1).getTime(), 78);
        ironMan = new Pelicula("Iron Man", new GregorianCalendar(2010, Calendar.JANUARY, 1).getTime(), 79);
        dunkirk = new Pelicula("Dunkirk", new GregorianCalendar(2017, Calendar.JANUARY, 1).getTime(), 79);
        rambo = new Pelicula("Rambo", new GregorianCalendar(1979, Calendar.JANUARY, 1).getTime(), 78);

        thor.addPeliculaSimilar(capitanAmerica);
        thor.addPeliculaSimilar(ironMan);
        rocky.addPeliculaSimilar(rambo);

        deco.addPeliculaGrilla(thor);
        deco.addPeliculaGrilla(rocky);
        deco.addPeliculaGrilla(capitanAmerica);
        deco.addPeliculaGrilla(ironMan);
        deco.addPeliculaGrilla(dunkirk);
        deco.addPeliculaGrilla(rambo);

        deco.addPeliculaReproducida(thor);
        deco.addPeliculaReproducida(rocky);
    }

    @Test
    void testSugerenciasPorSimilaridadYPuntaje() {
        // Paso 1: configurar por similaridad (ii)
        deco.setSugeridor(new Similaridad());
        List<Pelicula> sugerenciasSim = deco.obtenerSugerencias();

        // Verifico que tenga las 3 esperadas (Capitan America, Iron Man, Rambo) en orden correcto
        assertEquals(3, sugerenciasSim.size());
        assertTrue(sugerenciasSim.contains(capitanAmerica));
        assertTrue(sugerenciasSim.contains(ironMan));
        assertTrue(sugerenciasSim.contains(rambo));
        assertEquals(capitanAmerica, sugerenciasSim.get(0)); // Más reciente

        // Paso 2: configurar por puntaje (iii)
        deco.setSugeridor(new Puntaje());
        List<Pelicula> sugerenciasPuntaje = deco.obtenerSugerencias();

        // Verifico que tenga las 3 con mayor puntaje no vistas: Dunkirk, Iron Man, Capitan America
        assertEquals(3, sugerenciasPuntaje.size());
        assertEquals(dunkirk, sugerenciasPuntaje.get(0)); // 79 + más nueva
        assertEquals(ironMan, sugerenciasPuntaje.get(1)); // 79 + menos nueva
        assertEquals(capitanAmerica, sugerenciasPuntaje.get(2)); // 78
    }
}
