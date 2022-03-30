package co.com.sofka.ferreteriaback.ferreteriaback.controllers;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Producto;
import co.com.sofka.ferreteriaback.ferreteriaback.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "*")
public class ProductoController {
    @Autowired
    private ProductoService service;

    @PostMapping("/producto")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Producto> save(@RequestBody Producto producto) {
        return this.service.save(producto);
    }

    @DeleteMapping("/producto/{id}")
    private Mono<ResponseEntity<Producto>> delete(@PathVariable("id") String id) {
        return this.service.delete(id)
                .flatMap(producto -> Mono.just(ResponseEntity.ok(producto)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @PutMapping("/producto/{id}")
    private Mono<ResponseEntity<Producto>> update(@PathVariable("id") String id, @RequestBody Producto producto) {
        return this.service.update(id, producto)
                .flatMap(producto1 -> Mono.just(ResponseEntity.ok(producto1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @GetMapping(value = "/producto")
    private Flux<Producto> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/producto/{id}/byId")
    private Mono<Producto> findById(@PathVariable("id") String id) {
        return this.service.findById(id);
    }
}
