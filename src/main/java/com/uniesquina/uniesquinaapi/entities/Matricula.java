package com.uniesquina.uniesquinaapi.entities;

import com.uniesquina.uniesquinaapi.entities.pk.MatriculaPK;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tb_matricula")
public class Matricula implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private MatriculaPK id = new MatriculaPK();
    private Date dataMatricula;
    private Integer prestacoes;

    public Matricula() {
    }

    public Matricula(Aluno aluno, Turma turma, Date dataMatricula, Integer prestacoes) {
        id.setAluno(aluno);
        id.setTurma(turma);
        this.dataMatricula = dataMatricula;
        this.prestacoes = prestacoes;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matricula matricula = (Matricula) o;

        if (!id.equals(matricula.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public void setAluno(Aluno aluno) {
        id.setAluno(aluno);
    }
}
