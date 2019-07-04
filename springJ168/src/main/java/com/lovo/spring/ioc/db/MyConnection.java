package com.lovo.spring.ioc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyConnection {

	private String driverClassName;
	private String url;
	private String password;
	private String userName;

   private	Properties prop;
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		System.out.println(driverClassName);
		
		//加载驱动
		Class.forName(prop.getProperty("driverClassName"));
		//返回数据库链接
	  return	DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("userName") , prop.getProperty("password") );
		
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}
	
	
	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
