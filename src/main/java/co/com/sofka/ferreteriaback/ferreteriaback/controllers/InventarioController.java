package co.com.sofka.ferreteriaback.ferreteriaback.controllers;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Inventario;
import co.com.sofka.ferreteriaback.ferreteriaback.services.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class InventarioController {
    @Autowired
    private InventarioService service;

    @PostMapping("/inventarioProductos")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Inventario> save(@RequestBody Inventario inventario) {
        return this.service.save(inventario);
    }

    @DeleteMapping("/inventarioProductos/{id}")
    private Mono<ResponseEntity<Inventario>> delete(@PathVariable("id") String id) {
        return this.service.delete(id)
                .flatMap(inventario -> Mono.just(ResponseEntity.ok(inventario)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @PutMapping("/inventarioProductos/{id}")
    private Mono<ResponseEntity<Inventario>> update(@PathVariable("id") String id, @RequestBody Inventario inventario) {
        return this.service.update(id, inventario)
                .flatMap(inventario1 -> Mono.just(ResponseEntity.ok(inventario1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @GetMapping(value = "/inventarioProductos")
    private Flux<Inventario> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/inventarioProductos/{id}/findById")
    private Mono<Inventario> findById(@PathVariable("id") String id) {
        return this.service.findById(id);
    }
}
