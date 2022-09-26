package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.MyAppConfig;
import com.app.model.ProductReportService;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		//ProductReportService ps = ac.getBean("productReportService",ProductReportService.class);
		ProductReportService prs = ac.getBean(ProductReportService.class); //if only one object present in container
		
	}
}
