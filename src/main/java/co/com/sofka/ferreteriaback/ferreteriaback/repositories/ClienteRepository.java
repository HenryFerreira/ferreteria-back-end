package co.com.sofka.ferreteriaback.ferreteriaback.repositories;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Cliente;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ClienteRepository extends ReactiveMongoRepository<Cliente, String> {

}
