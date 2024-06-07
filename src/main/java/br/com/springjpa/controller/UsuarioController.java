package br.com.springjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.springjpa.repository.UsuarioRepository;

@Controller
public class UsuarioController {
	
	private UsuarioRepository usuarioRepository;

	public UsuarioController(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}	
	
	@RequestMapping("/user")
	public String getUsuarios(Model model) {
		model.addAttribute("listaUsuarios", this.usuarioRepository.findAll());
		return "usuarios";
	}
	

}
