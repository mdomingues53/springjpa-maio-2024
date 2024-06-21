package br.com.springjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import br.com.springjpa.entity.Usuario;
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
	
	@RequestMapping(value="listarTodosUsuarios", method=RequestMethod.GET)
	public String getTodosUsuarios(Model model) {
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
	
	@RequestMapping(value="user/{nome}", method=RequestMethod.GET)
	public String getTodosUsuarios(@PathVariable String nome, Model model) {
		model.addAttribute("listaUsuarios", this.usuarioService.findListaUsuariosByNome(nome));	
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
	
	
	@RequestMapping(value="gravarUsuario", method=RequestMethod.POST)
	public String gravarUsuario(@RequestBody Usuario user, Model model) {
		this.usuarioService.gravarUsuario(user);
		model.addAttribute("user", user);	
		model.addAttribute("nomeUsuario", this.nomeUsuario);
		model.addAttribute("server", this.server);
		model.addAttribute("aplicacao", this.app);
		model.addAttribute("descricao", this.descricao);
		
		System.out.println("NomeUsuario : " + nomeUsuario);
		System.out.println("server" + this.server);
		System.out.println("aplicacao" + this.app);
		System.out.println("descricao" + this.descricao);
		
		return "cadastroUsuarioSucesso";
	}
	
	@RequestMapping(value="postman/gravarUsuario", method=RequestMethod.POST)
	public String gravarUsuarioByPostman(@RequestBody Usuario user, Model model) {
		this.usuarioService.gravarUsuario(user);
		String json = "";
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		try {
			json = ow.writeValueAsString(user);
		}catch (Exception e) {
			System.out.println("Erro : " + e.getMessage());
		}
		
		model.addAttribute("json", json);
		model.addAttribute("user", user);
		return "cadastroUsuarioSucesso";
	}


}
