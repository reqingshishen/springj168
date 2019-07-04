package com.lovo.spring.ioc.entity;

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
	
	
}
