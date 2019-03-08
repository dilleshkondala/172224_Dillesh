package com.org.LoggingAspect;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("execution(* *(..))")
	public void loadingAdvice() {
		System.out.println("Aspect is Running....");
		LogManager lgmngr = LogManager.getLogManager();
		Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);
		log.log(Level.INFO, "This is Add employee");
		System.out.println("Adding Employee.....");

	}

//	@Pointcut("execution(* *(..))")
//	public void allMethods() {
//		System.out.println("PointCut....");
//
//	}

}
