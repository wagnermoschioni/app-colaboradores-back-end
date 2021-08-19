package br.com.santander.colaboradores.repositiry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.santander.colaboradores.modelo.Colaborador;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {

	List<Colaborador> findByNome(String nomeColaborador);
	
	
   
}
