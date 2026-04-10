package com.universidad.trabajo.service;

import com.universidad.trabajo.model.Administrativo;
import com.universidad.trabajo.repository.AdministrativoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministrativoService {

    @Autowired
    private AdministrativoRepository repository;

    public List<Administrativo> findAll() {
        return repository.findAll();
    }

    public Administrativo save(Administrativo administrativo) {
        return repository.save(administrativo);
    }

    public void procesarSolicitud(Long id, String codigoSolicitud) {
        repository.findById(id).ifPresent(admin -> admin.aprobarSolicitud(codigoSolicitud));
    }
}
