package ar.edu.unlp.info.oo2;


public class Main {
    public static void main(String[] args) {

    FileManager archivo = new File002("Tesis", ".pdf", "20MB", "01/01/2024", "rw-r--r--", "17/09/2023");

    FileManager vista = new EfectoExtension(
                        new EfectoPermisos(
                        new EfectoTamanio(archivo)));

    System.out.println(vista.prettyPrint());
    // → "Tesis - 20MB - rw-r--r-- - .pdf"



    }
}