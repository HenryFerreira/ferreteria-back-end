package co.com.sofka.ferreteriaback.ferreteriaback.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "clientes")
public class Cliente {
    @Id
    private String clienteID = UUID.randomUUID().toString().substring(0, 10);
    private String nombre;
    private String celular;
    private String documentoIdentidad;

    public Cliente() {
    }

    public Cliente(String clienteID, String nombre, String celular, String documentoIdentidad) {
        this.clienteID = clienteID;
        this.nombre = nombre;
        this.celular = celular;
        this.documentoIdentidad = documentoIdentidad;
    }


    public String clienteID() {
        return clienteID;
    }

    public void setClienteID(String clienteID) {
        this.clienteID = clienteID;
    }

    public String nombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String celular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String documentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "clienteID='" + clienteID + '\'' +
                ", nombre='" + nombre + '\'' +
                ", celular='" + celular + '\'' +
                ", documentoIdentidad='" + documentoIdentidad + '\'' +
                '}';
    }
}
