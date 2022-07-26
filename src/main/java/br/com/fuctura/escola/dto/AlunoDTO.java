package br.com.fuctura.escola.dto;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.constraints.NotBlank;

import br.com.fuctura.escola.modelo.Aluno;

public class AlunoDTO {

	@NotBlank 
	private String cpf;
	@NotBlank
	private String nome;
	
	public AlunoDTO (Aluno aluno) {
		this.cpf = aluno.getCpf();
		this.nome = aluno.getNome();
	}
	
	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public static List<AlunoDTO> converter(List<Aluno> alunos){
		return alunos.stream().map(AlunoDTO::new).collect(Collectors.toList());
	}
}
