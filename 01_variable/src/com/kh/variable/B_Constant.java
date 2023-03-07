package com.kh.variable;

public class B_Constant {
	public void finalConstant() {
		// 메서드 선언
		
		int age; // 일반 변수 선언
		final int AGE; // 상수 선언 (자료형 앞의 final, 대문자)
		
		age = 20;
		AGE = 20;
		
		System.out.println("age = " + age);
		System.out.println("AGE = " + AGE);
		
		age = 30; // 일반 변수는 초기화 가능
//		AGE = 30; ≫ 상수이므로 더 이상 초기화 불가능
		
		System.out.println("변경 후 age : " + age);
		System.out.println("상수 값은 한 번 기록 후 값 변경 불가능");
		
	}

}
