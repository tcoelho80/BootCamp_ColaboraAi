package br.com.impacta.servicos;

import java.util.Date;
import java.util.List;

import br.com.impacta.model.CategoriaCampanha;
import br.com.impacta.repository.CategoriaCampanhaRepository;

public class CategoriaCampanhaServicos {
	private CategoriaCampanhaRepository repository;
	
	 public CategoriaCampanhaServicos(CategoriaCampanhaRepository repository) {
	        this.repository = repository;
	    }
	 
	 public CategoriaCampanha criaCategoriaCampanha(String nome,
			                    	int idusu) {
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
	 
	 public List<CategoriaCampanha> categoriaCampanhaCriada() {
		 
		 var cat = repository.findByTodasCampanhasAtivas();
		 return cat;
//		 try {
//			
//				if(cat == null ) {
//					cat.setIdcategoriacampanha(null);
//					cat.setNome("Sem Categoria Criada");
//					
//					return cat;
//					
//				}else {
//					 return cat;
//				}
//				
//		   }catch (Exception e) {
//			  CategoriaCampanha cat = new CategoriaCampanha();
//			   cat.setIdcategoriacampanha(null);
//				cat.setNome(e.getMessage());
//				
//				return cat;
//		}
//		
		 
		 
	 }
	 
	 
	 
	
	 

}
