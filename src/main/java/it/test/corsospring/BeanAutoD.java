package it.test.corsospring;

public class BeanAutoD {

	private BeanAutoC bean;

	public String saluto() {
		return (" Classe Bean Auto D" + bean.saluto());
	}

	public void setBean(BeanAutoC bean) {
		this.bean = bean;
	}

}
