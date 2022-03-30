package co.com.sofka.ferreteriaback.ferreteriaback.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Document(collection = "volantes")
public class VolanteProveedor {
    @Id
    private String volanteProveedorID = UUID.randomUUID().toString().substring(0, 10);
    private String nombreProveedor;//Nombre del proveedor
    private List<Producto> productos;//Lista de productos a ingresar, con sus valores
    private Date fecha;//Fecha
    private String documentoIdentidadProveedor;//Documento de identificación del proveedor

    public String volanteProveedorID() {
        return volanteProveedorID;
    }

    public void setVolanteProveedorID(String volanteProveedorID) {
        this.volanteProveedorID = volanteProveedorID;
    }

    public String nombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public List<Producto> productos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Date fecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String documentoIdentidadProveedor() {
        return documentoIdentidadProveedor;
    }

    public void setDocumentoIdentidadProveedor(String documentoIdentidadProveedor) {
        this.documentoIdentidadProveedor = documentoIdentidadProveedor;
    }
}
