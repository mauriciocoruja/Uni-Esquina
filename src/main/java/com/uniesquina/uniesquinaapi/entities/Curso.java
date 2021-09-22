package com.uniesquina.uniesquinaapi.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_curso")
public class Curso implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer cargaHoraria;
    private Double valor;
    private Double notaMinima;

    @OneToMany(mappedBy = "curso")
    private Set<Turma> turmas = new HashSet<>();

    public Curso() {
    }

    public Curso(Long id, String nome, Integer cargaHoraria, Double valor, Double notaMinima) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.valor = valor;
        this.notaMinima = notaMinima;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getNotaMinima() {
        return notaMinima;
    }

    public void setNotaMinima(Double notaMinima) {
        this.notaMinima = notaMinima;
    }

    public Set<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(Turma turma) {
        this.turmas.add(turma);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curso)) return false;
        Curso curso = (Curso) o;
        return Objects.equals(getId(), curso.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
