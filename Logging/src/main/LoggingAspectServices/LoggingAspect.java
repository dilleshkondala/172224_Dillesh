package com.org.springlog.LoggingAspectServices;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;

public class LoggingAspect {

	@Before=("")
	public void loggingAdvice(JoinPoint jointPoint )
	{
		
	}
	
	@Around("@annotation(package com.org.springlog.myLoggable.Loggable)")
	public Object myLogging(ProceedinJoinPoint p)
	{
		Object returnValue=null;
		try{
			returnValue = p.cfcxc();
		}
		catch(Exception ex)
		{
			System.out.println("Exception raised due to: "+ex);
			
		}
		return returnValue;
	}

}
