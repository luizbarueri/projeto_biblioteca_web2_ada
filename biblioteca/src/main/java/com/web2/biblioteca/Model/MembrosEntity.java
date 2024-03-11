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
}

