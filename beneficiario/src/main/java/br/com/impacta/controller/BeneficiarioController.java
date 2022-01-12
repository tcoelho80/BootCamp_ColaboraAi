package br.com.impacta.controller;

import java.util.Date;
import java.util.List;
import br.com.impacta.model.Beneficiario;
import br.com.impacta.model.Campanha;
import br.com.impacta.model.Colabora;
import br.com.impacta.model.Usuario;
import br.com.impacta.repository.BeneficiarioRepository;

import br.com.impacta.servicos.BeneficiarioServicos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="Beneficiario endpoint")
@RestController
@RequestMapping("Beneficiario")

public class BeneficiarioController {
	
	@Autowired
	private BeneficiarioRepository repository;
	
	@Operation(summary="Para criar Beneficiario basta informar idcomp,idusu,obs "
			  )
	@PostMapping("/criaBeneficiario/{idcamp}/{idusu}/{Idcamp}/{Idusu}")
	public Beneficiario criaBeneficiario(
			@PathVariable("idcamp") int idcamp,
			@PathVariable("idusu") int idusu) {
		
	 var dt =  new Date();
	 Beneficiario benef = new Beneficiario();
	 	benef.setIdcamp(idcamp);
	 	benef.setIdusu(idusu);
	 	benef.setDelet(" ");
	 	benef.setObs(" ");
	 	benef.setDtcad(dt);
		
		try {
		var ret = repository.save(benef);
		
		return ret;
		}catch (Exception e) {
			var a =e.getMessage();
			
			benef.setObs(a);
			return benef;
		}
	}
}
	
	
	
//	  @Operation(summary="Para criar Beneficiario basta informar idcomp,idusu,obs "
//	  )
//	  
//	  @PostMapping("/cria_Beneficiario") public Beneficiario
//	 criaColaboracao(@RequestBody Beneficiario col) { BeneficiarioServicos serv =
//	  new BeneficiarioServicos(repository);
//	  
//	  try { var ret= serv.criaBeneficiario(col.getIdcamp(), col.getIdusu(),
//	  col.getObs());
//	  
//	  return col; }catch (Exception e) {
//	  
//	  col.setObs(e.getMessage()); return col; }
//	  }



