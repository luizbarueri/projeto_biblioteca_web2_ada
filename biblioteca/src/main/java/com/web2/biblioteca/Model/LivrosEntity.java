package com.web2.biblioteca.Model;

import jakarta.persistence.*;

@Entity
@Table(name="livros")
public class LivrosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer livro_id;
    private String titulo;
    private String autor;
    private Integer ano_publicacao;


}
