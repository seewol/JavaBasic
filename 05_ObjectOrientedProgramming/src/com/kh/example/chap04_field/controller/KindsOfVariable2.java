package com.kh.example.chap04_field.controller;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

public class KindsOfVariable2 {
	
	public static int staticNum; // 클래스 변수 = static 변수
	
	private int testNum = 10;
	private static int staticTestNum = 10;
	
	public void test() {
		testNum++;	// 인스턴스 변수
		System.out.println("testNum : " + testNum);
		staticTestNum++;	// 클래스 변수
		System.out.println("staticTestNum : " + staticTestNum);
		
//		System.out.println(staticNum); // static 변수 값 공동 공유
	}
	

}
