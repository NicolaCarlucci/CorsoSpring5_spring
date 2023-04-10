package it.test.corsospring.autowired;

import org.springframework.stereotype.Component;

@Component(value = "clienteAutoWired")
public class ClienteServiceAutoWired {

	public String getInfoCliente() {
		return "Nicola Carlucci Info";
	}

}
