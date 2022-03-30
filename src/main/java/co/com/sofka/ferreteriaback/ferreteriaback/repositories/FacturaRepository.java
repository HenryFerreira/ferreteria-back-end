package co.com.sofka.ferreteriaback.ferreteriaback.repositories;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Factura;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface FacturaRepository extends ReactiveMongoRepository<Factura, String> {

}
