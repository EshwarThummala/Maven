package com.bms.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BankAccount 
{
	private int balance;
	private String id;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int depositMoney(int amount)
	{
		//System.out.println("Entered Deposit Money Method");
		if(id.equals("hdfc123"))
		{
			this.balance += amount;
			return this.balance;
		}
		return -1;
	}
	public int withDrawMoney(int amount)
	{
		if(id.equals("hdfc123"))
		{
			this.balance -= amount;
			return this.balance;
		}
		return -1;
	}
}
