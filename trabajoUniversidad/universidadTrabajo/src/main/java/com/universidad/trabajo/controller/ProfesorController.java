package com.universidad.trabajo.controller;

import com.universidad.trabajo.model.Profesor;
import com.universidad.trabajo.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesores")
public class ProfesorController {

    @Autowired
    private ProfesorService service;

    @GetMapping
    public List<Profesor> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Profesor create(@RequestBody Profesor profesor) {
        return service.save(profesor);
    }

    @PostMapping("/{id}/evaluar/{estudianteId}")
    public void evaluar(@PathVariable Long id, @PathVariable Long estudianteId, @RequestParam double nota) {
        service.evaluarEstudiante(id, estudianteId, nota);
    }
}
