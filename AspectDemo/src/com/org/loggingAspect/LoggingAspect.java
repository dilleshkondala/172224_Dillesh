package com.org.loggingAspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	@Before("dillesh()")
	public void loggingAdvice1()
	{
		System.out.println("1Advice run..Get method called");
	}
	
	@Before("dillesh1()")
	public void loggingAdvice2()
	{
		System.out.println("2Advice run..Get method called");
	}
	
	@Pointcut("execution(* get*())")
	public void dillesh() {}
	
	@Pointcut("execution(* get*())")
	public void dillesh1() {}
}
