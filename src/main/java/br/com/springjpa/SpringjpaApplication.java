package br.com.springjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjpaApplication.class, args);		
	}
	
	/*
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringjpaApplication.class, args);
		VeiculoService service = (VeiculoService)ctx.getBean("veiculoService");
		service.run();
	}
	*/
	
	/*
	public static void main(String[] args) {
		SpringApplication.run(SpringjpaApplication.class, args);
	}
	*/

}
