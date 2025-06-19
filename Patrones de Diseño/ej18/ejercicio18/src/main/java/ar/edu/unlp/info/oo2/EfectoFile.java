package ar.edu.unlp.info.oo2;

public abstract class EfectoFile implements FileManager {
    private FileManager component;


    public EfectoFile(FileManager component) {
        this.component = component;
    }

    public String getNombre() {
        return component.getExtension();
    }
    public String getExtension() {
        return component.getExtension();
    }
    public String getTamanio() {
        return component.getTamanio();
    }
    public String getFechaModificacion() {
        return component.getFechaModificacion();
    }
    public String getPermisos() {
        return component.getPermisos();
    }

    public String getFechaCreacion() {
        return component.getFechaCreacion();
    }

    @Override
    public String prettyPrint() {
        return component.prettyPrint();
    }

}
