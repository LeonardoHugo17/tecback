package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Planos;
import br.com.fujideia.iesp.tecback.service.PlanosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PlanosController {
    @Autowired
    private PlanosService service;

    @PostMapping
    public ResponseEntity<Planos> salvar(@RequestBody Planos planos){
        planos = service.salvar(planos);
        return ResponseEntity.ok(planos);
    }

    @PutMapping
    public ResponseEntity<Planos> alterar(@RequestBody Planos planos){
        planos = service.alterar(planos);
        return ResponseEntity.ok(planos);
    }

    @GetMapping
    public ResponseEntity<List<Planos>> listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Planos> consultar(@PathVariable("id") Integer id){
        return ResponseEntity.ok(service.consultarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> excluir(@PathVariable("id") Integer id){
        if(service.excluir(id)){
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
