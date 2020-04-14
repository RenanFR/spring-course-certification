package com.spring.certification.beans.report;

import java.util.List;

public class ProductFactory {
	
	public static List<Product> mockData() {
		return List.of(
				new Product("Resident Evil 3", 243.97, "Jogo"), 
				new Product("Dragon Ball Z Kakarot", 229.90, "Jogo"), 
				new Product("Mouse", 159, "Equipamento"),
				new Product("Guia científico sobre como parar de procrastinar", 7.99, "eBook")
		);
	}

}
