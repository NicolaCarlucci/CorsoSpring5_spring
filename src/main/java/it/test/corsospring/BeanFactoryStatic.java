package it.test.corsospring;

public class BeanFactoryStatic {

	private static ProdottoService prodotto = new ProdottoService();

	private static OrdineService ordine = new OrdineService();

	public static ProdottoService getProdottoService() {
		return prodotto;
	}

	public static OrdineService getOrdineService() {
		return ordine;
	}
}
