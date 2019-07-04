package com.ioc;

import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.spring.ioc.entity.StudentEntity;
import com.lovo.spring.ioc.entity.TeacherEntity;
import com.lovo.spring.ioc.service.IStudentService;

public class TIOC {
	 ClassPathXmlApplicationContext app=null;

	 @Before
  public void before() {
	  app=new ClassPathXmlApplicationContext("application.xml");
	  
  }
  @Test
  public void testStudent() {
	  
	IStudentService s= (IStudentService)app.getBean("studentService");
     
	try {
	StudentEntity stu=	s.getStudent("zy11");
	System.out.println(stu.getStudentName());
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  @Test
  public void tscope() {
	StudentEntity s=  (StudentEntity) app.getBean("studentEntity");
	StudentEntity s1=  (StudentEntity) app.getBean("studentEntity");
	StudentEntity s2=  (StudentEntity) app.getBean("studentEntity");
	StudentEntity s3=  (StudentEntity) app.getBean("studentEntity");
	System.out.println(s+"/"+s1+"/"+s2+"/"+s3);
          app.destroy();
         app.close();
	
  }
}
