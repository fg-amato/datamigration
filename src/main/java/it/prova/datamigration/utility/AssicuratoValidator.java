package it.prova.datamigration.utility;

import it.prova.datamigration.model.DatiFiscali;

public class AssicuratoValidator {

	public static Boolean validateDatiFiscali(DatiFiscali item) {
		if (item == null || item.getDatiAnagrafici() == null) {
			return false;
		}

		if (item.getCodiceFiscale().length() != 16 || item.getDatiAnagrafici().getNome().matches(".*[0-9].*")
				|| item.getDatiAnagrafici().getCognome().matches(".*[0-9].*"))
			return false;

		return true;
	}
	
	
	
}
