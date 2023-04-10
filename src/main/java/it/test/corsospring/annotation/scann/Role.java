package it.test.corsospring.annotation.scann;

import org.springframework.stereotype.Component;

@Component(value = "role")
public class Role {

	public String getRole() {
		return "superAdmin";
	}

}
