package com.javalec.di.namespace;

import com.javalec.di.namespace.Student;

public class StudentInfo {

	private Student student;
	
	public StudentInfo(Student student) {
		this.student = student;
	}
	
	public void getStudentInfo() {
		if (this.student != null) {
			System.out.println("Name : " + this.student.getName());
			System.out.println("Age : " + this.student.getAge());
			for (String hobby : student.getHobbys()) {
				System.out.println("Hobby : " + hobby);
			}
			System.out.println("Height : " + this.student.getHeight());
			System.out.println("Weight : " + this.student.getWeight());
		}
	}
	
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
