package it.test.corsospring;

public class OrdineService {

	private ProdottoService prodotto;

	public String hello() {
		return "ciao Nik";
	}

	public String[] printAllProducts() {
		return prodotto.getListProducts();
	}

	public ProdottoService getProdotto() {
		return prodotto;
	}

	public void setProdotto(ProdottoService prodotto) {
		this.prodotto = prodotto;
	}

}
