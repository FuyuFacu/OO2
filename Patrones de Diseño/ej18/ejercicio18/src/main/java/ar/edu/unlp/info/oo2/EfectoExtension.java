package ar.edu.unlp.info.oo2;

public class EfectoExtension extends EfectoFile{

    public EfectoExtension(FileManager component) {
        super(component);
    }

    public String prettyPrint() {
        return super.prettyPrint() + " - " + super.getExtension();
    }
}
