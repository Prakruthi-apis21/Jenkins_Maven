package com.dao;

import org.springframework.stereotype.Component;

@Component("wl")
public class WelcomeImpl implements Welcome{

	@Override
	public String sayWelcome(String name) {
		 
		return "Hey "+name  + " Welcome to AOP";
	}

	@Override
	public void sayHello() {
		System.out.println("Called in sayHello Method");
		
	}

}
