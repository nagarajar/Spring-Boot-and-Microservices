package com.app.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// Spring Life Cycle Achieve by using pre-defined interface
public class ExcelExportService implements InitializingBean, DisposableBean
{
	private String fileName;
	private String mode;
	

	public ExcelExportService() {
		super();
		System.out.println("FROM CONSTRUCTOR");
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		System.out.println("FROM SETTER METHOD");
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@Override
	public String toString() {
		return "ExcelExportService [fileName=" + fileName + ", mode=" + mode + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		//lot of code...
				System.out.println("FROM INIT METHOD");
		
	}

	@Override
	public void destroy() throws Exception {
		//some code..
		System.out.println("FROM DESTORY METHOD");
		
	}
	
}
