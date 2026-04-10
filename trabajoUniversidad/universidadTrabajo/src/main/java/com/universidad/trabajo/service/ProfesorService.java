package com.universidad.trabajo.service;

import com.universidad.trabajo.model.Estudiante;
import com.universidad.trabajo.model.Profesor;
import com.universidad.trabajo.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository repository;

    @Autowired
    private EstudianteService estudianteService;

    public List<Profesor> findAll() {
        return repository.findAll();
    }

    public Profesor save(Profesor profesor) {
        return repository.save(profesor);
    }

    public void evaluarEstudiante(Long profesorId, Long estudianteId, double nota) {
        repository.findById(profesorId).ifPresent(profesor -> {
            estudianteService.findById(estudianteId).ifPresent(estudiante -> {
                profesor.evaluar(estudiante, nota);
            });
        });
    }
}
