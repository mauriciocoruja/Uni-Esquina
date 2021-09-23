package com.uniesquina.uniesquinaapi.config;

import com.uniesquina.uniesquinaapi.entities.*;
import com.uniesquina.uniesquinaapi.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;
import java.util.Date;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private TurmaRepository turmaRepository;
    @Autowired
    private AlunoRepository alunoRepository;
    @Autowired
    private AvaliacaoRepository avaliacaoRepository;
    @Autowired
    private CursoRepository cursoRepository;
    @Autowired
    private MatriculaRepository matriculaRepository;
    @Autowired
    private ResultadoRepository resultadoRepository;

    @Override
    public void run(String... args) throws Exception {

        Turma turma1 = new Turma(null, "A001", new Date(),30, null);
        turmaRepository.save(turma1);
        Aluno aluno1 = new Aluno(null,"Mauricio Coruja","000000000000", new Date(), null);
        alunoRepository.save(aluno1);

        aluno1.getTurmas().add(turma1);
        alunoRepository.save(aluno1);

        Matricula matricula1 = new Matricula(aluno1, turma1, new Date(), 48);
        matriculaRepository.save(matricula1);

        Curso curso1 = new Curso(null, "DevSuperior Java", 40,997.0, 7.0);
        turma1.setCurso(curso1);

        cursoRepository.save(curso1);

        matricula1.setAluno(aluno1);
        matriculaRepository.save(matricula1);

        Avaliacao avaliacao1 = new Avaliacao(null,6.0,new Date());
        Avaliacao avaliacao2 = new Avaliacao(null,4.0,new Date());
        Resultado resultado1 = new Resultado(aluno1, avaliacao1,5.0);
        Resultado resultado2 = new Resultado(aluno1, avaliacao2,3.6);

        avaliacaoRepository.saveAll(Arrays.asList(avaliacao1,avaliacao2));
        resultadoRepository.saveAll(Arrays.asList(resultado1,resultado2));



    }
}