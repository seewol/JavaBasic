package com.kh.example.chap01_throws.controller;

public class ThrowsController {
	public void method1() throws Exception {
		System.out.println("method1() 호출됨...");
		method2();
		System.out.println("method1() 종료됨...");
	}
	public void method2() throws Exception {
		System.out.println("method2() 호출됨...");
		method3();
		System.out.println("method2() 종료됨...");
	}
	public void method3() throws Exception {
		System.out.println("method3() 호출됨...");
		throw new Exception();	// Exception 타입의 예외 강제 발생
//		System.out.println("method3() 종료됨...");
		// 예외가 발생한 코드 밑에 나온 코드는 Unreachable code
		// 앞전에 예외가 발생했기 때문에 도달할 수 없는 것이다
	}
}
