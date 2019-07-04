package com.lovo.spring.ioc.service.impl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.spring.ioc.dao.IStudentDao;
import com.lovo.spring.ioc.entity.StudentEntity;
import com.lovo.spring.ioc.service.IStudentService;

@Service(value="studentService")
public class StudentServiceImpl implements IStudentService {

	//持有DAO
	@Autowired //按照类型来注入
    private	IStudentDao studentDao;
    
	public StudentEntity getStudent(String userName) throws ClassNotFoundException, SQLException {
          
		return studentDao.getStudent(userName);
	}


	
	
}
