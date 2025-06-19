package ar.edu.unlp.info.oo2;

public class EfectoFechaModificacion extends EfectoFile {

    public EfectoFechaModificacion(FileManager component) {
        super(component);
    }

    public String prettyPrint() {
        return super.prettyPrint() + " - " + super.getFechaModificacion();
    }
}
