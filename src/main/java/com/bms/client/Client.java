package com.bms.client;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bms.beans.BankAccount;
public class Client 
{
	public static void main(String args[]) throws Exception
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		//BankAccount b = ctx.getBean("proxy",BankAccount.class);
		BankAccount b = ctx.getBean("bacc",BankAccount.class);
		System.out.println("Money With Drawed,Total Balance: "+b.withDrawMoney(1000));
		System.out.println("Money Deposited, Total Balance: "+b.depositMoney(2000));
	}
}
