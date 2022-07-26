package br.com.fuctura.escola.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fuctura.escola.modelo.Aluno;
import br.com.fuctura.escola.repositories.AlunoRepository;

@Service
public class AlunoService {

	//
	@Autowired
	AlunoRepository alunoRepository;
	
	@Transactional
	public Aluno save(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	public List<Aluno> listarTodosAlunos() {
		return alunoRepository.findAll();
	}
	
}
