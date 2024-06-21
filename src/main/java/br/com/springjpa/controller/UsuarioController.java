package br.com.springjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.springjpa.service.UsuarioService;

@Controller
public class UsuarioController {	
	
	@Value("${geral.user}")
	private String nomeUsuario;
	
	@Value("${ambiente.dev.server}")
	private String server;
	
	@Value("${ambiente.dev.app}")
	private String app;
	
	@Value("${ambiente.dev.descricao}")
	private String descricao;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping("/user")
	public String getUsuarios(Model model) {
		model.addAttribute("listaUsuarios", this.usuarioService.findAll());		
		model.addAttribute("nomeUsuario", this.nomeUsuario);
		model.addAttribute("server", this.server);
		model.addAttribute("aplicacao", this.app);
		model.addAttribute("descricao", this.descricao);
		
		System.out.println("NomeUsuario : " + nomeUsuario);
		System.out.println("server" + this.server);
		System.out.println("aplicacao" + this.app);
		System.out.println("descricao" + this.descricao);
		
		return "usuarios";
	}
	

}
