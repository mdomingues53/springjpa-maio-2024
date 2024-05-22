package br.com.springjpa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.springjpa.entity.Usuario;
import br.com.springjpa.repository.UsuarioRepository;

@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	private UsuarioRepository userRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		Usuario user1 = new Usuario("Marcelo", "mdomingues53@hotmail.com");
		Usuario user2 = new Usuario("Michele", "chelebb@hotmail.com");	
		
		userRepository.save(user1);
		userRepository.save(user2);
		
	}

	
}
