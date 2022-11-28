
package br.edu.fatecfranca.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BasqueteRepository extends 
			JpaRepository<BasqueteEntity, Long>{

	// esta classe vai herdar todos os métodos
	// inserção, remoção, consulta e atualização
	// em banco de dados da tabela candidato
	
	
}