package br.com.springjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.springjpa.service.UsuarioService;

@Controller
public class UsuarioController {	
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping("/user")
	public String getUsuarios(Model model) {
		model.addAttribute("listaUsuarios", this.usuarioService.findAll());
		return "usuarios";
	}
	

}
