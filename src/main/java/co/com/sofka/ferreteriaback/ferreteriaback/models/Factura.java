package co.com.sofka.ferreteriaback.ferreteriaback.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Document(collection = "facturas")
public class Factura {
    @Id
    private String facturaID = UUID.randomUUID().toString().substring(0, 10); //Consecutivo de facturas
    private Date feche; //Fecha
    private String nombreCliente;//Nombre del cliente
    private String nombreAtendio;//Quien atendió al cliente
    private List<Producto> productos;//Lista de productos comprados  con sus precios individuales
    private Double precioTotal;//Total a pagar

    public String facturaID() {
        return facturaID;
    }

    public void setFacturaID(String facturaID) {
        this.facturaID = facturaID;
    }

    public Date feche() {
        return feche;
    }

    public void setFeche(Date feche) {
        this.feche = feche;
    }

    public String nombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String nombreAtendio() {
        return nombreAtendio;
    }

    public void setNombreAtendio(String nombreAtendio) {
        this.nombreAtendio = nombreAtendio;
    }

    public List<Producto> productos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Double precioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "facturaID='" + facturaID + '\'' +
                ", feche=" + feche +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", nombreAtendio='" + nombreAtendio + '\'' +
                ", productos=" + productos +
                ", precioTotal=" + precioTotal +
                '}';
    }
}
