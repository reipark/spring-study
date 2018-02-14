package com.javalec.di.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println("Name ? " + student1.getName());
		System.out.println("Age ? " + student1.getAge());
		System.out.println("Hobbys ? " + student1.getHobbys().toString());
		System.out.println("Height ? " + student1.getHeight());
		System.out.println("Weight ? " + student1.getWeight());
		
		Student student2 = ctx.getBean("student2", Student.class);
		System.out.println("Name ? " + student2.getName());
		System.out.println("Age ? " + student2.getAge());
		System.out.println("Hobbys ? " + student2.getHobbys().toString());
		System.out.println("Height ? " + student2.getHeight());
		System.out.println("Weight ? " + student2.getWeight());
	}

}
