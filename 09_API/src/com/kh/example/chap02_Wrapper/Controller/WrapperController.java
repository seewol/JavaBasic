package com.kh.example.chap02_Wrapper.Controller;

public class WrapperController {
	public void method() {
		// boxing : 기본 자료형을 객체로 변환
		int num1 = 10;
		Integer integer1 = new Integer(num1); // boxing
		
		// unboxing : 객체를 기본 자료형으로 변환
		int num2 = integer1.intValue();
//		integer1을 intValue(), 언박싱 해서 변수 num2에 담음
		
		// ▼
		
		// JDK 1.5~  :: 바로바로 박싱, 언박싱 가능
		// autoBoxing
		Integer integer2 = num1;
		// auto unBoxing
		int num3 = integer2;
	}
}
