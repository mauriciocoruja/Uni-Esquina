package com.uniesquina.uniesquinaapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private Date nascimento;
    private Matricula matricula;

    private List<Avaliacao> avaliacoes;
    private List<Turma> turmas;
    private List<Resultado> resultados;

    public Aluno() {
    }

    public Aluno(Long id, String nome, String cpf, Date nascimento, Matricula matricula, List<Avaliacao> avaliacoes, List<Turma> turmas, List<Resultado> resultados) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.matricula = matricula;
        this.avaliacoes = avaliacoes;
        this.turmas = turmas;
        this.resultados = resultados;
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

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void addTurma(Turma turma) {
        this.turmas.add(turma);
    }

    public List<Resultado> getResultados() {
        return resultados;
    }

    public void addResultado(Resultado resultado){
        this.resultados.add(resultado);
    }
}
