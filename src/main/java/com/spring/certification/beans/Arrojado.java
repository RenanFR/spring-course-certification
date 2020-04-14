package com.spring.certification.beans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("alto-risco")
public class Arrojado implements Investidor {

	@Override
	public String aplicar() {
		return "Aplicando em ações e moedas criptográficas";
	}

}
