package com.uniesquina.uniesquinaapi.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer cargaHoraria;
    private Double valor;
    private Double notaMinima;

    @OneToMany(mappedBy = "curso")
    private List<Turma> turmas;

    public Curso() {
    }

    public Curso(Long id, String nome, Double valor, Double notaMinima, List<Turma> turmas) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.notaMinima = notaMinima;
        this.turmas = turmas;
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

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(Turma turma) {
        this.turmas.add(turma);
    }
}
