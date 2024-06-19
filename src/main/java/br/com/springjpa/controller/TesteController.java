package br.com.springjpa.controller;

import org.springframework.stereotype.Controller;

@Controller
public class TesteController {

	public String getHello() {
		System.out.println("Passei por aqui");
		return "hello";
	}
}
