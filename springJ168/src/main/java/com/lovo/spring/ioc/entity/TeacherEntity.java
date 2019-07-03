package com.lovo.spring.ioc.entity;

import java.util.List;

public class TeacherEntity {

	private String teacherName;
	private String teacherClass;
	private List<StudentEntity> listStu;
	
	
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherClass() {
		return teacherClass;
	}
	public void setTeacherClass(String teacherClass) {
		this.teacherClass = teacherClass;
	}
	public List<StudentEntity> getListStu() {
		return listStu;
	}
	public void setListStu(List<StudentEntity> listStu) {
		this.listStu = listStu;
	}
	
	
	
}
