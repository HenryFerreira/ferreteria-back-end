package co.com.sofka.ferreteriaback.ferreteriaback.controllers;

import co.com.sofka.ferreteriaback.ferreteriaback.models.Cliente;
import co.com.sofka.ferreteriaback.ferreteriaback.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class ClienteController {
    @Autowired
    private ClienteService service;

    @PostMapping("/cliente")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Cliente> save(@RequestBody Cliente cliente) {
        return this.service.save(cliente);
    }

    @DeleteMapping("/cliente/{id}")
    private Mono<ResponseEntity<Cliente>> delete(@PathVariable("id") String id) {
        return this.service.delete(id)
                .flatMap(cliente -> Mono.just(ResponseEntity.ok(cliente)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @PutMapping("/cliente/{id}")
    private Mono<ResponseEntity<Cliente>> update(@PathVariable("id") String id, @RequestBody Cliente cliente) {
        return this.service.update(id, cliente)
                .flatMap(cliente1 -> Mono.just(ResponseEntity.ok(cliente1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));

    }

    @GetMapping(value = "/cliente")
    private Flux<Cliente> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/cliente/{id}/findById")
    private Mono<Cliente> findByid(@PathVariable("id") String id) {
        return this.service.findById(id);
    }
}
