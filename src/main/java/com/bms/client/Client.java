package com.bms.client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bms.beans.GreetingsImpl;
public class Client 
{
	public static void main(String args[]) throws Exception
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		GreetingsImpl g = ctx.getBean("obj",GreetingsImpl.class);
		g.greetingMessage();
		if(g.storeData())
		{
			System.out.println("Data successfully uploaded");
		}
	}
}
