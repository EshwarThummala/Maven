package com.bms.services;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnotationBasedService
{
	public AnnotationBasedService() {
		// TODO Auto-generated constructor stub
		System.out.println("AnnotationBasedService Object Created");
	}
	@Before("execution(public int com.bms.beans.BankAccount.depositMoney(int))")
	public void beforeDeposit()
	{
		System.out.println("Request Generated to Deposit Money");
	}
	@Before("execution(public int com.bms.beans.BankAccount.withDrawMoney(int))")
	public void beforeWithDraw()
	{
		System.out.println("Request Generated to WithDraw Money");
	}
	@After("execution(public int com.bms.beans.BankAccount.depositMoney(int))")
	public void afterDeposit()
	{
		System.out.println("Request Completed to Deposit Money");
	}
	@After("execution(public int com.bms.beans.BankAccount.withDrawMoney(int))")
	public void afterWithDraw()
	{
		System.out.println("Request Completed to WithDraw Money");
	}
}
