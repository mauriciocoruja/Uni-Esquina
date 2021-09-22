package com.uniesquina.uniesquinaapi.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_avaliacao")
public class Avaliacao implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double nota;
    private Date data;

    @ManyToMany
    @JoinTable(
            name = "tb_avaliacoes_aluno",
            joinColumns =
            @JoinColumn(name = "avaliacao_id", referencedColumnName = "id"),
            inverseJoinColumns =
            @JoinColumn(name = "aluno_id", referencedColumnName = "id"))
    private Set<Aluno> alunos = new HashSet<>();

    @OneToMany(mappedBy = "id.avaliacao")
    private Set<Resultado> resultados = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "turma_id")
    private Turma turma;

    public Turma getTurma() {
        return turma;
    }

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

    public Set<Aluno> getAlunos() {
        return alunos;
    }

    public Set<Resultado> getResultados() {
        return resultados;
    }

    public void addResultado(Resultado resultado) {
        this.resultados.add(resultado);
    }
}
