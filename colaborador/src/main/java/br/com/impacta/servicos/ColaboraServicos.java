package br.com.impacta.servicos;
import java.util.Date;
import java.util.List;

import br.com.impacta.model.Colabora;
import br.com.impacta.repository.ColaboraRepository;

public class ColaboraServicos {
	
	private ColaboraRepository repository;
	
	public ColaboraServicos(ColaboraRepository repository) {
		super();
		this.repository = repository;
		
	}
	
	public Colabora criaColaboracao(int idcamp,int idusu,String obs) {
		var dt =  new Date();
		Colabora col = new Colabora();
		col.setIdcamp(idcamp);
		col.setIdusu(idusu);
		col.setObs(obs);
		col.setDtcad(dt);
		col.setDelet(" ");
		
		 try {
				var NovoColabora =repository.save(col);
				return NovoColabora;
				}catch (Exception e) {
			       
					var a =e.getMessage();
					
					col.setObs(a);
					return col;
				}
		
		
	}
	
	
	

}
