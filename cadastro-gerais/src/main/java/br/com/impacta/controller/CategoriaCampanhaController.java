package br.com.impacta.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.impacta.model.CategoriaCampanha;
import br.com.impacta.repository.CategoriaCampanhaRepository;
import br.com.impacta.servicos.CategoriaCampanhaServicos;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="CategoriaCampanha endpoint")
@RestController
@RequestMapping("CategoriaCampanha")
public class CategoriaCampanhaController {
	

	@Autowired
	private CategoriaCampanhaRepository repository;
	
	
@Operation(summary="teste")
@PostMapping("/cria_Categoria")	
public CategoriaCampanha criaCategoriaCampanha(@RequestBody CategoriaCampanha cat) {
	
	CategoriaCampanhaServicos catServ = new CategoriaCampanhaServicos(repository);
	try {
	var ret= catServ.criaCategoriaCampanha(cat.getNome(), cat.getIdusu()) ;

		return ret;
		}catch (Exception e) {
			
			cat.setNome(e.getMessage());
			return cat;
		}
	
}

@PostMapping("/cria_Categoria/{nome}/{idusu}")	
public CategoriaCampanha criaCategoriaCampanha1(@PathVariable("nome") String nome,
		@PathVariable("idusu") int idusu) {
	var dt =  new Date();
	
	 CategoriaCampanha cat = new CategoriaCampanha();
	 cat.setNome(nome);
	 cat.setIdusu(idusu);
	 cat.setDtcad(dt);
	 cat.setDelet(" ");
	 try {
			var NovoUsuario =repository.save(cat);
			return NovoUsuario;
			}catch (Exception e) {
		       
				var a =e.getMessage();
				var r=a;

				cat.setNome(a);
				return cat;
			}
	
}


@GetMapping("/categorias")
public List<CategoriaCampanha> categoriaCriada() {
	
	CategoriaCampanhaServicos catServ = new CategoriaCampanhaServicos(repository);
	//try {
	var ret= catServ.categoriaCampanhaCriada() ;

		return ret;
//		}catch (Exception e) {
//			CategoriaCampanha cat = new CategoriaCampanha();
//			cat.setNome(e.getMessage());
//			return cat;
//		}
	
}



}
