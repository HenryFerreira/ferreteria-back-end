package co.com.sofka.ferreteriaback.ferreteriaback.repositories;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Inventario;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface InventarioRepository  extends ReactiveMongoRepository<Inventario, String> {

}
