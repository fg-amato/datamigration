package it.prova.datamigration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.datamigration.model.DatiFiscali;

@Service
public class MigrationServiceImpl implements MigrationService {

	@Autowired
	DatiFiscaliService dfs;

	@Autowired
	NewDbService ndbs;

	@Override
	public void transferData() {
		for (DatiFiscali item : dfs.listAllElementsEager()) {
			ndbs.inserisciNuovo(item);
		}

	}

}
