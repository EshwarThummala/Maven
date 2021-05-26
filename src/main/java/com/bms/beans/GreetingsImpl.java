package com.bms.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import com.bms.dbutil.DBUtil;

//https://onlinegdb.com/NyZOBsTYl
public class GreetingsImpl implements Greetings {

	public int id;
	public String name;
	public double salary;
	public DBUtil db;
	@Required
	public void setId(int id) 
	{
		this.id = id;
	}
	@Required
	public void setName(String name) 
	{
		this.name = name;
	}
	@Autowired
	public void setDb(DBUtil db)
	{
		this.db = db;
	}
	@Required
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public void greetingMessage()
	{
		System.out.println("id = "+this.id);
		System.out.println("Name = "+this.name);
		System.out.println("Salary = "+this.salary);
	}
	public boolean storeData() throws Exception
	{
		Connection con = db.getConnection();
		String que = "insert into greetings values(?,?,?)";
		PreparedStatement pt = con.prepareStatement(que);
		pt.setInt(1,this.id);
		pt.setString(2, this.name);
		pt.setDouble(3, this.salary);
		int no = pt.executeUpdate();
		if(no == 1)
		{
			return true;
		}
		return false;
	}

}
