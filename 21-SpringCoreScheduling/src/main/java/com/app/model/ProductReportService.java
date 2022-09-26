package com.app.model;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ProductReportService 
{
	//@Scheduled(fixedDelay = 2000) //in milli sec, 1000 = 1 sec
	//@Scheduled(fixedDelayString = "2000") //use incase if this num is too lengthy
	//@Scheduled(fixedRate = 2000)
	//@Scheduled(cron = "10 * * * * *") // every min at 10th sec
	@Scheduled(cron = "*/10 * * * * *") // every 10th sec
	public void generateReport()
	{
		System.out.println("HELLO "+ new Date());
	}
}
