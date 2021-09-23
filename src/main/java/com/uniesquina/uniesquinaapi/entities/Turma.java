package com.uniesquina.uniesquinaapi.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_turma")
public class Turma implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigoTurma;
    private Date dataInicio;
    private Integer numeroVagas;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

    @ManyToMany
    @JoinTable(
            name = "tb_alunos_turma",
            joinColumns =
            @JoinColumn(name = "aluno_id", referencedColumnName = "id"),
            inverseJoinColumns =
            @JoinColumn(name = "turma_id", referencedColumnName = "id"))
    private Set<Aluno> alunos = new HashSet<>();


    @OneToMany(mappedBy = "turma")
    private Set<Avaliacao> avaliacoes = new HashSet<>();

    @OneToMany(mappedBy = "id.turma")
    private Set<Matricula> matriculas = new HashSet<>();

    public Turma() {
    }

    public Turma(Long id, String codigoTurma, Date dataInicio, Integer numeroVagas, Curso curso) {
        this.id = id;
        this.codigoTurma = codigoTurma;
        this.dataInicio = dataInicio;
        this.numeroVagas = numeroVagas;
        this.curso = curso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Integer getNumeroVagas() {
        return numeroVagas;
    }

    public void setNumeroVagas(Integer numeroVagas) {
        this.numeroVagas = numeroVagas;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Set<Aluno> getAlunos() {
        return alunos;
    }

    public Set<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public Set<Matricula> getMatriculas() {
        return matriculas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Turma)) return false;
        Turma turma = (Turma) o;
        return Objects.equals(getId(), turma.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
