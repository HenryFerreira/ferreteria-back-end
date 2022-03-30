package co.com.sofka.ferreteriaback.ferreteriaback.services;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Factura;
import co.com.sofka.ferreteriaback.ferreteriaback.models.Proveedor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProveedorService {
    Mono<Proveedor> save(Proveedor proveedor);

    Mono<Proveedor> delete(String id);

    Mono<Proveedor> update(String id, Proveedor proveedor);

    Flux<Proveedor> findAll();

    Mono<Proveedor> findById(String id);
}
