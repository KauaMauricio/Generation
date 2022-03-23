package com.bsms.lista_bdsm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class listaBdmsController {

	@GetMapping("/lista_bdsm")
	public String lista_bdsm() {
		return "Orientação ao futuro" + "\nResponsabilidade pessoal" + "\nMentalidade de crescimento"
				+ "\nPersistencia" + "\nTrabalho em equipe" + "\nAtenção aos detalhes" + "\nProatividade"
				+ "\nComunicação";
		
	}
	
	
}
