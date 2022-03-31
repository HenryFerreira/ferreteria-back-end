package co.com.sofka.ferreteriaback.ferreteriaback.services.impl;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Cliente;
import co.com.sofka.ferreteriaback.ferreteriaback.repositories.ClienteRepository;
import co.com.sofka.ferreteriaback.ferreteriaback.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository repository;

    @Override
    public Mono<Cliente> save(Cliente cliente) {
        return this.repository.save(cliente);
    }

    @Override
    public Mono<Cliente> delete(String id) {
        return this.repository
                .findById(id)
                .flatMap(p -> this.repository.deleteById(p.getClienteID()).thenReturn(p));
    }

    @Override
    public Mono<Cliente> update(String id, Cliente cliente) {
        return this.repository.findById(id)
                .flatMap(cliente1 -> {
                    cliente.setClienteID(id);
                    return save(cliente);
                })
                .switchIfEmpty(Mono.empty());
    }

    @Override
    public Flux<Cliente> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Mono<Cliente> findById(String id) {
        return this.repository.findById(id);
    }
}
