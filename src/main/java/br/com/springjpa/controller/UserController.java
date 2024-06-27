package br.com.springjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.springjpa.vo.UserVO;

@Controller
public class UserController {

	@GetMapping("/user")
	public String iniciarTela(Model model){
		model.addAttribute("user", new UserVO());
		return "user";
	}
	
	@PostMapping("/user")
	public String cadastrarUser(@ModelAttribute UserVO user) {
		return "confirmacaoCadastroUser";
	}
	
}
