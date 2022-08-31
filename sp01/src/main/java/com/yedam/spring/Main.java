package com.yedam.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		TV tv = (TV)ctx.getBean("tv");
		tv.on();
		
		TV tv1 = (TV)ctx.getBean("tv1");
		tv1.on();
	}

}
