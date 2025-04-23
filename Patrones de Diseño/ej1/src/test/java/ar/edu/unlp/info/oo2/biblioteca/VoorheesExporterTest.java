package ar.edu.unlp.info.oo2.biblioteca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class VoorheesExporterTest {

    @Test
    void devuelveCorchetesParaListaVacia() {
        VoorheesExporter exporter = new VoorheesExporter();
        String json = exporter.exportar(Collections.emptyList());
        assertEquals("[]", json);            
    }

    @Test
    void incluyeNombreDeUnSocio() {
        Socio s = new Socio("Arya", "arya@example.com", "0001");
        VoorheesExporter exporter = new VoorheesExporter();
        String json = exporter.exportar(Collections.singletonList(s));
        assertTrue(json.startsWith("["));       
        assertTrue(json.contains("Arya"));      
        assertTrue(json.endsWith("]"));         
    }

}