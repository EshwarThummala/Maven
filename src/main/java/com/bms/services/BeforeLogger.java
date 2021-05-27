package com.bms.services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeLogger implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target) throws Throwable
	{
		String name = method.getName();
		Log log = LogFactory.getLog(target.getClass());
		if(name.equals("depositMoney"))
		{
			log.info("Request Generated to Deposit Money :"+args[0]);
		}
		else if(name.equals("withDrawMoney"))
		{
			log.info("Request Generated to WithDraw Money :"+args[0]);
		}
	}

}
