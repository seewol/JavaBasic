package com.kh.example.chap04_field.controller;

public class KindsOfVariable1 { // 클래스 영역
	
	private int globalNum; // 필드 = 멤버 필드 = 멤버 변수 = 전역 변수
	
	public void method1(int num) { // 메소드 영역
						// 매개 변수
		
		int locanNum; // 지역 변수, 초기화 필수!
		
		System.out.println(num);
		// 매개 변수는 외부에서 전달한 값을 받아와 초기화 되어있음.
		
		System.out.println(globalNum);
	}
	
	public void method2() {
		System.out.println(globalNum);
//		System.out.println(localNum);
//		System.out.println(num);
	}

}
