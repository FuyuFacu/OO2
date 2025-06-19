package ar.edu.unlp.info.oo2;

public class File002 implements FileManager{
    private String nombre;
    private String extension;
    private String tamanio;
    private String fechaModificacion;
    private String fechaCreacion;
    private String permisos;

    public File002(String nombre, String extension, String tamanio, String fechaModificacion, String permisos, String fechaCreacion) {
        this.nombre = nombre;
        this.extension = extension;
        this.tamanio = tamanio;
        this.fechaModificacion = fechaModificacion;
        this.permisos = permisos;
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public String getExtension() {
        return extension;
    }

    public String getTamanio() {
        return tamanio;
    }

    public String getFechaModificacion() {
        return fechaModificacion;
    }

    public String getPermisos() {
        return permisos;
    }

    public String prettyPrint() {
        return this.nombre;
    }


}
