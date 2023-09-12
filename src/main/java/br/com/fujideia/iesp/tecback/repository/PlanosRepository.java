package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.Planos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanosRepository extends JpaRepository<Planos,Integer> {
}
