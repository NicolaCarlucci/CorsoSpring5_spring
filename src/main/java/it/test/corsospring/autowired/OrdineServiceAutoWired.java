package it.test.corsospring.autowired;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "ordineAutoWired")
public class OrdineServiceAutoWired {

	@Autowired
	private ClienteServiceAutoWired clienteServiceAutoWired;

	@Autowired
	private ProdottoServiceAutoWired prodottoServiceAutoWired;

//	@Autowired
//	public OrdineServiceAutoWired(ClienteServiceAutoWired clienteServiceAutoWired) {
//		super();
//		this.clienteServiceAutoWired = clienteServiceAutoWired;
//	}

	public OrdineServiceAutoWired() {
		super();
	}

	public String getInfoOrdine() {
		String data = new Date().toString();
		String infoCliente = clienteServiceAutoWired.getInfoCliente();
		String p = prodottoServiceAutoWired.getProdotto();
		return data + infoCliente + p;
	}

//	@Autowired
//	public void recuperaService(ProdottoServiceAutoWired prodottoServiceAutoWired) {
//		this.prodottoServiceAutoWired = prodottoServiceAutoWired;
//	}

	@PostConstruct
	public void init() {
		System.out.print("Init Method \n");
	}

	@PreDestroy
	public void destroy() {
		System.out.print("destroy Method \n");
	}

}
