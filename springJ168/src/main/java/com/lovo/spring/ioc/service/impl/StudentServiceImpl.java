package com.lovo.spring.ioc.service.impl;

import java.sql.SQLException;

import com.lovo.spring.ioc.dao.IStudentDao;
import com.lovo.spring.ioc.entity.StudentEntity;
import com.lovo.spring.ioc.service.IStudentService;

public class StudentServiceImpl implements IStudentService {

	//持有DAO
    private	IStudentDao studentDao;
    
	public StudentEntity getStudent(String userName) throws ClassNotFoundException, SQLException {
          
		return studentDao.getStudent(userName);
	}

	public IStudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(IStudentDao studentDao) {
		this.studentDao = studentDao;
	}

	
	
}
