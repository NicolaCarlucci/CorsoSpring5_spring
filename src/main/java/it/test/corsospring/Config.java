package it.test.corsospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	// fare questo metodo equivale a fare l'xml di prima
	@Bean(name = "ordine")
	public OrdineService getOrdineService() {
		return new OrdineService();
	}

}
