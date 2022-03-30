package co.com.sofka.ferreteriaback.ferreteriaback.repositories;

import co.com.sofka.ferreteriaback.ferreteriaback.models.VolanteProveedor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface VolanteProveedorRepository extends ReactiveMongoRepository<VolanteProveedor, String> {

}
