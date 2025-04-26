package ar.edu.unlp.info.oo1.ej12;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileSystemTest {
    private FileSystem sistema;
    private Directorio raiz;
    private Archivo archivo1;
    private Archivo archivo2;
    private Directorio subdir;

    @BeforeEach
    void setUp() {
        raiz = new Directorio("root", new Date(), 0);
        archivo1 = new Archivo("file1.txt", new Date(), 100);
        archivo2 = new Archivo("file2.txt", new Date(), 200);
        subdir = new Directorio("subdir", new Date(), 0);

        subdir.agregarComponente(archivo1);
        raiz.agregarComponente(subdir);
        raiz.agregarComponente(archivo2);

        sistema = new FileSystem(raiz);
    }

    @Test
    void testTamanoTotalOcupado() {
        int esperado = 32 + 32 + 100 + 200; // 2 directorios + archivos
        assertEquals(esperado, sistema.tamanoTotalOcupado());
    }

    @Test
    void testArchivoMasGrande() {
        assertEquals(archivo2, sistema.archivoMasGrande());
    }

    @Test
    void testArchivoMasNuevo() {
        assertNotNull(sistema.archivoMasNuevo());
        assertTrue(sistema.archivoMasNuevo() instanceof Archivo);
    }

    @Test
    void testBuscarExistente() {
        assertEquals(subdir, sistema.buscar("subdir"));
        assertEquals(archivo1, sistema.buscar("file1.txt"));
    }

    @Test
    void testBuscarInexistente() {
        assertNull(sistema.buscar("noexiste.txt"));
    }

    @Test
    void testBuscarTodos() {
        List<FileSystemEntry> resultados = sistema.buscarTodos("file1.txt");
        assertEquals(1, resultados.size());
        assertEquals(archivo1, resultados.get(0));
    }

    @Test
    void testListadoDeContenido() {
        String contenido = sistema.listadoDeContenido();
        assertTrue(contenido.contains("/root"));
        assertTrue(contenido.contains("/root/subdir"));
        assertTrue(contenido.contains("/root/subdir/file1.txt"));
        assertTrue(contenido.contains("/root/file2.txt"));
    }
}
