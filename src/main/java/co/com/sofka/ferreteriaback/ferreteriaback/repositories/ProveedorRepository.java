package co.com.sofka.ferreteriaback.ferreteriaback.repositories;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Proveedor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProveedorRepository extends ReactiveMongoRepository<Proveedor, String> {

}
