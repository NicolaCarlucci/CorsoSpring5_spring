package it.test.corsospring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.test.corsospring.annotation.scann.Role;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		config();
		configScan();
	}

	private static void config() {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = context.getBean("userBean", User.class);
		System.out.print(user.getInfoUser());
	}

	private static void configScan() {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigScan.class);
		Role role = context.getBean("role", Role.class);
		System.out.print(role.getRole());
	}

}
