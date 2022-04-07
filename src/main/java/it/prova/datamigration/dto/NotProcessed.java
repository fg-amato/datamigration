package it.prova.datamigration.dto;

public class NotProcessed {

	private Long oldDbId;
	private String codiceFiscale;

	public NotProcessed(Long oldDbId, String codiceFiscale) {
		super();
		this.oldDbId = oldDbId;
		this.codiceFiscale = codiceFiscale;
	}

	public Long getOldDbId() {
		return oldDbId;
	}

	public void setOldDbId(Long oldDbId) {
		this.oldDbId = oldDbId;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

}
