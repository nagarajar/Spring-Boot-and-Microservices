package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.MyAppConfig;
import com.app.controller.EmpController;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		EmpController ec = ac.getBean("empController", EmpController.class);
		ec.getInfo();
	}
}
