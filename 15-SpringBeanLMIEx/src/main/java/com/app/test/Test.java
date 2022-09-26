package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.MyAppConfig;
import com.app.model.Token;
import com.app.service.TokenService;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		
		System.out.println("reading first time");
		TokenService ts1 = ac.getBean("tokenService", TokenService.class);
		Token tk1 = ts1.getToken();
		System.out.println("HashCodets1: "+ts1.hashCode()+" "+tk1+" HashCodetk1: "+tk1.hashCode());
		
		System.out.println("reading 2nd time");
		TokenService ts2 = ac.getBean("tokenService",TokenService.class);
		Token tk2 = ts2.getToken();
		System.out.println("HashCodets2: "+ts2.hashCode()+" "+tk2+" HashCodetk2: "+tk2.hashCode());

		System.out.println("reading 3rd time");
		TokenService ts3 = ac.getBean("tokenService",TokenService.class);
		Token tk3 = ts3.getToken();
		System.out.println("HashCodets3: "+ts3.hashCode()+" "+tk3+" HashCodetk3: "+tk3.hashCode());
	}
	
	public static void main1(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		//reading first time
		TokenService ts1 = ac.getBean("tokenService",TokenService.class);
		Token tk1 = ts1.getToken();
		System.out.println(ts1.hashCode() + " " + tk1.hashCode());

		//reading 2nd time
		TokenService ts2 = ac.getBean("tokenService",TokenService.class);
		Token tk2 = ts2.getToken();
		System.out.println(ts2.hashCode() + " " + tk2.hashCode());

		//reading 3rd time
		TokenService ts3 = ac.getBean("tokenService",TokenService.class);
		Token tk3 = ts3.getToken();
		System.out.println(ts3.hashCode() + " " + tk3.hashCode());
	}
}

