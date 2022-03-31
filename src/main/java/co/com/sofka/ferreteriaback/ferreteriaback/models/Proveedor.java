package co.com.sofka.ferreteriaback.ferreteriaback.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "proveedores")
public class Proveedor {
    @Id
    private String proveedorID = UUID.randomUUID().toString().substring(0, 10);
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

    @Override
    public String toString() {
        return "Proveedor{" +
                "proveedorID='" + proveedorID + '\'' +
                ", nombre='" + nombre + '\'' +
                ", celular='" + celular + '\'' +
                ", documentoIdentidad='" + documentoIdentidad + '\'' +
                '}';
    }
}
