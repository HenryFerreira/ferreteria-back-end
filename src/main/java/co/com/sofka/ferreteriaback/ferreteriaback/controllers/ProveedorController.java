package co.com.sofka.ferreteriaback.ferreteriaback.controllers;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Proveedor;
import co.com.sofka.ferreteriaback.ferreteriaback.services.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class ProveedorController {
    @Autowired
    private ProveedorService service;

    @PostMapping("/proveedor")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Proveedor> save(@RequestBody Proveedor proveedor) {
        return this.service.save(proveedor);
    }

    @DeleteMapping("/proveedor/{id}")
    private Mono<ResponseEntity<Proveedor>> delete(@PathVariable("id") String id) {
        return this.service.delete(id)
                .flatMap(proveedor -> Mono.just(ResponseEntity.ok(proveedor)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @PutMapping("/proveedor/{id}")
    private Mono<Proveedor> update(@PathVariable("id") String id, @RequestBody Proveedor proveedor) {
        return this.service.update(id, proveedor)
                .flatMap(proveedor1 -> Mono.just((proveedor1)))
                .switchIfEmpty(Mono.empty());
    }

    @GetMapping(value = "/proveedor")
    private Flux<Proveedor> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/proveedor/{id}/findById")
    private Mono<Proveedor> findById(@PathVariable("id") String id) {
        return this.service.findById(id);
    }
}
