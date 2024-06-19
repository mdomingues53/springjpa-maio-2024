package br.com.springjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import br.com.springjpa.entity.VeiculoInterface;

@Component
public class VeiculoService {
	
	@Autowired
	@Qualifier("caminhaoBean")
	private VeiculoInterface veiculoInterface;

	public void run() {
		veiculoInterface.start();
		veiculoInterface.stop();
	}
}
