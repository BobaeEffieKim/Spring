package com.yedam.spring;

import org.springframework.stereotype.Component;

@Component("tv")
public class SamsungTV implements TV {
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("스프링 방식으로");
	}

}
