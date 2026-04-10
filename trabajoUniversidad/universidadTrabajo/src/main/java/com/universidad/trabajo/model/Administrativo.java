package com.universidad.trabajo.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Administrativo extends Persona implements Aprobador, Notificable, Autenticable {
    private String area;

    public Administrativo(String nombre, String correo, String area) {
        super(nombre, correo);
        this.area = area;
    }

    @Override
    public void aprobarSolicitud(String codigoSolicitud) {
        System.out.println("Administrativo en área " + area + " aprobando solicitud: " + codigoSolicitud);
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificación al administrativo " + getNombre() + ": " + mensaje);
    }

    @Override
    public boolean login(String usuario, String password) {
        return "admin".equals(usuario) && "1234".equals(password);
    }
}
