package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.Series;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesRepository extends JpaRepository<Series,Integer> {

}
