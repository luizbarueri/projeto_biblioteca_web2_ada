package com.web2.biblioteca.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="emprestimos")
public class EmprestimosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer emprestimo_id;
    private LocalDateTime data_emprestimo;
    private LocalDateTime data_vencimento;
    private LocalDateTime data_devolucao;
    private Double multa;

    @OneToOne
    @JoinColumn(name="membro_id")
    private MembrosEntity membros;
    @OneToOne
    @JoinColumn(name = "livro_id")
    private LivrosEntity livros;
}
