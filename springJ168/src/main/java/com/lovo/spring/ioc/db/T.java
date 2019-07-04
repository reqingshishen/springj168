package com.lovo.spring.ioc.db;

import java.sql.Connection;

public class T {

	public static void main(String[] args) {
		
		//获得用户实现的接口
		IDBInfo info=new UserInfo();
		//调用框架
		DBUtil db=new DBUtil();
		//把用户实现的接口传回到框架
	Connection conn=	db.getConncetion(info);
		System.out.println(conn);

	}

}
