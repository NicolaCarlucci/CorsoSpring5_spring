package it.test.corsospring.autowired;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component(value = "prodottoAutoWired")
public class ProdottoServiceAutoWired {

	public String getProdotto() {
		return String.valueOf(new Date().getTime()) + "Prodotto";
	}

}
