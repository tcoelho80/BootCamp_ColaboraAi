package br.com.impacta.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.Transient;

@Entity(name="usuario")
public class Usuario implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idusuario;
	
	@Column(nullable = true)
	private String nome;
	
	@Column(nullable = true)
	private String endereco;
	
	@Column(nullable = true)
	private String bairro;
	
	@Column(nullable = true)
	private String cidade;
	
	@Column(nullable = true)
	private String estado;
	
	@Column(nullable = true)
	private String cep;
	
	@Column(nullable = true)
	private String documento;
	
	@Column(nullable = true)
	private String email;
	
	@Column(nullable = true)
	private String senha;
	
	@Column(nullable = true)
	private String tipo;
	
	@Column(nullable = true)
	private Date dtcad;
	
	@Column(nullable = false)
	private String delet;
	
	@Transient
	private String porta;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(Long idusuario, String nome, String endereco, String bairro, String cidade, String estado,
			String cep, String documento, String email, String senha, String tipo, Date dtcad, String delet,
			String porta) {
		super();
		this.idusuario = idusuario;
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.documento = documento;
		this.email = email;
		this.senha = senha;
		this.tipo = tipo;
		this.dtcad = dtcad;
		this.delet = delet;
		this.porta = porta;
	}

	public Long getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	public String getPorta() {
		return porta;
	}

	public void setPorta(String porta) {
		this.porta = porta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bairro, cep, cidade, delet, documento, dtcad, email, endereco, estado, idusuario, nome,
				porta, senha, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(cep, other.cep)
				&& Objects.equals(cidade, other.cidade) && Objects.equals(delet, other.delet)
				&& Objects.equals(documento, other.documento) && Objects.equals(dtcad, other.dtcad)
				&& Objects.equals(email, other.email) && Objects.equals(endereco, other.endereco)
				&& Objects.equals(estado, other.estado) && Objects.equals(idusuario, other.idusuario)
				&& Objects.equals(nome, other.nome) && Objects.equals(porta, other.porta)
				&& Objects.equals(senha, other.senha) && Objects.equals(tipo, other.tipo);
	}
	
	
	
	

}
