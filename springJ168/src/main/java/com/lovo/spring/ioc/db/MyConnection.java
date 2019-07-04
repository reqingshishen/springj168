package com.lovo.spring.ioc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	private String driverClassName;
	private String url;
	private String password;
	private String userName;

	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		//加载驱动
		Class.forName(driverClassName);
		//返回数据库链接
	  return	DriverManager.getConnection(url, userName, password);
		
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
