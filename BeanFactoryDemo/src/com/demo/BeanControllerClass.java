package com.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanControllerClass {
	public static void main(String args[]) {
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
		Student student = (Student) abstractApplicationContext.getBean("mybeanid");
		System.out.println(student.getStudentname());
	}

}
