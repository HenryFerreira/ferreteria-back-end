package co.com.sofka.ferreteriaback.ferreteriaback.services;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Inventario;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface InventarioService {
    Mono<Inventario> save(Inventario inventario);

    Mono<Inventario> delete(String id);

    Mono<Inventario> update(String id, Inventario inventario);

    Flux<Inventario> findAll();

    Mono<Inventario> findById(String id);
}
