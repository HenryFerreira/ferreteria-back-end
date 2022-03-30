package co.com.sofka.ferreteriaback.ferreteriaback.services.impl;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Cliente;
import co.com.sofka.ferreteriaback.ferreteriaback.models.Factura;
import co.com.sofka.ferreteriaback.ferreteriaback.repositories.FacturaRepository;
import co.com.sofka.ferreteriaback.ferreteriaback.services.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class FacturaServiceImpl implements FacturaService {
    @Autowired
    private FacturaRepository repository;

    @Override
    public Mono<Factura> save(Factura factura) {
        return this.repository.save(factura);
    }

    @Override
    public Mono<Factura> delete(String id) {
        return this.repository
                .findById(id)
                .flatMap(p -> this.repository.deleteById(p.facturaID()).thenReturn(p));
    }

    @Override
    public Mono<Factura> update(String id, Factura factura) {
        return this.repository.findById(id)
                .flatMap(factura1 -> {
                    factura.setFacturaID(id);
                    return save(factura);
                })
                .switchIfEmpty(Mono.empty());
    }

    @Override
    public Flux<Factura> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Mono<Factura> findById(String id) {
        return this.repository.findById(id);
    }

}
