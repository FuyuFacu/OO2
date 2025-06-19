package ar.edu.unlp.info.oo2;

public class EfectoFechaCreacion extends EfectoFile {

    public EfectoFechaCreacion(FileManager component) {
        super(component);
    }

    public String prettyPrint() {
        return super.prettyPrint() + " - " + super.getFechaModificacion();
    }
}
