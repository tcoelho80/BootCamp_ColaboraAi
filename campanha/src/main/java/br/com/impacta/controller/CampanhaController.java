package br.com.impacta.controller;
import java.util.Date;
import java.util.List;

import br.com.impacta.repository.CampanhaRepository;
import br.com.impacta.servicos.CampanhaServicos;
import br.com.impacta.model.Campanha;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="Campanha endpoint")
@RestController
@RequestMapping("Campanha")
public class CampanhaController {
	@Autowired
	private CampanhaRepository repository;
	
	
	@Operation(summary="Para criar campanha")
	@PostMapping("/cria_Campanha/{nomeCamp}/{descricao}/{nomeResponsavel}/{idcategoria}/{email}/{telefone}"
			+ "/{local}/{dtEvento}/{idUsu}")	
	public Campanha criaCategoriaCampanha(
			@PathVariable("nomeCamp") String nomeCamp,
			@PathVariable("descricao") String descricao,
			@PathVariable("nomeResponsavel") String nomeResponsavel,
			@PathVariable("idCategoria") long idCategoria,
			@PathVariable("email") String email,
			@PathVariable("telefone") String telefone,
			@PathVariable("local") String local,
			@PathVariable("dtEvento") Date dtEvento,
			@PathVariable("idUsu") int idUsu){		
		
	 var dt =  new Date();
	 var dtEventoMock = new Date();
	 
	 Campanha catServ = new Campanha();
	 catServ.setNomeCamp(nomeCamp);
	 catServ.setDescricao(descricao);
	 catServ.setNomeResponsavel(nomeResponsavel);
	 catServ.setIdCategoria(idCategoria);
	 catServ.setEmail(email);
	 catServ.setTelefone(telefone);
	 catServ.setLocal(local);
	 catServ.setDtEvento(dtEventoMock);
	 catServ.setIdusu(idUsu);
	 catServ.setDelet(" ");
	 catServ.setDtcad(dt);
	 catServ.setSite(" ");
		
		try {
		var ret = repository.save(catServ);
		
		return ret;
		}catch (Exception e) {
			var a =e.getMessage();
			var r=a;

			catServ.setDescricao(a);
			return catServ;
		}
		
		
		
	}
	
	
	@Operation(summary="Para criar campanha")
	@PostMapping("/cria_CampanhaJson")	
	public Campanha criaCategoriaCampanhaJson(@RequestBody Campanha camp) {

		CampanhaServicos catServ = new CampanhaServicos(repository);
		try {
		var ret= catServ.criaCampanha(camp.getNomeCamp(),camp.getDescricao(),camp.getNomeResponsavel(),
				camp.getIdCategoria(),camp.getEmail(),camp.getTelefone(),camp.getSite(),
				camp.getLocal(),camp.getDtEvento(),camp.getIdusu()) ;

			return camp;
			}catch (Exception e) {

				camp.setDescricao(e.getMessage());
				return camp;
			}

	}
	 

		

}
