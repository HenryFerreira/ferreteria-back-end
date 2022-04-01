package co.com.sofka.ferreteriaback.ferreteriaback.services.impl;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Inventario;
import co.com.sofka.ferreteriaback.ferreteriaback.repositories.InventarioRepository;
import co.com.sofka.ferreteriaback.ferreteriaback.services.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class InventarioServiceImpl implements InventarioService {
    @Autowired
    private InventarioRepository repository;

    @Override
    public Mono<Inventario> save(Inventario inventario) {
        return this.repository.save(inventario);
    }

    @Override
    public Mono<Inventario> delete(String id) {
        return this.repository
                .findById(id)
                .flatMap(p -> this.repository.deleteById(p.getInventarioID()).thenReturn(p));
    }

    @Override
    public Mono<Inventario> update(String id, Inventario inventario) {
        return this.repository.findById(id)
                .flatMap(inventario1 -> {
                    inventario.setInventarioID(id);
                    return save(inventario);
                })
                .switchIfEmpty(Mono.empty());
    }

    @Override
    public Flux<Inventario> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Mono<Inventario> findById(String id) {
        return this.repository.findById(id);
    }

}
