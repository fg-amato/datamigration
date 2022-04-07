package it.prova.datamigration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.datamigration.model.DatiFiscali;
import it.prova.datamigration.repository.DatiFiscaliRepository;

@Service
public class DatiFiscaliServiceImpl implements DatiFiscaliService {
	@Autowired
	private DatiFiscaliRepository repository;

	@Override
	public List<DatiFiscali> listAllElementsEager() {
		return repository.findAllEager();
	}

}
