package com.uniesquina.uniesquinaapi.entities.pk;

import com.uniesquina.uniesquinaapi.entities.Aluno;
import com.uniesquina.uniesquinaapi.entities.Turma;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class MatriculaPK implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "turma_id")
    private Turma turma;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MatriculaPK)) return false;

        MatriculaPK that = (MatriculaPK) o;

        if (getTurma() != null ? !getTurma().equals(that.getTurma()) : that.getTurma() != null) return false;
        return getAluno() != null ? getAluno().equals(that.getAluno()) : that.getAluno() == null;
    }

    @Override
    public int hashCode() {
        int result = getTurma() != null ? getTurma().hashCode() : 0;
        result = 31 * result + (getAluno() != null ? getAluno().hashCode() : 0);
        return result;
    }
}
