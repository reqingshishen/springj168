package com.lovo.spring.ioc.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lovo.spring.ioc.dao.IStudentDao;
import com.lovo.spring.ioc.db.MyConnection;
import com.lovo.spring.ioc.entity.StudentEntity;

public class StudentDaoImpl implements IStudentDao {
   //持有DB对象。等着spring注入
	private MyConnection myConnection;
	
	public StudentEntity getStudent(String userName) throws ClassNotFoundException, SQLException {
		StudentEntity stu=new StudentEntity();
	      //获得数据库链接
		Connection conn=	myConnection.getConnection();
	     //sql
		String sql="select * from sys_student where login_name='"+userName+"'";
		
		ResultSet set= conn.createStatement().executeQuery(sql);
		while(set.next()) {
			stu.setStudentName(set.getString("student_name"));
		}
		return stu;
	}

	
	public MyConnection getMyConnection() {
		return myConnection;
	}

	public void setMyConnection(MyConnection myConnection) {
		this.myConnection = myConnection;
	}

	
	
}
