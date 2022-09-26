package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		
		System.out.println("Before Creating Container");
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("After Creating Container");
		Token tob1 = ac.getBean("t1", Token.class);
		System.out.println(tob1+"  HashCode : "+tob1.hashCode());
		Token tob2 = ac.getBean("t1", Token.class);
		System.out.println(tob2+"  HashCode : "+tob2.hashCode());
	}
}
