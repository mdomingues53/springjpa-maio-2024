package br.com.springjpa.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("caminhaoBean")
public class Caminhao implements VeiculoInterface {

	@Override
	public void start() {
		System.out.println("Ligando caminhao");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Desligando caminhao");
		
	}

}
