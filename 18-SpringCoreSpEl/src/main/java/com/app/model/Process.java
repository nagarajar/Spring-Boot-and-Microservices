package com.app.model;

import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Process 
{
	//@Value("28")
	//@Value("#{ 2 + 3}")
	//@Value("#{ 'hello gm'.length() }")
	//@Value("#{ new java.util.Random().nextInt()}")
	//@Value("#{ T(java.lang.Math).abs(-9)}")
	//@Value("#{ T(java.lang.Math).abs(new java.util.Random().nextInt())}")
	//@Value("#{ 'hello'.length() > 0 ? 55 : 45 }")
	//@Value("#{ modelData.model.length() }")
	//private int code;
	@Value("#{ modelData.model.toLowerCase() }")
	private String code;
	
	//@Value("false")
	//@Value("#{ new java.util.Random().nextInt() > 5 ? true:false}")
	//@Value("#{ new java.util.Random().nextInt() > 5 }")
	//@Value("#{ new java.util.Random().nextInt() gt 5 }")
	//@Value(" #{ 5 % 2 > 0 && 2 + 3 le 5  }")
	@Value(" #{ 5 % 2 > 0 and 2 + 3 le 5  }")
	private boolean isPresent;


	//1. String to char[]
	@Value(" #{ modelData.model.toCharArray() }")
	private char[] data;
	
	@Value(" #{ 'Hello Users!'.toCharArray() }")
	private char[] charData;
		
	
	//2. String to byte[]
	
	@Value(" #{ modelData.model.getBytes() }")
	private byte[] arr;
	
	@Value(" #{ 'Hello Users!'.getBytes() }")
	private char[] byteData;
	
	//3. Any type to Stream
	 
	@Value("#{modelData.model.lines()}")
	private Stream<String> stream;

	@Override
	public String toString() {
		return "Process [code=" + code + ", isPresent=" + isPresent + ", data=" + Arrays.toString(data) + ", charData="
				+ Arrays.toString(charData) + ", arr=" + Arrays.toString(arr) + ", byteData="
				+ Arrays.toString(byteData) + ", stream=" + stream + "]";
	}
	
	

	
	
	
}
