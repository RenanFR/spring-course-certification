package com.spring.certification.beans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("baixo-risco")
public class Conservador implements Investidor {

	@Override
	public String aplicar() {
		return "Aplicando em renda fixa e títulos públicos";
	}
	
}
