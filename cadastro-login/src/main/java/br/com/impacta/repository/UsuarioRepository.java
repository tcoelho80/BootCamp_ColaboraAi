package br.com.impacta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.impacta.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	

}
