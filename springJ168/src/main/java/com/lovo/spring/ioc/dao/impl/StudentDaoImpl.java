package com.lovo.spring.ioc.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.lovo.spring.ioc.dao.IStudentDao;
import com.lovo.spring.ioc.db.MyConnection;
import com.lovo.spring.ioc.entity.StudentEntity;
//持久层的注解
@Repository(value="studentDao")
public class StudentDaoImpl implements IStudentDao {
   //持有DB对象。等着spring注入
	@Autowired
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

	


	
	
}
