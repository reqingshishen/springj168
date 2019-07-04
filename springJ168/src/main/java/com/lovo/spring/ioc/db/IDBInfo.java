package com.lovo.spring.ioc.db;

import java.util.Map;

/**
 * 开放给用户的接口
 * @author Administrator
 *
 */
public interface IDBInfo {
     /**
      * 
      * @return 链接数据库信息d
      */
	public Map<String,String> intoConnectionInfo();
}
