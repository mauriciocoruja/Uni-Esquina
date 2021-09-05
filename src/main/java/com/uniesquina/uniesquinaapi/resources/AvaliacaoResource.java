package com.uniesquina.uniesquinaapi.resources;

import com.uniesquina.uniesquinaapi.entities.Avaliacao;
import com.uniesquina.uniesquinaapi.repositories.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/avaliacoes")
public class AvaliacaoResource {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    @GetMapping
    public ResponseEntity<List<Avaliacao>> findAll() {
        List<Avaliacao> list = avaliacaoRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Avaliacao> findById(@PathVariable Long id) {
        Avaliacao avaliacao = avaliacaoRepository.findById(id).get();
        return ResponseEntity.ok().body(avaliacao);
    }




}
