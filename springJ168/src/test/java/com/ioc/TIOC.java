package com.ioc;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.spring.ioc.entity.StudentEntity;
import com.lovo.spring.ioc.entity.TeacherEntity;

public class TIOC {

  @Test
  public void testTeacher(){
	//启动spring
	  ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext("application.xml");
	 //从容器中获取我们需要的对象根据ID
	TeacherEntity t=  (TeacherEntity) app.getBean("teacher");
	List<StudentEntity> list=t.getListStu();
	System.out.println(list.size());
  }
  
  @Test
  public void testStudent(){
	//启动spring
	  ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext("application.xml");
	StudentEntity stu=  (StudentEntity) app.getBean("student");
	System.out.println(stu.getTeacher().getTeacherName());
  }
}
