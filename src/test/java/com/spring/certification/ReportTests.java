package com.spring.certification;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.nio.file.Paths;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.certification.beans.report.ReportService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ReportService.class)
public class ReportTests {
	
	@Autowired
	private ReportService service;
	
	static {
		System.setProperty("reportFormat", "pdf");
	}
	
	@Test
	public void shouldGenerateReport() {
		try {
			service.print();
			File folder = Paths.get("C:", "tmp", "report").toFile();
			assertTrue(folder.isDirectory() && folder.length() != 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
