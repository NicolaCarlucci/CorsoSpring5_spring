package it.test.corsospring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Bean(name = "phoneBean")
	public Phonr getPhone() {
		return new Phonr();
	}

	@Bean(name = "userBean")
	@Scope("singleton")
	public User getUser() {
		return new User(getPhone());
	}

}
