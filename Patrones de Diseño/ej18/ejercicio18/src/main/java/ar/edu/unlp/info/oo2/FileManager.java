package ar.edu.unlp.info.oo2;

public interface FileManager {
    public String getNombre();
    public String getExtension();
    public String getTamanio();
    public String getFechaModificacion();
    public String getPermisos();
    public String getFechaCreacion();

    public String prettyPrint();

}
