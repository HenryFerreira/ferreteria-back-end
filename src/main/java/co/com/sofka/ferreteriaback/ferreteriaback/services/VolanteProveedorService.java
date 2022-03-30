package co.com.sofka.ferreteriaback.ferreteriaback.services;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Factura;
import co.com.sofka.ferreteriaback.ferreteriaback.models.VolanteProveedor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public interface VolanteProveedorService {
    Mono<VolanteProveedor> save(VolanteProveedor volanteProveedor);

    Mono<VolanteProveedor> delete(String id);

    Mono<VolanteProveedor> update(String id, VolanteProveedor volanteProveedor);

    Flux<VolanteProveedor> findAll();

    Mono<VolanteProveedor> findById(String id);
}
