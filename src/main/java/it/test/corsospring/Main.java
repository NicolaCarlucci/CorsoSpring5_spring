package it.test.corsospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.test.corsospring.annotation.BeanAnnotation;
import it.test.corsospring.autowired.OrdineServiceAutoWired;

public class Main {

	public static void main(String[] args) {
//		annotationConfig();
//		xmlConfig();
//		xmlConfigFactoryStatic();
//		xmlConfigFactory();
		// xmlConfigVariabili();
		// DIConstructor();
		// dependsOn();
		// beansLazy();
		// beansAutowire();
		// beansProperty();
		// beansPropertyContext();
		// beansAnnotation();
		beansAutowired();
	}

	public static void annotationConfig() {
		System.out.println("annotationConfig");
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		OrdineService ordine = context.getBean("ordine", OrdineService.class);

		String saluto = ordine.hello();

		System.out.println(saluto);
	}

	public static void xmlConfig() {
		System.out.println("xmlConfig");
		ApplicationContext context = new ClassPathXmlApplicationContext("\\beans.xml");

		OrdineService ordine = context.getBean("ordine", OrdineService.class);

		String saluto = ordine.hello();

		System.out.println(saluto);
	}

	public static void xmlConfigFactoryStatic() {
		System.out.println("xmlConfigFactory static");
		ApplicationContext context = new ClassPathXmlApplicationContext("\\beans-factory-static.xml");

		OrdineService ordineService = context.getBean("ordine", OrdineService.class);

		ProdottoService prodottoService = context.getBean("prodotto", ProdottoService.class);

		String ordine = ordineService.hello();

		String prodotto = prodottoService.hello();

		System.out.println(ordine);
		System.out.println(prodotto);
	}

	public static void xmlConfigFactory() {
		System.out.println("xmlConfigFactory");
		ApplicationContext context = new ClassPathXmlApplicationContext("\\beans-factory.xml");

		OrdineService ordineService = context.getBean("ordine", OrdineService.class);

		ProdottoService prodottoService = context.getBean("prodotto", ProdottoService.class);

		String ordine = ordineService.hello();

		String prodotto = prodottoService.hello();

		System.out.println(ordine);
		System.out.println(prodotto);
	}

	public static void xmlConfigVariabili() {
		System.out.println("xmlConfigVariabili");
		ApplicationContext context = new ClassPathXmlApplicationContext("\\beans-variabili.xml");

		ClienteService clienteService = context.getBean("cliente", ClienteService.class);

		OrdineService ordineService = context.getBean("ordine", OrdineService.class);

		System.out.println(clienteService.getHelloMessage());

		String[] products = ordineService.printAllProducts();
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i]);
		}

	}

	public static void DIConstructor() {
		System.out.println("DIConstructor");
		ApplicationContext context = new ClassPathXmlApplicationContext("\\beans-costruttore.xml");

		FatturaService fatturaService = context.getBean("fattura", FatturaService.class);

		System.out.println(fatturaService.stampaFattura());

	}

	public static void dependsOn() {
		System.out.println("dependsOn");
		ApplicationContext context = new ClassPathXmlApplicationContext("\\beans-depends.xml");

		BeanA beanA = context.getBean("beanA", BeanA.class);

		System.out.println(beanA);

	}

	public static void beansLazy() {
		System.out.println("beansLazy");
		ApplicationContext context = new ClassPathXmlApplicationContext("\\beans-lazy.xml");

		BeanLazyA beanLazyA = context.getBean("beanLazyA", BeanLazyA.class);

		beanLazyA.saluto();

		BeanLazyB beanLazyB = context.getBean("beanLazyB", BeanLazyB.class);

		beanLazyB.saluto();

	}

	public static void beansAutowire() {
		System.out.println("beansAutowire");
		ApplicationContext context = new ClassPathXmlApplicationContext("\\beans-autowire.xml");

		BeanAutoB beanAutoB = context.getBean("beanAutoB", BeanAutoB.class);

		System.out.println(beanAutoB.saluto());

		BeanAutoD beanAutoD = context.getBean("beanAutoD", BeanAutoD.class);

		System.out.println(beanAutoD.saluto());

		BeanAutoE beanAutoE = context.getBean("beanAutoE", BeanAutoE.class);

		System.out.println(beanAutoE.saluto());

	}

	public static void beansProperty() {
		System.out.println("beansProperty");
		ApplicationContext context = new ClassPathXmlApplicationContext("\\beans-properties.xml");

		BeanProperty beanProperty = context.getBean("prop", BeanProperty.class);

		beanProperty.saluto();

	}

	public static void beansPropertyContext() {
		System.out.println("beansPropertyContext");
		ApplicationContext context = new ClassPathXmlApplicationContext("\\beans-property-context.xml");

		BeanProperty beanProperty = context.getBean("prop", BeanProperty.class);

		beanProperty.saluto();

	}

	public static void beansAnnotation() {
		System.out.println("beansAnnotation");
		ApplicationContext context = new ClassPathXmlApplicationContext("\\beans-annotations.xml");

		BeanAnnotation beanAnnotation = context.getBean("beanAnnotation", BeanAnnotation.class);

		beanAnnotation.saluto();

	}

	public static void beansAutowired() {
		System.out.println("beansAnnotation");
		ApplicationContext context = new ClassPathXmlApplicationContext("\\beans-annotations.xml");

		OrdineServiceAutoWired ordineServiceAutoWired = context.getBean("ordineAutoWired",
				OrdineServiceAutoWired.class);

		System.out.println(ordineServiceAutoWired.getInfoOrdine());

	}

}
