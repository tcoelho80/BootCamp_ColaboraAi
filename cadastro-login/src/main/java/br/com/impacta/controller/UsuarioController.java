package br.com.impacta.controller;
import br.com.impacta.model.Usuario;
import br.com.impacta.servicos.usuarioServicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="usuario endpoint")
@RestController
@RequestMapping("usuario")
public class UsuarioController {
	
	
@PostMapping("/cria_usuario/")	
public Usuario criaUsuario(@RequestBody Usuario usu) {
	
	usuarioServicos usuServ = new usuarioServicos();
	var ret= usuServ.CriaUsuario(usu.getNome(), usu.getEndereco(), usu.getBairro(),
			usu.getCidade(), usu.getEstado(), usu.getCep(), usu.getDocumento(), usu.getEmail(), usu.getSenha(), usu.getTipo());
	
	return ret;
	
	
	
}

}
