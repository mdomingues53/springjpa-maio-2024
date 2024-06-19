package br.com.springjpa.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("carroBean")
public class Carro implements VeiculoInterface {

	@Override
	public void start() {
		System.out.println("Ligando o carro");
		
	}

	@Override
	public void stop() {
		System.out.println("Desligando o carro");		
	}
	

}
