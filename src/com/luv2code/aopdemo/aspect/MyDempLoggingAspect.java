package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDempLoggingAspect {

	// add related advices for logging
	
	// start with @Before advice
	
	
	@Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	
	
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n======>>>>> Executing @Before advice on method");
		
	}
	
	
}
