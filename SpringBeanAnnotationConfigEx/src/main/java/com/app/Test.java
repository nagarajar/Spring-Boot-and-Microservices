package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.test.MyCacheData;

import my.app.HandleInfo;
import my.one.format.ViewResolver;

public class Test 
{
	public static void main(String[] args) {
		
		//1. first create empty container
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
//		// 2. find all classes from given basePackage(package and sub-package)
//		ac.scan("my.app");
//		// 3. refresh spring container
//		ac.refresh();
		//4. read object
		HandleInfo h1 = ac.getBean("hob",HandleInfo.class);
		//5. print object
		System.out.println(h1);
		
		//try to invoke the beans from other packages
		EmailConfig eb = ac.getBean("eob",EmailConfig.class);
		System.out.println(eb);
		
		MyCacheData mc = ac.getBean("cob",MyCacheData.class);
		System.out.println(mc);
		
		ViewResolver vr = ac.getBean("vr",ViewResolver.class);
		System.out.println(vr);
	}
}
