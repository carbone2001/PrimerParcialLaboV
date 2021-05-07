package com.example.primerparciallabov;

import java.io.Serializable;

public class UsuarioModel implements Serializable {
    private String nombre;
    private String tipoUsuario;
    private String contraseña;

    public UsuarioModel(String nombre, String tipoUsuario, String clave) {
        this.nombre = nombre;
        this.tipoUsuario = tipoUsuario;
        this.contraseña = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String clave) {
        this.contraseña = clave;
    }
}
