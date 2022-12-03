package com.dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WelcomeMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		Welcome welcome=(Welcome)ctx.getBean("wl");
		
		System.out.println(welcome.sayWelcome("Amar"));
		welcome.sayHello();
	}

}
