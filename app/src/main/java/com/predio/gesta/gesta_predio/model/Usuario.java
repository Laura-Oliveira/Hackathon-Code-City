package com.predio.gesta.gesta_predio.model;


import java.io.Serializable;
import java.util.Objects;

public class Usuario implements Serializable {

    private String idUsuario, id;

    private String nome, email, senha;


    public Usuario() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(idUsuario, usuario.idUsuario) &&
                Objects.equals(id, usuario.id) &&
                Objects.equals(nome, usuario.nome) &&
                Objects.equals(email, usuario.email) &&
                Objects.equals(senha, usuario.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, id, nome, email, senha);
    }
}
