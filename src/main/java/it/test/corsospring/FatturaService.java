package it.test.corsospring;

public class FatturaService {

	private OrdineService ordineService;

	private ClienteService clienteService;

	private String numeroFattura;

	public FatturaService(OrdineService ordineService, ClienteService clienteService) {
		super();
		this.ordineService = ordineService;
		this.clienteService = clienteService;
	}

	public String stampaFattura() {
		if (numeroFattura == null) {
			numeroFattura = "abcd";
		}
		return numeroFattura + " " + clienteService.getHelloMessage() + " " + ordineService.printAllProducts();
	}

}
