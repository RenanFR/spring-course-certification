package com.spring.certification.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.certification.beans.Investidor;

public class Programa {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Escaneamento.class);
		context.refresh();
		Investidor investidor = context.getBean(Investidor.class);
		System.out.println(investidor.aplicar());
		context.close();
	}

}
