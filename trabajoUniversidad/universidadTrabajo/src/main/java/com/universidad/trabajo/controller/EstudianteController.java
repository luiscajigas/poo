package com.universidad.trabajo.controller;

import com.universidad.trabajo.model.Estudiante;
import com.universidad.trabajo.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService service;

    @GetMapping
    public List<Estudiante> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Estudiante create(@RequestBody Estudiante estudiante) {
        return service.save(estudiante);
    }
}
