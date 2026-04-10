package com.universidad.trabajo.service;

import com.universidad.trabajo.model.Estudiante;
import com.universidad.trabajo.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository repository;

    public List<Estudiante> findAll() {
        return repository.findAll();
    }

    public Estudiante save(Estudiante estudiante) {
        return repository.save(estudiante);
    }

    public Optional<Estudiante> findById(Long id) {
        return repository.findById(id);
    }
}
