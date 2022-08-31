package com.yedam.spring;

import org.springframework.stereotype.Component;

@Component("tv1")
public class LGTV implements TV {

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("스마트 티비를 켭니다.");
	}

}
