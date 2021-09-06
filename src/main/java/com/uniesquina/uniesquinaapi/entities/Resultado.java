package com.uniesquina.uniesquinaapi.entities;

import javax.persistence.Entity;

@Entity
public class Resultado {
    private Double notaObtida;
    private Aluno aluno;
    private Avaliacao avaliacao;

    public Resultado() {
    }

    public Resultado(Double notaObtida) {
        this.notaObtida = notaObtida;
    }

    public Double getNotaObtida() {
        return notaObtida;
    }

    public void setNotaObtida(Double notaObtida) {
        this.notaObtida = notaObtida;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }
}
