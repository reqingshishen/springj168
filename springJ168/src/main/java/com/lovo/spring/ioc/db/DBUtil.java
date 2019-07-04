package com.lovo.spring.ioc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Map;

/**
 * 获得数据库链接
 * @author Administrator
 *
 */
public class DBUtil {
   
	public Connection getConncetion(IDBInfo info) {
		Connection conn=null;
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			Map<String,String> map= info.intoConnectionInfo();
			conn=	 DriverManager.getConnection(map.get("url"),map.get("user"),map.get("password"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
}
