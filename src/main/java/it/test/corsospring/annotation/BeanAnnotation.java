package it.test.corsospring.annotation;

import org.springframework.stereotype.Component;

@Component
public class BeanAnnotation {

	public void saluto() {
		System.out.println(" Bean Annotation");
	}

}
