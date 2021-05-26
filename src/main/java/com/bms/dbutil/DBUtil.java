package com.bms.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtil 
{
	private Properties props;
	public void setProps(Properties props)
	{
		this.props = props;
	}
	public Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(props.getProperty("url"),props.getProperty("username"),props.getProperty("password"));
	}
}
