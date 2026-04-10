package com.universidad.trabajo.controller;

import com.universidad.trabajo.model.Administrativo;
import com.universidad.trabajo.service.AdministrativoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/administrativos")
public class AdministrativoController {

    @Autowired
    private AdministrativoService service;

    @GetMapping
    public List<Administrativo> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Administrativo create(@RequestBody Administrativo administrativo) {
        return service.save(administrativo);
    }

    @PostMapping("/{id}/aprobar")
    public void aprobar(@PathVariable Long id, @RequestParam String codigo) {
        service.procesarSolicitud(id, codigo);
    }
}
