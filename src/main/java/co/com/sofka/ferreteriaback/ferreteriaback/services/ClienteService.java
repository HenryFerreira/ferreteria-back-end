package co.com.sofka.ferreteriaback.ferreteriaback.services;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Cliente;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClienteService {
    Mono<Cliente> save(Cliente cliente);

    Mono<Cliente> delete(String id);

    Mono<Cliente> update(String id, Cliente cliente);

    Flux<Cliente> findAll();

    Mono<Cliente> findById(String id);
}
