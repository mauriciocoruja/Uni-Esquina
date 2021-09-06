package com.uniesquina.uniesquinaapi.entities;

import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Entity
public class Matricula {
    private Date dataMatricula;
    private Integer prestacoes;
    private Turma turma;

    private List<Aluno> alunos;

    public Matricula() {
    }

    public Matricula(Date dataMatricula, Integer prestacoes, Turma turma, List<Aluno> alunos) {
        this.dataMatricula = dataMatricula;
        this.prestacoes = prestacoes;
        this.turma = turma;
        this.alunos = alunos;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Integer getPrestacoes() {
        return prestacoes;
    }

    public void setPrestacoes(Integer prestacoes) {
        this.prestacoes = prestacoes;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void addAlunos(Aluno aluno) {
        this.alunos.add(aluno);
    }
}
