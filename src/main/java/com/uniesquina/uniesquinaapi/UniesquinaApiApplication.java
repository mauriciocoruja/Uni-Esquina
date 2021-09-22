package com.uniesquina.uniesquinaapi;

import com.uniesquina.uniesquinaapi.entities.Avaliacao;
import com.uniesquina.uniesquinaapi.repositories.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class UniesquinaApiApplication {


	@Autowired
	private AvaliacaoRepository avaliacaoRepository;

	public static void main(String[] args) {
		SpringApplication.run(UniesquinaApiApplication.class, args);
	}

}
