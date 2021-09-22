package com.uniesquina.uniesquinaapi.entities;

import com.uniesquina.uniesquinaapi.entities.pk.ResultadoPK;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_resultado")
public class Resultado implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private ResultadoPK id = new ResultadoPK();
    private Double notaObtida;

    public Resultado() {
    }

    public Resultado(Aluno aluno, Avaliacao avaliacao, Double notaObtida) {
        id.setAluno(aluno);
        id.setAvaliacao(avaliacao);
        this.notaObtida = notaObtida;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Resultado resultado = (Resultado) o;

        return Objects.equals(id, resultado.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
