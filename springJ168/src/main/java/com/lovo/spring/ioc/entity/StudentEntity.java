package com.lovo.spring.ioc.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="studentEntity")
@Scope("prototype")
public class StudentEntity {
  
	private String studentName;
	private TeacherEntity teacher;
	
	public StudentEntity() {}
	public StudentEntity(String studentName, TeacherEntity teacher) {
		super();
		this.studentName = studentName;
		this.teacher = teacher;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public TeacherEntity getTeacher() {
		return teacher;
	}
	public void setTeacher(TeacherEntity teacher) {
		this.teacher = teacher;
	}
	
	
	
	public void init() {
		System.out.println("init...");
	}
	public void destory() {
		System.out.println("destory...");
	}

}
