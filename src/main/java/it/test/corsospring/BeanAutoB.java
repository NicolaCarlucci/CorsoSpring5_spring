package it.test.corsospring;

public class BeanAutoB {

	private BeanAutoA beanAutoA;
	private BeanAutoC beanAutoC;

	public String saluto() {
		return (" Classe Bean Auto B" + beanAutoA.saluto() + beanAutoC.saluto());
	}

	public void setBeanAutoA(BeanAutoA beanAutoA) {
		this.beanAutoA = beanAutoA;
	}

	public void setBeanAutoC(BeanAutoC beanAutoC) {
		this.beanAutoC = beanAutoC;
	}

}
