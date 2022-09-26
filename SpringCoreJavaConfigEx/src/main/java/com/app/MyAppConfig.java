package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class MyAppConfig 
{
	@Autowired
	private Environment env;
	
	@Bean
	public DriverManager driverManager()
	{
		DriverManager dm = new DriverManager();
		/*
		 * dm.setDriverClass("ORACLE"); 
		 * dm.setUrl("JDBC:ORACLE");
		 */
		dm.setDriverClass(env.getProperty("my.driver"));
		dm.setUrl(env.getProperty("my.url"));
		return dm;
	}
}
