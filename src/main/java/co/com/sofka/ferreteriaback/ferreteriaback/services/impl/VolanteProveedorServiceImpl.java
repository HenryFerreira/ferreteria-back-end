package co.com.sofka.ferreteriaback.ferreteriaback.services.impl;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Factura;
import co.com.sofka.ferreteriaback.ferreteriaback.models.VolanteProveedor;
import co.com.sofka.ferreteriaback.ferreteriaback.repositories.VolanteProveedorRepository;
import co.com.sofka.ferreteriaback.ferreteriaback.services.VolanteProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class VolanteProveedorServiceImpl implements VolanteProveedorService {
    @Autowired
    private VolanteProveedorRepository repository;

    @Override
    public Mono<VolanteProveedor> save(VolanteProveedor volanteProveedor) {
        return this.repository.save(volanteProveedor);
    }

    @Override
    public Mono<VolanteProveedor> delete(String id) {
        return this.repository
                .findById(id)
                .flatMap(p -> this.repository.deleteById(p.getVolanteProveedorID()).thenReturn(p));
    }

    @Override
    public Mono<VolanteProveedor> update(String id, VolanteProveedor volanteProveedor) {
        return this.repository.findById(id)
                .flatMap(volanteProveedor1 -> {
                    volanteProveedor.setVolanteProveedorID(id);
                    return save(volanteProveedor);
                })
                .switchIfEmpty(Mono.empty());
    }

    @Override
    public Flux<VolanteProveedor> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Mono<VolanteProveedor> findById(String id) {
        return this.repository.findById(id);
    }
}
