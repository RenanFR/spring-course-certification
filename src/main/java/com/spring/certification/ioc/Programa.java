package com.spring.certification.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.certification.beans.Investimentos;

public class Programa {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Escaneamento.class);
		context.refresh();
		Investimentos investidor = context.getBean(Investimentos.class);
		investidor.investir();
		context.close();
	}

}
