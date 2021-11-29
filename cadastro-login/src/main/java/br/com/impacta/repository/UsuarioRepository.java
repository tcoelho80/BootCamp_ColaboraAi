package br.com.impacta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.impacta.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	

	 @Query(value = "SELECT * FROM projeto.usuario where email =?1 and senha =?2 and delet=''", nativeQuery = true)
	    Usuario findByUsuarioSenha(String emailString, String senhString);
	 
	 
	
}
