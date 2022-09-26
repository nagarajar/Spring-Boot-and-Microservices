package com.app;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("t1")
@Scope("prototype")
//@Lazy
public class Token 
{
	@Value("20")
	private int code;

	public Token() {
		super();
		System.out.println("Constructor Calling");
		code = Math.abs( new Random().nextInt() );
	}
	

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Token [code=" + code + "]";
	}
	
	
}
