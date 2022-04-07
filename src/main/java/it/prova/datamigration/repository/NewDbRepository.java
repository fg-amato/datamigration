package it.prova.datamigration.repository;

import org.springframework.data.repository.CrudRepository;

import it.prova.datamigration.dto.Assicurato;

public interface NewDbRepository extends CrudRepository<Assicurato, Long> {

}
