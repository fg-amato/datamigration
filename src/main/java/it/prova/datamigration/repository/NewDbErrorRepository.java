package it.prova.datamigration.repository;

import org.springframework.data.repository.CrudRepository;

import it.prova.datamigration.dto.NotProcessed;

public interface NewDbErrorRepository extends CrudRepository<NotProcessed, Long> {

	
}
