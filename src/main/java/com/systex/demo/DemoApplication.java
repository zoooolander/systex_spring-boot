package com.systex.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import com.systex.demo.model.*;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.systex.model"})
//public class DemoApplication implements CommandLineRunner{
public class DemoApplication implements ApplicationRunner{
	
	@Autowired
	private Product product;
	
	public static void main(String[] args) {
		System.out.println("start spring boot application");
		SpringApplication.run(DemoApplication.class, args);// run這個class的bytecode
		System.out.println("end spring boot application");
	}
	
	@Bean
	@Scope("protopyte")
	public Product function() {
		Product product = new Product();
		product.setId(10001);
		product.setName("elderflower syrup");
		product.setDescription("food");
		return product;
	}
	
//	@Override
//	public void run(String... args) throws Exception{
//		//glue code
////		ApplicationContext container = new AnnotationConfigApplicationContext(DemoApplication.class); 
////		Product p1 = container.getBean(Product.class);
////		Product p2 = container.getBean(Product.class);
////		System.out.println(p1);
////		System.out.println(p2);
////		System.out.println(p1==p2);
//		System.out.println(product.getId());
//		System.out.println(product.getName());
//		System.out.println(product.getDescription());
//		
//	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception{
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getDescription());
		
	}

}
