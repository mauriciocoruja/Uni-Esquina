package com.uniesquina.uniesquinaapi.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_turma")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigoTurma;
    private Date dataInicio;
    private Integer numeroVagas;

    @ManyToOne
    private Curso curso;

    @OneToMany
    @JoinTable(
            name = "tb_turma_alunos",
            joinColumns =
            @JoinColumn(name = "turma_id", referencedColumnName = "id"),
            inverseJoinColumns =
            @JoinColumn(name = "aluno_id", referencedColumnName = "id"))
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

//    public Set<Aluno> getAlunos() {
//        return alunos;
//    }

    public Set<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public Set<Matricula> getMatriculas() {
        return matriculas;
    }

}
