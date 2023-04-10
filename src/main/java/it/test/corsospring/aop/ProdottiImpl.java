package it.test.corsospring.aop;

import java.util.ArrayList;
import java.util.List;

public class ProdottiImpl implements Prodotto {

	public String getProdotto() {
		return "Realme";
	}

	public List<String> getProdotti() {
		List<String> products = new ArrayList<String>();
		products.add("prod1");
		products.add("prod2");
		products.add("prod3");
		return products;
	}

}
