package it.test.corsospring.aop;

public class Main {

	public static void main(String[] args) {
		ProdottoProxy prodottoProxy = new ProdottoProxy(new ProdottiImpl());

		System.out.println(prodottoProxy.getProdotto());

	}

}
