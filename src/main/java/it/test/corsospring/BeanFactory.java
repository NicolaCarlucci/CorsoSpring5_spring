package it.test.corsospring;

public class BeanFactory {

	private ProdottoService prodotto = new ProdottoService();

	private OrdineService ordine = new OrdineService();

	public ProdottoService getProdottoService() {
		return prodotto;
	}

	public OrdineService getOrdineService() {
		return ordine;
	}

}
