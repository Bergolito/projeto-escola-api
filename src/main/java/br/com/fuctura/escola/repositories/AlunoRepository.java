package br.com.fuctura.escola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fuctura.escola.modelo.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

	//
}
