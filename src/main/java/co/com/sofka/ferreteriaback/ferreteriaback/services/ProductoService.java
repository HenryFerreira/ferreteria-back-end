package co.com.sofka.ferreteriaback.ferreteriaback.services;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductoService {
    Mono<Producto> save(Producto producto);

    Mono<Producto> delete(String id);

    Mono<Producto> update(String id, Producto producto);

    Flux<Producto> findAll();

    Mono<Producto> findById(String id);
}
