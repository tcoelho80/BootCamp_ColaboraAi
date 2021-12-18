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
	@PostMapping("/cria_Campanha")	
	public Campanha criaCategoriaCampanha(@RequestBody Campanha camp) {
		
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
