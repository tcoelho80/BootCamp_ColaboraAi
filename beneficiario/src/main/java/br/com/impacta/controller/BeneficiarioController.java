package br.com.impacta.controller;

import java.util.Date;
import java.util.List;
import br.com.impacta.model.Beneficiario;

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
	
	@Operation(summary="Para criar Beneficiario basta informar idcomp,idusu,obs ")
	@PostMapping("/cria_Beneficiario")
	public Beneficiario criaColaboracao(@RequestBody Beneficiario col) {
		BeneficiarioServicos serv = new BeneficiarioServicos(repository);
		
		try {
			var ret= serv.criaBeneficiario(col.getIdcamp(), col.getIdusu(), col.getObs());
					
				return col;
				}catch (Exception e) {
					
					col.setObs(e.getMessage());
					return col;
				}
		
		
		
	}

}
