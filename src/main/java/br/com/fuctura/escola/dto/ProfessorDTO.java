package br.com.fuctura.escola.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.fuctura.escola.modelo.Professor;

public class ProfessorDTO {

	private Long id;
	private String nome;
	private String tipo;
	
	public ProfessorDTO(Professor professor) {
		this.id = professor.getId();
		this.nome = professor.getNome();
		this.tipo = professor.getTipo();
	}

	
	
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}
	
	public static List<ProfessorDTO> converter(List<Professor> profs){
		return profs.stream().map(ProfessorDTO::new).collect(Collectors.toList());
	}

}
