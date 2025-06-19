package ar.edu.unlp.info.oo2;

public class EfectoPermisos extends EfectoFile {

    public EfectoPermisos(FileManager component) {
        super(component);
    }


    public String prettyPrint() {
        return super.prettyPrint() + " - " + super.getPermisos();
    }
}
