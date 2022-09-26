package com.app.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class MyService 
{
	@Value("SAMPLE DATA")
	private String code;

	@Override
	public String toString() {
		return "MyService [code=" + code + "]";
	}
}
