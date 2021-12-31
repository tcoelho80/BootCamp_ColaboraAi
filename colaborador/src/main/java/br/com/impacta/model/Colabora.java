package br.com.impacta.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="colabora")
public class Colabora implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcolabora;
	
	@Column(nullable = true)
	private int idcamp;
	
	@Column(nullable = true)
	private int idusu;
	
	@Column(nullable = true)
	private String obs;
	
	@Column(nullable = true)
	private Date dtcad;
	
	@Column(nullable = true)
	private String delet;

	public Colabora() {
		super();
	}

	public Colabora(Long idcolabora, int idcamp, int idusu, String obs, Date dtcad, String delet) {
		super();
		this.idcolabora = idcolabora;
		this.idcamp = idcamp;
		this.idusu = idusu;
		this.obs = obs;
		this.dtcad = dtcad;
		this.delet = delet;
	}

	public Long getIdcolabora() {
		return idcolabora;
	}

	public void setIdcolabora(Long idcolabora) {
		this.idcolabora = idcolabora;
	}

	public int getIdcamp() {
		return idcamp;
	}

	public void setIdcamp(int idcamp) {
		this.idcamp = idcamp;
	}

	public int getIdusu() {
		return idusu;
	}

	public void setIdusu(int idusu) {
		this.idusu = idusu;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Date getDtcad() {
		return dtcad;
	}

	public void setDtcad(Date dtcad) {
		this.dtcad = dtcad;
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
		return Objects.hash(delet, dtcad, idcamp, idcolabora, idusu, obs);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Colabora other = (Colabora) obj;
		return Objects.equals(delet, other.delet) && Objects.equals(dtcad, other.dtcad) && idcamp == other.idcamp
				&& Objects.equals(idcolabora, other.idcolabora) && idusu == other.idusu
				&& Objects.equals(obs, other.obs);
	}
	
	

}
