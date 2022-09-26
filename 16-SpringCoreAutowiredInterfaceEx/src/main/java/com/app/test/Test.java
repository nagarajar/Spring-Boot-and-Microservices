package com.app.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.MyAppConfig;
import com.app.invoke.Format;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		Format fob = ac.getBean("format",Format.class);
		fob.printFormat();
	}

}
