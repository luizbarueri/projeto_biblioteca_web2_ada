package com.web2.biblioteca.Model;

import jakarta.persistence.*;

@Entity
@Table(name="membros")
public class MembrosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer membro_id;
    private String nome;
    private String contato;

    public Integer getMembro_id() {
        return membro_id;
    }

    public MembrosEntity() {
    }

    public void setMembro_id(Integer membro_id) {
        this.membro_id = membro_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}

