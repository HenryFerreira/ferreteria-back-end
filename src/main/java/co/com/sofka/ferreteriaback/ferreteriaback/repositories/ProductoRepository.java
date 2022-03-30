package co.com.sofka.ferreteriaback.ferreteriaback.repositories;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Producto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductoRepository extends ReactiveMongoRepository<Producto, String> {

}
