package com.predio.gesta.gesta_predio.model;

import java.io.Serializable;

public class Manutencoes implements Serializable {

    private String id, nome, data;

    public Manutencoes(String id) {
        this.id = id;
    }

    public Manutencoes(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Manutencoes{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
