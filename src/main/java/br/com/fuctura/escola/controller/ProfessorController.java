package br.com.fuctura.escola.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fuctura.escola.dto.ProfessorDTO;
import br.com.fuctura.escola.modelo.Professor;

@RestController
public class ProfessorController {

	//@RequestMapping("/professores")
	public List<Professor> listar1() {
		
		Professor prof1 = new Professor(1L, "111111111-11", "Professor 1");
		Professor prof2 = new Professor(2L, "222222222-22", "Professor 2");
		Professor prof3 = new Professor(3L, "333333333-33", "Professor 3");
		
		return Arrays.asList(prof1, prof2, prof3); 
	}
	
	@RequestMapping("/professores")
	public List<ProfessorDTO> listar2() {
		
		Professor prof1 = new Professor(1L, "111111111-11", "Professor 1");
		Professor prof2 = new Professor(2L, "222222222-22", "Professor 2");
		Professor prof3 = new Professor(3L, "333333333-33", "Professor 3");
		
		return ProfessorDTO.converter(Arrays.asList(prof1, prof2, prof3)); 
	}
	
}
