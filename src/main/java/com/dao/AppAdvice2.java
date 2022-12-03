package com.dao;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AppAdvice2 implements Ordered{
	
	@Before(value = "execution(* com.dao.Welcome.sayWelcome(..))")
	public void callBefore() {
		System.out.println("applying security");
	}
 
	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	 

}
