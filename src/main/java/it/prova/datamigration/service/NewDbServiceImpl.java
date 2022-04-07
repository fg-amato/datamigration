package it.prova.datamigration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.datamigration.dto.Assicurato;
import it.prova.datamigration.dto.NotProcessed;
import it.prova.datamigration.model.DatiFiscali;
import it.prova.datamigration.repository.NewDbErrorRepository;
import it.prova.datamigration.repository.NewDbRepository;
import it.prova.datamigration.utility.AssicuratoValidator;

@Service
public class NewDbServiceImpl implements NewDbService {

	@Autowired
	private NewDbRepository repository;
	@Autowired
	private NewDbErrorRepository errorRepository;

	@Override
	public void inserisciNuovo(DatiFiscali instance) {
		if (AssicuratoValidator.validateDatiFiscali(instance)) {
			repository.save(Assicurato.createAssicuratoFromDatiFiscali(instance));
		} else {
			errorRepository.save(NotProcessed.createNotProcessedFromModel(instance));
		}
	}
}
