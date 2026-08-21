package com.example.architecture.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Chef {
	//의존성
	//어떤 클래스가 다른 클                                      
	//의존성 주입
	//클래스가 필요한 객체를 직접생성하지 않고 외부에서 전달받는 방식
	//요리사는 칼이 필요하다->요리사는 칼에 의존성이 있다
	
	//필드주입
	//멤버변수에 직접 객체를 주입하는 방식
	@Autowired                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	private Knife knife;
	
	//knife = new Kitchenknife();
	
	public void cook() {
		System.out.println("요리를 시작합니다");
		knife.cut();
	}
}


































