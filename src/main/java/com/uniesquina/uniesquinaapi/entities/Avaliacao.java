package com.uniesquina.uniesquinaapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class Avaliacao {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double nota;
    private Date data;

    private List<Aluno> alunos;
    private List<Resultado> resultados;

    public Avaliacao() {
    }

    public Avaliacao(Long id, double nota, Date data) {
        this.id = id;
        this.nota = nota;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Resultado> getResultados() {
        return resultados;
    }

    public void addResultado(Resultado resultado) {
        this.resultados.add(resultado);
    }
}
