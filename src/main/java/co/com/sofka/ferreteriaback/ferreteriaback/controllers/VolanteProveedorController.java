package co.com.sofka.ferreteriaback.ferreteriaback.controllers;

import co.com.sofka.ferreteriaback.ferreteriaback.models.VolanteProveedor;
import co.com.sofka.ferreteriaback.ferreteriaback.services.VolanteProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class VolanteProveedorController {
    @Autowired
    private VolanteProveedorService service;

    @PostMapping("/volante")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<VolanteProveedor> save(@RequestBody VolanteProveedor volanteProveedor) {
        return this.service.save(volanteProveedor);
    }

    @DeleteMapping("/volante/{id}")
    private Mono<ResponseEntity<VolanteProveedor>> delete(@PathVariable("id") String id) {
        return this.service.delete(id)
                .flatMap(volanteProveedor -> Mono.just(ResponseEntity.ok(volanteProveedor)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @PutMapping("/volante/{id}")
    private Mono<ResponseEntity<VolanteProveedor>> update(@PathVariable("id") String id, @RequestBody VolanteProveedor volanteProveedor) {
        return this.service.update(id, volanteProveedor)
                .flatMap(volanteProveedor1 -> Mono.just(ResponseEntity.ok(volanteProveedor1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @GetMapping(value = "/volante")
    private Flux<VolanteProveedor> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/volante/{id}/byId")
    private Mono<VolanteProveedor> findById(@PathVariable("id") String id) {
        return this.service.findById(id);
    }
}
