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

    public EmprestimosEntity() {
    }

    public Integer getEmprestimo_id() {
        return emprestimo_id;
    }

    public void setEmprestimo_id(Integer emprestimo_id) {
        this.emprestimo_id = emprestimo_id;
    }

    public LocalDateTime getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(LocalDateTime data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public LocalDateTime getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(LocalDateTime data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public LocalDateTime getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(LocalDateTime data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public MembrosEntity getMembros() {
        return membros;
    }

    public void setMembros(MembrosEntity membros) {
        this.membros = membros;
    }

    public LivrosEntity getLivros() {
        return livros;
    }

    public void setLivros(LivrosEntity livros) {
        this.livros = livros;
    }
}
