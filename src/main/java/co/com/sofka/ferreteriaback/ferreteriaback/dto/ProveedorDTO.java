package co.com.sofka.ferreteriaback.ferreteriaback.dto;

public class ProveedorDTO {
    private String proveedorID;
    private String nombre;
    private String celular;
    private String documentoIdentidad;

    public String getProveedorID() {
        return proveedorID;
    }

    public void setProveedorID(String proveedorID) {
        this.proveedorID = proveedorID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }
}
