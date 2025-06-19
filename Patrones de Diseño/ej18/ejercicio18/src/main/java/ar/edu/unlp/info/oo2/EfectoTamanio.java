package ar.edu.unlp.info.oo2;

public class EfectoTamanio extends EfectoFile {


    public EfectoTamanio(FileManager component) {
        super(component);
    }


    public String prettyPrint() {
        return super.prettyPrint() + " - " + super.getTamanio();
    }
}
