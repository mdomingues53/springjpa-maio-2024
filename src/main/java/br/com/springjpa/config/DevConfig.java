package br.com.springjpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {

	@Bean()
	public BeanDev getBeanDev() {
		return new BeanDev();
	}
}
