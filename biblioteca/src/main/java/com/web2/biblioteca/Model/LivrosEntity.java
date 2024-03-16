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

    public LivrosEntity() {
    }

    public Integer getLivro_id() {
        return livro_id;
    }

    public void setLivro_id(Integer livro_id) {
        this.livro_id = livro_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAno_publicacao() {
        return ano_publicacao;
    }

    public void setAno_publicacao(Integer ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }
}
