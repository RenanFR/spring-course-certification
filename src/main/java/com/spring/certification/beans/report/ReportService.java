package com.spring.certification.beans.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class ReportService {
	
	@Value("${reportFormat}")
	private String format;
	
	public void print() throws FileNotFoundException, JRException {
		
		File reportFile = ResourceUtils.getFile("classpath:products-report.jrxml");
		JasperReport jasperReport = JasperCompileManager.compileReport(reportFile.getAbsolutePath());
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(ProductFactory.mockData());
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("author", "Renan Rodrigues");
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		if (format.equals("html")) {
			JasperExportManager.exportReportToHtmlFile(jasperPrint, "C:\\tmp\\report\\products-report.html");
		} else if (format.equals("pdf")) {
			JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\tmp\\report\\products-report.pdf");
		}
	}
	
}
