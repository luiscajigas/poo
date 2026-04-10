package com.universidad.trabajo.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Estudiante extends Persona implements Notificable, Autenticable {
    private String codigo;

    public Estudiante(String nombre, String correo, String codigo) {
        super(nombre, correo);
        this.codigo = codigo;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificación al estudiante " + getNombre() + " (Código: " + codigo + "): " + mensaje);
    }

    @Override
    public boolean login(String usuario, String password) {
        return codigo.equals(usuario) && "pass123".equals(password);
    }
}
