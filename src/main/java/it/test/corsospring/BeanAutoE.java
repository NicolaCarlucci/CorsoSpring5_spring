package it.test.corsospring;

public class BeanAutoE {

	private BeanAutoC bean;

	public BeanAutoE(BeanAutoC bean) {
		super();
		this.bean = bean;
	}

	public String saluto() {
		return (" Classe Bean Auto E" + bean.saluto());
	}

}
