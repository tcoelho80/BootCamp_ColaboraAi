package br.com.impacta.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity(name="categoria_campanha")

public class CategoriaCampanha implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcategoriacampanha;
	
	@Column(nullable = true)
	private String nome;
	
	@Column(nullable = true)
	private Date dtcad;
	
	@Column(nullable = true)
	private int idusu;
	
	@Column(nullable = true)
	private String delet;

	
	public CategoriaCampanha() {
		
		// TODO Auto-generated constructor stub
	}


	public CategoriaCampanha(Long idcategoriacampanha, String nome, Date dtcad, int idusu, String delet) {
		
		this.idcategoriacampanha = idcategoriacampanha;
		this.nome = nome;
		this.dtcad = dtcad;
		this.idusu = idusu;
		this.delet = delet;
	}


	public Long getIdcategoriacampanha() {
		return idcategoriacampanha;
	}


	public void setIdcategoriacampanha(Long idcategoriacampanha) {
		this.idcategoriacampanha = idcategoriacampanha;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
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
		return Objects.hash(delet, dtcad, idcategoriacampanha, idusu, nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoriaCampanha other = (CategoriaCampanha) obj;
		return Objects.equals(delet, other.delet) && Objects.equals(dtcad, other.dtcad)
				&& Objects.equals(idcategoriacampanha, other.idcategoriacampanha) && idusu == other.idusu
				&& Objects.equals(nome, other.nome);
	}
	
	
	

}
