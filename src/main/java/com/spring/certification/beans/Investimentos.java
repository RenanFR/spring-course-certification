package com.spring.certification.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Investimentos {
	
	@Autowired
	private Investidor investidor;
	
	public void investir() {
		
		System.out.println(investidor.aplicar());
		
	}

}
