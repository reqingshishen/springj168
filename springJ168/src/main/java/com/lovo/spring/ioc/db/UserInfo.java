package com.lovo.spring.ioc.db;

import java.util.HashMap;
import java.util.Map;
/**
 * 模拟用户实现框架提供的接口
 * @author Administrator
 *
 */
public class UserInfo implements IDBInfo {


	public Map<String, String> intoConnectionInfo() {
		 Map<String, String>  map=new HashMap<>();
		 map.put("user","root");
		 map.put("password","123456");
		 map.put("url","jdbc:mysql://localhost:3306/j168");
		return map;
	}

}
