package com.universidad.trabajo.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Profesor extends Persona implements Notificable, Autenticable, Evaluador {
    private String especialidad;

    public Profesor(String nombre, String correo, String especialidad) {
        super(nombre, correo);
        this.especialidad = especialidad;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificación al profesor " + getNombre() + " (Especialidad: " + especialidad + "): " + mensaje);
    }

    @Override
    public boolean login(String usuario, String password) {
        return getCorreo().equals(usuario) && "prof123".equals(password);
    }

    @Override
    public void evaluar(Estudiante estudiante, double nota) {
        System.out.println("Profesor de " + especialidad + " evaluando a " + estudiante.getNombre() + " con nota: " + nota);
    }
}
