package br.com.impacta.controller;
import br.com.impacta.model.Usuario;
import br.com.impacta.repository.UsuarioRepository;
import br.com.impacta.servicos.usuarioServicos;

import java.util.Date;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="usuario endpoint")
@RestController
@RequestMapping("usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;
	
// private final usuarioServicos usuServ;
 
// public UsuarioController(usuarioServicos usuServ) {
//	 this.usuServ=usuServ;
//	 
// }
	
	
@PostMapping("/cria_usuario/{nome}/{endereco}/{bairro}/{cidade}/{estado}/{cep}/{documento}"
		+ "/{email}/{senha}/{tipo}")	
public Usuario criaUsuario(@PathVariable("nome") String nome,
		@PathVariable("endereco") String endereco,
		@PathVariable("bairro") String bairro,
		@PathVariable("cidade") String cidade,
		@PathVariable("estado") String estado,
		@PathVariable("cep") String cep,
		@PathVariable("documento") String documento,
		@PathVariable("email") String email,
		@PathVariable("senha") String senha,
		@PathVariable("tipo") String tipo) {
	
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
	usu.setDelet(" ");
	usu.setDtcad(dt);
	
	try {
	var ret = repository.save(usu);
	
	return ret;
	}catch (Exception e) {
		var a =e.getMessage();
		var r=a;

		usu.setDocumento(a);
		return usu;
	}
	
	
	
}



@PostMapping("/cria_usuario1")	
public Usuario criaUsuario11(@RequestBody Usuario usu) {
	
	usuarioServicos usuServ = new usuarioServicos(repository);
	try {
	var ret= usuServ.CriaUsuario(usu.getNome(), usu.getEndereco(), usu.getBairro(),
			usu.getCidade(), usu.getEstado(), usu.getCep(), usu.getDocumento(), usu.getEmail(), usu.getSenha(), usu.getTipo());

		return ret;
		}catch (Exception e) {
			var a =e.getMessage();
			var r=a;

			usu.setDocumento(a);
			return usu;
		}
	
}



@GetMapping("/login/{email}/{senha}")	
public Usuario login(@PathVariable("email") String email,@PathVariable("senha") String senha) {
	
	usuarioServicos usuServ = new usuarioServicos(repository);
	try {
	var ret= usuServ.Login(email, senha);

		return ret;
		}catch (Exception e) {
			var a =e.getMessage();
			var r=a;
            Usuario usu = new Usuario();
			usu.setDocumento(a);
			return usu;
		}
	
}


@PostMapping("/signin/{email}/{senha}")	
public Usuario signIn(@PathVariable("email") String email,@PathVariable("senha") String senha) {
	
	usuarioServicos usuServ = new usuarioServicos(repository);
	try {
	var ret= usuServ.Login(email, senha);

		return ret;
		}catch (Exception e) {
			var a =e.getMessage();
			var r=a;
            Usuario usu = new Usuario();
			usu.setDocumento(a);
			return usu;
		}
	
}






}
