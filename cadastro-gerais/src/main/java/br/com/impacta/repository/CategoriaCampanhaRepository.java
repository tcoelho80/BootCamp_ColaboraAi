package br.com.impacta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.impacta.model.CategoriaCampanha;

public interface CategoriaCampanhaRepository  extends JpaRepository<CategoriaCampanha, Long> {

	

	 @Query(value = " SELECT * FROM projeto.categoria_campanha where delet ='' ", nativeQuery = true)
	 List< CategoriaCampanha> findByTodasCampanhasAtivas();
}

