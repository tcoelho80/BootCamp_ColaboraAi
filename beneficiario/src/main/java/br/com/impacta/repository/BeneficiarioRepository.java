package br.com.impacta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.impacta.model.Beneficiario;

public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long> {

}