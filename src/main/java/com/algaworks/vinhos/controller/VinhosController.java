package com.algaworks.vinhos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.algaworks.vinhos.model.TipoVinho;
import com.algaworks.vinhos.model.Vinho;

@Controller
public class VinhosController {

	@GetMapping("/vinhos/novo")
	public String novo(Model model) {
		
		model.addAttribute(new Vinho());
		
		model.addAttribute("tipos", TipoVinho.values());
		
		
		return "vinho/cadastro-vinho";
	}

	@PostMapping("/vinhos/novo")
	public String salvar(Vinho vinho) {
		
		return "";
		
	}
	
}
