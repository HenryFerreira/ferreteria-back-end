package co.com.sofka.ferreteriaback.ferreteriaback.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Document(collection = "inventarioProductos")
public class Inventario {
    @Id
    private String inventarioID = UUID.randomUUID().toString().substring(0, 10);
    private List<Producto> productos;
    private Long cantMaxima;
    private Long cantidad;
    private Long CantMinima;

    public Inventario() {
    }

    public Inventario(String inventarioID, List<Producto> productos, Long cantMaxima, Long cantidad, Long cantMinima) {
        this.inventarioID = inventarioID;
        this.productos = productos;
        this.cantMaxima = cantMaxima;
        this.cantidad = cantidad;
        CantMinima = cantMinima;
    }

    public String getInventarioID() {
        return inventarioID;
    }

    public void setInventarioID(String inventarioID) {
        this.inventarioID = inventarioID;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Long getCantMaxima() {
        return cantMaxima;
    }

    public void setCantMaxima(Long cantMaxima) {
        this.cantMaxima = cantMaxima;
    }

    public Long getCantMinima() {
        return CantMinima;
    }

    public void setCantMinima(Long cantMinima) {
        CantMinima = cantMinima;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }
}
