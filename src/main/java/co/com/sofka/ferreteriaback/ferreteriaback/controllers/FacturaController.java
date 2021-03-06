package co.com.sofka.ferreteriaback.ferreteriaback.controllers;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Factura;
import co.com.sofka.ferreteriaback.ferreteriaback.services.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class FacturaController {
    @Autowired
    private FacturaService service;

    @PostMapping("/factura")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Factura> save(@RequestBody Factura factura) {
        return this.service.save(factura);
    }

    @DeleteMapping("/factura/{id}")
    private Mono<ResponseEntity<Factura>> delete(@PathVariable("id") String id) {
        return this.service.delete(id)
                .flatMap(factura -> Mono.just(ResponseEntity.ok(factura)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @PutMapping("/factura/{id}")
    private Mono<Factura> update(@PathVariable("id") String id, @RequestBody Factura factura) {
        return this.service.update(id, factura)
                .flatMap(factura1 -> Mono.just((factura1)))
                .switchIfEmpty(Mono.empty());
    }

    @GetMapping(value = "/factura")
    private Flux<Factura> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/factura/{id}/findById")
    private Mono<Factura> findByid(@PathVariable("id") String id) {
        return this.service.findById(id);
    }
}
