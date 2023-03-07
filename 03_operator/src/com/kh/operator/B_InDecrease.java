package com.kh.operator;

public class B_InDecrease {
	public void method1() {
		// 전위형 증감 연산자
		int num1 = 10;
		
		System.out.println("전위 증감 연산자 적용 전 : " + num1); // 10
		System.out.println("++num1 1회 수행 : " + ++num1); // 11
		System.out.println("++num1 2회 수행 : " + ++num1); // 12
		System.out.println("++num1 3회 수행 : " + ++num1); // 13
		System.out.println("++num1 4회 수행 : " + ++num1); // 14
		System.out.println("++num1 5회 수행 : " + ++num1); // 15
		System.out.println("전위 증감 연산자 적용 후 : " + num1); // 15
		
		// 후위형 증감 연산자
		int num2 = 10;
		
		System.out.println("후위 증감 연산자 적용 전 : " + num2); // 10
		System.out.println("num2++ 1회 수행 : " + num2++); // 10
		System.out.println("num2++ 2회 수행 : " + num2++); // 11
		System.out.println("num2++ 3회 수행 : " + num2++); // 12
		System.out.println("num2++ 4회 수행 : " + num2++); // 13
		System.out.println("num2++ 5회 수행 : " + num2++); // 14
		System.out.println("후위 증감 연산자 적용 후 : " + num2); // 15
		
	}
	public void method2() {
		
		int num1 = 20;
		int result1 = num1++ *3;
		System.out.println("result1 : " + result1); // 60
		System.out.println("num1 : " + num1); // 21
		
		int num2 = 20;
		int result2 = ++num2 *3;
		System.out.println("result2 : " + result2); // 63
		System.out.println("num2 : " + num2); // 21
		
		System.out.println();
		
	}
	public void method3() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++); // 10, a=11
		System.out.println((++a) + (b++)); // 32, a=12, b=21
		System.out.println((a++) + (--b) + (--c)); // 61, 12+20+29
		//					a=13	b=20	c=29		
		System.out.println("a : " + a); // 13
		System.out.println("b : " + b); // 20
		System.out.println("c : " + c); // 29
		
	}
	
}
