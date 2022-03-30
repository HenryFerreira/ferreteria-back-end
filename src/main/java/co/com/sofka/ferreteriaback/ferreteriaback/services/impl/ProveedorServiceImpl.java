package co.com.sofka.ferreteriaback.ferreteriaback.services.impl;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Factura;
import co.com.sofka.ferreteriaback.ferreteriaback.models.Proveedor;
import co.com.sofka.ferreteriaback.ferreteriaback.repositories.ProveedorRepository;
import co.com.sofka.ferreteriaback.ferreteriaback.services.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProveedorServiceImpl implements ProveedorService {
    @Autowired
    private ProveedorRepository repository;

    @Override
    public Mono<Proveedor> save(Proveedor proveedor) {
        return this.repository.save(proveedor);
    }

    @Override
    public Mono<Proveedor> delete(String id) {
        return this.repository
                .findById(id)
                .flatMap(p -> this.repository.deleteById(p.proveedorID()).thenReturn(p));
    }

    @Override
    public Mono<Proveedor> update(String id, Proveedor proveedor) {
        return this.repository.findById(id)
                .flatMap(proveedor1 -> {
                    proveedor.setProveedorID(id);
                    return save(proveedor);
                })
                .switchIfEmpty(Mono.empty());
    }

    @Override
    public Flux<Proveedor> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Mono<Proveedor> findById(String id) {
        return this.repository.findById(id);
    }
}
