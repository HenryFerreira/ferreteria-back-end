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
}