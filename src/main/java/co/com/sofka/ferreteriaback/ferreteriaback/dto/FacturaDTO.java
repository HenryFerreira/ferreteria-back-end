package co.com.sofka.ferreteriaback.ferreteriaback.dto;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Producto;

import java.util.Date;
import java.util.List;

public class FacturaDTO {
    private String facturaID;
    private Date feche; //Fecha
    private String nombreCliente;//Nombre del cliente
    private String nombreAtendio;//Quien atendió al cliente
    private List<Producto> productos;//Lista de productos comprados  con sus precios individuales
    private Double precioTotal;//Total a pagar

    public String getFacturaID() {
        return facturaID;
    }

    public void setFacturaID(String facturaID) {
        this.facturaID = facturaID;
    }

    public Date getFeche() {
        return feche;
    }

    public void setFeche(Date feche) {
        this.feche = feche;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreAtendio() {
        return nombreAtendio;
    }

    public void setNombreAtendio(String nombreAtendio) {
        this.nombreAtendio = nombreAtendio;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }
}
