package br.com.fuctura.escola.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EscolaController {

	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "<h1>Olá aluno, seja bem-vindo!!!</h1>";
	}
}
