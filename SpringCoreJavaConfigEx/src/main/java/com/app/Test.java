package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		 ApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		 DriverManager dm = ac.getBean("driverManager",DriverManager.class);
		 System.out.println(dm);
	}
}
