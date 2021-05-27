package com.bms.services;

import java.lang.reflect.Method;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;

public class AfterLogger implements AfterReturningAdvice
{

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
	
		String name = method.getName();
		Log log = LogFactory.getLog(target.getClass());
		if(name.equals("depositMoney"))
		{		
			log.info("Request Completed Deposited Money :"+args[0]);
		}
		else if(name.equals("withDrawMoney"))
		{
			log.info("Request Completed Withdrawn Money :"+args[0]);
		}
	}

}
