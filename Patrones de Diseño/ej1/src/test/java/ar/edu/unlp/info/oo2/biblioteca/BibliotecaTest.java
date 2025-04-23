package ar.edu.unlp.info.oo2.biblioteca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

   @Test
    void bibliotecaArrancaConExporterNoNulo() {
        Biblioteca b = new Biblioteca();
        assertNotNull(b.getExporter());
    } 
  
   @Test
   void exportarSociosDevuelveAlgoConFormatoBasico() {
       Biblioteca b = new Biblioteca();
       b.agregarSocio(new Socio("Jon", "jon@nightwatch.com", "0002"));
       String out = b.exportarSocios();
       assertTrue(out.startsWith("["));        // la salida es un arreglo JSON
       assertTrue(out.contains("Jon"));        // contiene al socio agregado
   }
   
}