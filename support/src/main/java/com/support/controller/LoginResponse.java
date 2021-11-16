package com.support.controller;

import com.support.model.Usuario;

public class LoginResponse {

    private String status;
    private Usuario usuario;

    public LoginResponse(String status) {
        this.status = status;
    }

    public LoginResponse(String status, Usuario usuario) {
        this.status = status;
        this.usuario = usuario;
    }

    public String getStatus() {
        return status;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
