package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaoRepository extends JpaRepository<Cartao, Integer> {
}
