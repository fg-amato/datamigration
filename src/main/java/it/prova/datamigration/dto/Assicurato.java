package it.prova.datamigration.dto;

import java.util.Date;

import it.prova.datamigration.model.DatiFiscali;

public class Assicurato {

	private String nome;
	private String cognome;
	private Date dataDiNascita;
	private String codiceFiscale;
	private Integer numeroSinistri;

	public Assicurato(String nome, String cognome, Date dataDiNascita, String codiceFiscale, Integer numeroSinistri) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.codiceFiscale = codiceFiscale;
		this.numeroSinistri = numeroSinistri;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public Integer getNumeroSinistri() {
		return numeroSinistri;
	}

	public void setNumeroSinistri(Integer numeroSinistri) {
		this.numeroSinistri = numeroSinistri;
	}

	public static Assicurato createAssicuratoFromDatiFiscali(DatiFiscali instance) {
		return new Assicurato(instance.getDatiAnagrafici().getNome(), instance.getDatiAnagrafici().getCognome(),
				instance.getDatiAnagrafici().getDateDiNascita(), instance.getCodiceFiscale(),
				instance.getDatiAnagrafici().getSinistri().size());
	}
}
