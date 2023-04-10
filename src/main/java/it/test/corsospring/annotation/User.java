package it.test.corsospring.annotation;

public class User {

	private Phonr phonr;

	public User(Phonr phonr) {
		super();
		this.phonr = phonr;
	}

	public String getInfoUser() {
		return "Nicola Carlucci" + phonr.getPhone();
	}

}
