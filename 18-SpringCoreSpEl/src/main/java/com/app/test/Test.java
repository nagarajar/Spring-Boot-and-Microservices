package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.MyAppConfig;
import com.app.model.Process;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		Process pob = ac.getBean("process",Process.class);
		System.out.println(pob);
	}
}
