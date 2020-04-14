package com.spring.certification.ioc.report;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.spring.certification.beans.report.ReportService;

public class ReportApplication {
	
	public static void main(String[] args) {
		try {
			AnnotationConfigApplicationContext context 
				= new AnnotationConfigApplicationContext("com.spring.certification.beans.report");
			ReportService reportService = context.getBean(ReportService.class);
			reportService.print();
			context.close();
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Bean
	public PropertySourcesPlaceholderConfigurer propertySources() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}
