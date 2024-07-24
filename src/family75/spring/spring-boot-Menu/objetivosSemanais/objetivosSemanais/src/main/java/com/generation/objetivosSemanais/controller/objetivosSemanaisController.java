package com.generation.objetivosSemanais.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivosSemanais")
public class objetivosSemanaisController {

	@GetMapping
	public String objetivosSemanais () {
		return "Não faltar a aula\n"
				+ "Concluir todas as atividades\n"
				+ "Desenvolver um projeto básico\n"
				+ "Ter ao menos 3 horas de descanso na natureza\n";
	}
	
	
}
