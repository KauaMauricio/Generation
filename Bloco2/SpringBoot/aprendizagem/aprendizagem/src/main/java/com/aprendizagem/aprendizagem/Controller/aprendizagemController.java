package com.aprendizagem.aprendizagem.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aprendizagemController {
	
	@GetMapping("/aprendizagem") 
	public String adjetivos( ){
		return "aprender mais sobre mysql e spring";
	}
	

}
