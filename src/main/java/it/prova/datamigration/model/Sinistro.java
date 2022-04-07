package it.prova.datamigration.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.boot.context.properties.ConfigurationProperties;

@Entity
@Table(name = "sinistri")
@ConfigurationProperties(prefix = "spring.datasource")
public class Sinistro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "tipo")
	private String tipo;
	@Column(name = "data")
	private Date data;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "datianagrafici_id", nullable = false)
	private DatiAnagrafici datiAnagrafici;

	public Sinistro() {
		super();
	}

	public Sinistro(Long id) {
		super();
		this.id = id;
	}

	public Sinistro(Long id, String tipo, Date data, DatiAnagrafici datiAnagrafici) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.data = data;
		this.datiAnagrafici = datiAnagrafici;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public DatiAnagrafici getDatiAnagrafici() {
		return datiAnagrafici;
	}

	public void setDatiAnagrafici(DatiAnagrafici datiAnagrafici) {
		this.datiAnagrafici = datiAnagrafici;
	}

	@Override
	public String toString() {
		return "Sinistro [id=" + id + ", tipo=" + tipo + ", data=" + data + "]";
	}

}
