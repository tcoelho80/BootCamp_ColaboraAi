package br.com.impacta.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="campanha")

public class Campanha implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcampanha;
	
	@Column(nullable = true)
	private String nomecamp;
	
	@Column(nullable = true)
	private String descricao;
	
	@Column(nullable = true)
	private String nomeresponsavel;
	
	@Column(nullable = true)
	private Long idcategoria;
	
	@Column(nullable = true)
	private String email;
	
	@Column(nullable = true)
	private String telefone;
	
	@Column(nullable = true)
	private String site;
	
	@Column(nullable = true)
	private String local;
	
	@Column(nullable = true)
	private Date dtevento;
	
	@Column(nullable = true)
	private Date dtcad;
	
	@Column(nullable = true)
	private int idusu;
	
	@Column(nullable = true)
	private String delet;

	public Campanha() {
		super();
	}

	public Campanha(Long idcampanha, 
					String nomeCamp, 
					String descrao, 
					String nomeResponsavel, 
					Long idCategoria,
					String email, 
					String telefone, 
					String site, 
					String local, 
					Date dtEvento, 
					Date dtcad, 
					int idusu,
					String delet) {
		super();
		this.idcampanha = idcampanha;
		this.nomecamp = nomeCamp;
		this.descricao = descrao;
		this.nomeresponsavel = nomeResponsavel;
		this.idcategoria = idCategoria;
		this.email = email;
		this.telefone = telefone;
		this.site = site;
		this.local = local;
		this.dtevento = dtEvento;
		this.dtcad = dtcad;
		this.idusu = idusu;
		this.delet = delet;
	}

	public Long getIdcampanha() {
		return idcampanha;
	}

	public void setIdcampanha(Long idcampanha) {
		this.idcampanha = idcampanha;
	}

	public String getNomeCamp() {
		return nomecamp;
	}

	public void setNomeCamp(String nomeCamp) {
		this.nomecamp = nomeCamp;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNomeResponsavel() {
		return nomeresponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeresponsavel = nomeResponsavel;
	}

	public Long getIdCategoria() {
		return idcategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idcategoria = idCategoria;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Date getDtEvento() {
		return dtevento;
	}

	public void setDtEvento(Date dtEvento) {
		this.dtevento = dtEvento;
	}

	public Date getDtcad() {
		return dtcad;
	}

	public void setDtcad(Date dtcad) {
		this.dtcad = dtcad;
	}

	public int getIdusu() {
		return idusu;
	}

	public void setIdusu(int idusu) {
		this.idusu = idusu;
	}

	public String getDelet() {
		return delet;
	}

	public void setDelet(String delet) {
		this.delet = delet;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(delet, descricao, dtevento, dtcad, email, idcategoria, idcampanha, idusu, local, nomecamp,
				nomeresponsavel, site, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Campanha other = (Campanha) obj;
		return Objects.equals(delet, other.delet) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(dtevento, other.dtevento) && Objects.equals(dtcad, other.dtcad)
				&& Objects.equals(email, other.email) && Objects.equals(idcategoria, other.idcategoria)
				&& Objects.equals(idcampanha, other.idcampanha) && idusu == other.idusu
				&& Objects.equals(local, other.local) && Objects.equals(nomecamp, other.nomecamp)
				&& Objects.equals(nomeresponsavel, other.nomeresponsavel) && Objects.equals(site, other.site)
				&& Objects.equals(telefone, other.telefone);
	}
	
	
	
	
	
	
	
	
	

}
