package br.com.impacta.servicos;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.impacta.model.Usuario;
import br.com.impacta.repository.UsuarioRepository;

public class usuarioServicos {
	
	 private UsuarioRepository repository;
	 
	 public usuarioServicos(UsuarioRepository repository) {
	        this.repository = repository;
	    }
	
public Usuario CriaUsuario(String nome,
		String endereco,
		String bairro,
		String cidade,
		String estado,
		String cep,
		String documento,
		String email,
		String senha,
		String tipo) {
	var dt =  new Date();
	Usuario usu = new Usuario();
	usu.setNome(nome);
	usu.setEndereco(endereco);
	usu.setBairro(bairro);
	usu.setCidade(cidade);
	usu.setEstado(estado);
	usu.setCep(cep);
	usu.setDocumento(documento);
	usu.setEmail(email);
	usu.setSenha(senha);
	usu.setTipo(tipo);
	usu.setDtcad(dt);
	usu.setDelet(" ");
//	usu.setIdusuario(1l);
	
	try {
	var NovoUsuario =repository.save(usu);
	return NovoUsuario;
	}catch (Exception e) {
       
		var a =e.getMessage();
		var r=a;

		usu.setDocumento(a);
		return usu;
	}
}




}
