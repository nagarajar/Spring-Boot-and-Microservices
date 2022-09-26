package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.app")
public class MyAppConfig
{
	@Bean
	@Primary
	public MyRepository m1() {
		MyRepository m1 = new MyRepository();
		m1.setCode("A");
		return m1;
	}
	
	@Bean
	public MyRepository m2() {
		MyRepository m2 = new MyRepository();
		m2.setCode("B");
		return m2;
	}
}
