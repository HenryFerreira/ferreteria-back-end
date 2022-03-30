package co.com.sofka.ferreteriaback.ferreteriaback.dto;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Producto;

import java.util.Date;
import java.util.List;

public class VolanteProveedorDTO {
    private String volanteProveedorID;
    private String nombreProveedor;//Nombre del proveedor
    private List<Producto> productos;//Lista de productos a ingresar, con sus valores
    private Date fecha;//Fecha
    private String documentoIdentidadProveedor;//Documento de identificación del proveedor

    public String getVolanteProveedorID() {
        return volanteProveedorID;
    }

    public void setVolanteProveedorID(String volanteProveedorID) {
        this.volanteProveedorID = volanteProveedorID;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDocumentoIdentidadProveedor() {
        return documentoIdentidadProveedor;
    }

    public void setDocumentoIdentidadProveedor(String documentoIdentidadProveedor) {
        this.documentoIdentidadProveedor = documentoIdentidadProveedor;
    }
}
