package it.prova.datamigration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import it.prova.datamigration.model.DatiFiscali;

public interface DatiFiscaliRepository extends CrudRepository<DatiFiscali, Long> {

	@Query("from DatiFiscali df left join fetch df.datiAnagrafici da left join fetch da.sinistri")
	public List<DatiFiscali> findAllEager();
}
