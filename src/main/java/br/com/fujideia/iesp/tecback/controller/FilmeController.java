package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class FilmeController {
    @Autowired
    private FilmeService service;

    @PostMapping
    public ResponseEntity<Filme> salvar(@RequestBody Filme filme){
        filme = service.salvar(filme);
        return ResponseEntity.ok(filme);
    }

    @PutMapping
    public ResponseEntity<Filme> alterar(@RequestBody Filme filme){
        filme = service.alterar(filme);
        return ResponseEntity.ok(filme);
    }

    @GetMapping
    public ResponseEntity<List<Filme>> listar(){
        return ResponseEntity.ok(service.listar());
    }


}


