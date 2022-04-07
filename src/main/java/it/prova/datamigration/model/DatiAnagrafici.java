package it.prova.datamigration.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.crypto.Data;

@Entity
@Table(name = "datianagrafici")
public class DatiAnagrafici {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "cognome")
	private String cognome;
	@Column(name = "datadinascita")
	private Data dataDiNascita;

	@OneToOne(fetch = FetchType.LAZY)
	private DatiFiscali datiFiscali;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "datiAnagrafici")
	private Set<Sinistro> sinistri = new HashSet<>();

	public DatiAnagrafici() {
		super();
	}

	public DatiAnagrafici(String nome, String cognome, Data dataDiNascita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
	}

	public DatiAnagrafici(Long id, String nome, String cognome, Data dataDiNascita) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
	}

	public DatiAnagrafici(String nome, String cognome, Data dataDiNascita, DatiFiscali datiFiscali) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.datiFiscali = datiFiscali;
	}

	public DatiAnagrafici(Long id, String nome, String cognome, Data dataDiNascita, DatiFiscali datiFiscali) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.datiFiscali = datiFiscali;
	}

	public DatiAnagrafici(String nome, String cognome, Data dataDiNascita, Set<Sinistro> sinistri) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.sinistri = sinistri;
	}

	public DatiAnagrafici(Long id, String nome, String cognome, Data dataDiNascita, DatiFiscali datiFiscali,
			Set<Sinistro> sinistri) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.datiFiscali = datiFiscali;
		this.sinistri = sinistri;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Data getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(Data dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public DatiFiscali getDatiFiscali() {
		return datiFiscali;
	}

	public void setDatiFiscali(DatiFiscali datiFiscali) {
		this.datiFiscali = datiFiscali;
	}

	public Set<Sinistro> getSinistri() {
		return sinistri;
	}

	public void setSinistri(Set<Sinistro> sinistri) {
		this.sinistri = sinistri;
	}
}
