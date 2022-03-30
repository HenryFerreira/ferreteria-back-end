package co.com.sofka.ferreteriaback.ferreteriaback.services;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Cliente;
import co.com.sofka.ferreteriaback.ferreteriaback.models.Factura;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface FacturaService {
    Mono<Factura> save(Factura factura);

    Mono<Factura> delete(String id);

    Mono<Factura> update(String id, Factura factura);

    Flux<Factura> findAll();

    Mono<Factura> findById(String id);
}
