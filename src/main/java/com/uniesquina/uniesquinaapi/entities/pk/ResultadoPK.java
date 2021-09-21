package com.uniesquina.uniesquinaapi.entities.pk;

import com.uniesquina.uniesquinaapi.entities.Aluno;
import com.uniesquina.uniesquinaapi.entities.Avaliacao;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class ResultadoPK implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "avaliacao_id")
    private Avaliacao avaliacao;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResultadoPK that = (ResultadoPK) o;

        if (aluno != null ? !aluno.equals(that.aluno) : that.aluno != null) return false;
        return avaliacao != null ? avaliacao.equals(that.avaliacao) : that.avaliacao == null;
    }

    @Override
    public int hashCode() {
        int result = aluno != null ? aluno.hashCode() : 0;
        result = 31 * result + (avaliacao != null ? avaliacao.hashCode() : 0);
        return result;
    }
}
