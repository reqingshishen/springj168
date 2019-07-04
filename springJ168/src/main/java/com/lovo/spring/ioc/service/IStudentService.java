package com.lovo.spring.ioc.service;

import java.sql.SQLException;

import com.lovo.spring.ioc.entity.StudentEntity;

public interface IStudentService {

	 /**
     * 根据名字获取学生对象
     * @param userName
     * @return
     * @throws SQLException 
     * @throws ClassNotFoundException 
     */
	public StudentEntity getStudent(String userName) throws ClassNotFoundException, SQLException;
}
