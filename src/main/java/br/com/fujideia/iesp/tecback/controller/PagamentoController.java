package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Pagamento;
import br.com.fujideia.iesp.tecback.repository.PagamentoRepository;
import br.com.fujideia.iesp.tecback.service.PagamentoService;
import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping
public class PagamentoController {
    @Autowired
    private PagamentoService service;

    @PostMapping
    public ResponseEntity<Pagamento> salvar(@RequestBody Pagamento pagamento) {
        pagamento = service.salvar(pagamento);
        return ResponseEntity.ok(pagamento);
    }

    @PutMapping
    public ResponseEntity<Pagamento> alterar(@RequestBody Pagamento pagamento) {
        pagamento = service.alterar(pagamento);
        return ResponseEntity.ok(pagamento);
    }

    @GetMapping
    public ResponseEntity<List<Pagamento>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pagamento> consultar(@PathVariable("id") Integer id) {
        return ResponseEntity.ok((Pagamento) service.IdConsulta(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> excluir(@PathVariable("id") Integer id) {
        if (service.excluir(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}