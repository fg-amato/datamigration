package it.prova.datamigration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "datifiscali")
public class DatiFiscali {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "codicefiscale")
	private String codiceFiscale;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "datiFiscali")
	private DatiAnagrafici datiAnagrafici;

	public DatiFiscali(Long id, String codiceFiscale) {
		super();
		this.id = id;
		this.codiceFiscale = codiceFiscale;
	}

	public DatiFiscali(Long id, String codiceFiscale, DatiAnagrafici datiAnagrafici) {
		super();
		this.id = id;
		this.codiceFiscale = codiceFiscale;
		this.datiAnagrafici = datiAnagrafici;
	}

	public DatiAnagrafici getDatiAnagrafici() {
		return datiAnagrafici;
	}

	public void setDatiAnagrafici(DatiAnagrafici datiAnagrafici) {
		this.datiAnagrafici = datiAnagrafici;
	}

	public DatiFiscali(Long id) {
		super();
		this.id = id;
	}

	public DatiFiscali() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

}
