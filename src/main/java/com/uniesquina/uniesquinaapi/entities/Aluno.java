package com.uniesquina.uniesquinaapi.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_aluno")
public class Aluno implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private Date nascimento;

    @OneToOne(mappedBy = "id.aluno")
    private Matricula matricula;

    @ManyToMany(mappedBy = "alunos")
    private Set<Turma> turmas = new HashSet<>();

    @ManyToMany(mappedBy = "alunos")
    private Set<Avaliacao> avaliacoes = new HashSet<>();

    @OneToMany(mappedBy = "id.aluno")
    private Set<Resultado> resultados = new HashSet<>();

    public Aluno() {
    }

    public Aluno(Long id, String nome, String cpf, Date nascimento, Matricula matricula) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.matricula = matricula;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public Set<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

//    public Set<Turma> getTurmas() {
//        return turmas;
//    }
//
//    public void addTurma(Turma turma) {
//        this.turmas.add(turma);
//    }

    public Set<Resultado> getResultados() {
        return resultados;
    }

    public void addResultado(Resultado resultado){
        this.resultados.add(resultado);
    }
}
