package it.test.corsospring.aop;

import java.util.List;

public class ProdottoProxy implements Prodotto {

	private Prodotto prodotto;

	public ProdottoProxy(Prodotto prodotto) {
		super();
		this.prodotto = prodotto;
	}

	public String getProdotto() {
		return prodotto.getProdotto();
	}

	public List<String> getProdotti() {
		return prodotto.getProdotti();
	}

}
