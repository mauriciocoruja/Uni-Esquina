package com.uniesquina.uniesquinaapi.repositories;

import com.uniesquina.uniesquinaapi.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
