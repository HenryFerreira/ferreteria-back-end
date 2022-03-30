package co.com.sofka.ferreteriaback.ferreteriaback.services.impl;

import co.com.sofka.ferreteriaback.ferreteriaback.repositories.FacturaRepository;
import co.com.sofka.ferreteriaback.ferreteriaback.services.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaServiceImpl implements FacturaService {
    @Autowired
    private FacturaRepository repository;

}
