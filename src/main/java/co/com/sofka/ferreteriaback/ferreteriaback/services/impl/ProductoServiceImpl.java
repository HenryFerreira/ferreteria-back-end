package co.com.sofka.ferreteriaback.ferreteriaback.services.impl;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Factura;
import co.com.sofka.ferreteriaback.ferreteriaback.models.Producto;
import co.com.sofka.ferreteriaback.ferreteriaback.repositories.ProductoRepository;
import co.com.sofka.ferreteriaback.ferreteriaback.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository repository;

    @Override
    public Mono<Producto> save(Producto producto) {
        return this.repository.save(producto);
    }

    @Override
    public Mono<Producto> delete(String id) {
        return this.repository
                .findById(id)
                .flatMap(p -> this.repository.deleteById(p.getProductoID()).thenReturn(p));
    }

    @Override
    public Mono<Producto> update(String id, Producto producto) {
        return this.repository.findById(id)
                .flatMap(producto1 -> {
                    producto.setProductoID(id);
                    return save(producto);
                })
                .switchIfEmpty(Mono.empty());
    }

    @Override
    public Flux<Producto> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Mono<Producto> findById(String id) {
        return this.repository.findById(id);
    }

}
