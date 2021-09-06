package com.uniesquina.uniesquinaapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigoTurma;
    private Date dataInicio;
    private Integer numeroVagas;
    private Curso curso;

    private List<Aluno> alunos;
    private List<Avaliacao> avaliacoes;
    private List<Matricula> matriculas;

    public Turma() {
    }

    public Turma(Long id, String codigoTurma, Date dataInicio, Integer numeroVagas, Curso curso, List<Aluno> alunos, List<Avaliacao> avaliacoes, List<Matricula> matriculas) {
        this.id = id;
        this.codigoTurma = codigoTurma;
        this.dataInicio = dataInicio;
        this.numeroVagas = numeroVagas;
        this.curso = curso;
        this.alunos = alunos;
        this.avaliacoes = avaliacoes;
        this.matriculas = matriculas;
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

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void addAvaliacao(Avaliacao avaliacao) {
        this.avaliacoes.add(avaliacao);
    }

    public void addMatricula(Matricula matricula) {
        this.matriculas.add(matricula);
    }
}
