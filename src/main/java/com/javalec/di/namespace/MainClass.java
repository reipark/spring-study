package com.javalec.di.namespace;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.javalec.di.namespace.StudentInfo;

public class MainClass {
	
	public static void main(String[] args) {
		String configuration = "classpath:applicationContext-namespace.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configuration);
		
		// 이건 일반적인 방법
		StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
		System.out.println("========== no use namespace ==========");
		studentInfo.getStudentInfo();
		
		// 이건 namespace 를 사용한 방법
		Family family = ctx.getBean("family", Family.class);
		System.out.println("========== use namespace ==========");
		System.out.println("father : " + family.getFather());
		System.out.println("mother : " + family.getMother());
		System.out.println("sister : " + family.getSister());
		System.out.println("brother : " + family.getBrother());
		
	}

}
