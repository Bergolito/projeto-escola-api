package br.com.fuctura.escola.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fuctura.escola.dto.AlunoDTO;
import br.com.fuctura.escola.modelo.Aluno;
import br.com.fuctura.escola.services.AlunoService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
//@RequestMapping("/alunos")
public class AlunoController {

	@Autowired
	AlunoService alunoService;

	@GetMapping("/alunos")
	public ResponseEntity<List<Aluno>> getAllAlunos() {
		return new ResponseEntity<List<Aluno>>(alunoService.listarTodosAlunos(), HttpStatus.OK);
	}
	
	@PostMapping("/alunos")
	public ResponseEntity<Aluno> saveAluno(@RequestBody @Valid AlunoDTO alunoDTO) {
		Aluno alunoBanco = new Aluno();
		BeanUtils.copyProperties(alunoDTO, alunoBanco);
		return ResponseEntity.status(HttpStatus.CREATED).body(alunoService.save(alunoBanco));
	}	

}
